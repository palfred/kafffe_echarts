import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    kotlin("multiplatform") version "2.0.10"
}

group = "dk.rheasoft"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/palfred/kafffe") // Github Package
        credentials {
            val githubUser: String by project
            val githubToken: String by project
            username = githubUser
            password = githubToken

        }
    }
    mavenCentral()
}

kotlin {
    js {
        browser {
            // Optional: Configure browser-specific settings
        }
        binaries.executable()
    }
    sourceSets {
        jsMain.dependencies {
            implementation("dk.rheasoft:kafffe:1.7-SNAPSHOT")
            implementation(npm("echarts", "5.5.1"))
        }
    }
}

// Disable Kotlin JS requirement of "gradlew kotlinUpgradeYarnLock" when dependencies has changed:
rootProject.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin::class.java) {
    rootProject.the<YarnRootExtension>().yarnLockMismatchReport = YarnLockMismatchReport.NONE
    rootProject.the<YarnRootExtension>().reportNewYarnLock = false // true
    rootProject.the<YarnRootExtension>().yarnLockAutoReplace = true // true
}