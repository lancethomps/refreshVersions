pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    val versionFile = rootDir.parentFile.resolve("plugins/version.txt")
    val pluginsVersion = versionFile.readLines().first()

    @Suppress("UnstableApiUsage")
    plugins {
        id("com.upstart.refreshVersions").version(pluginsVersion)
    }
}

plugins {
    id("com.gradle.enterprise").version("3.8")
    id("com.upstart.refreshVersions")
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

rootProject.name = "sample-android"
include(":app")
