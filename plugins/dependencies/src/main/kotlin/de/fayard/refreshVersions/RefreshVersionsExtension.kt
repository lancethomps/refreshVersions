package de.fayard.refreshVersions

import de.fayard.refreshVersions.core.DependencySelection
import de.fayard.refreshVersions.core.FeatureFlag
import groovy.lang.Closure
import java.io.File
import org.gradle.api.Action
import org.gradle.api.Incubating

open class RefreshVersionsExtension {

    var versionsPropertiesFile: File? = null
    var extraArtifactVersionKeyRules: List<String> = emptyList()
    var versionAutoUpdates: Set<Regex> = emptySet()
    internal var isBuildSrcLibsEnabled = false
    internal var versionRejectionFilter: (DependencySelection.() -> Boolean)? = null

    @Incubating
    fun enableBuildSrcLibs() {
        isBuildSrcLibsEnabled = true
    }

    fun extraArtifactVersionKeyRules(file: File) {
        extraArtifactVersionKeyRules = extraArtifactVersionKeyRules + file.readText()
    }

    fun extraArtifactVersionKeyRules(rawRules: String) {
        extraArtifactVersionKeyRules = extraArtifactVersionKeyRules + rawRules
    }

    fun featureFlags(extension: Action<FeatureFlagExtension>) {
        extension.execute(FeatureFlagExtension())
    }

    fun rejectVersionIf(filter: Closure<Boolean>) {
        versionRejectionFilter = {
            filter.delegate = this
            filter.call()
        }
    }

    fun rejectVersionIf(filter: DependencySelection.() -> Boolean) {
        versionRejectionFilter = filter
    }

    fun versionAutoUpdates(regexes: Set<Regex>) {
        versionAutoUpdates = regexes
    }
}

open class FeatureFlagExtension {
    fun enable(flag: FeatureFlag) {
        FeatureFlag.userSettings[flag] = true
    }

    fun disable(flag: FeatureFlag) {
        FeatureFlag.userSettings[flag] = false
    }
}
