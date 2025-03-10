pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        maven(url = "https://dl.bintray.com/jmfayard/maven")
    }

    val versionFile = rootDir.parentFile.resolve("plugins/version.txt")
    val pluginsVersion = versionFile.readLines().first()

    /*
    I'm big comment 1
     */
    // Hey, I'm user comment 0
    @Suppress("UnstableApiUsage")
    plugins /**/ {
        // Hey, I'm user comment 1
        id("com.upstart.refreshVersions").version(pluginsVersion)
        /*
        /*
        I'm big comment 2
        */*/
        // Hey, I'm user comment 2
        id ( "com.example.zero" ) . version (
                 "1.0.0"
//// # available:"1.0.1"
)
        // Hey, I'm user comment 3
    }
    // Hey, I'm user comment 4
}
// Hey, I'm user comment 5

// Hey, I'm user comment 6
plugins {
    // Hey, I'm user comment 7
    id(
        "com.example.one"
    ).version(
                 "0.1"
//// # available:"0.1.1"
)
    // Hey, I'm user comment 8
    id("com.example.two") version "0.4"
////                  # available:"0.4.1"
////                  # available:"0.5"
////                  # available:"1.0.0-alpha-01"
////                  # available:"1.0.0-alpha-02"
////                  # available:"1.0.0-alpha-03"
////                  # available:"1.0.0-beta-01"
////                  # available:"1.0.0-beta-02"
////                  # available:"1.0.0-rc-01"
////                  # available:"1.0.0"
////                  # available:"1.1.0"
////                  # available:"1.1.1"
////                  # available:"1.2.0-alpha01"
////                  # available:"1.2.0-alpha02"
////                  # available:"1.2.0-alpha03"
////                  # available:"1.2.0-alpha04"
////                  # available:"1.2.0-beta01"
////                  # available:"1.2.0-beta02"
////                  # available:"1.2.0-beta03"
    // Hey, I'm user comment 9
    id("com.upstart.refreshVersions")
    // Hey, I'm user comment 10
}
// Hey, I'm user comment 11

rootProject.name = "Whatever"
