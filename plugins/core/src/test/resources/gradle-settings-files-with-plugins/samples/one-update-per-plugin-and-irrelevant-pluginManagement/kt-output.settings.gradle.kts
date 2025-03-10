pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        maven(url = "https://dl.bintray.com/jmfayard/maven")
    }

    val versionFile = rootDir.parentFile.resolve("plugins/version.txt")
    val pluginsVersion = versionFile.readLines().first()

    @Suppress("UnstableApiUsage")
    plugins {
        id("com.upstart.refreshVersions").version(pluginsVersion)
    }
}

plugins {
    id("com.example.one") version "0.1"
////                  # available:"0.1.1"
    id("com.example.two") version "1.2.0-beta02"
////                  # available:"1.2.0-beta03"
    id("com.upstart.refreshVersions")
}

rootProject.name = "Whatever"
