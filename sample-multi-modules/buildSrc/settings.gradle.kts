pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }

    val versionFile = rootDir.parentFile.parentFile.resolve("plugins/version.txt")
    val pluginsVersion = versionFile.readLines().first()

    @Suppress("UnstableApiUsage")
    plugins {
        id("com.upstart.refreshVersions").version(pluginsVersion)
    }
}

plugins {
    id("com.upstart.refreshVersions")
}
