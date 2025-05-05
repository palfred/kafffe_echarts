import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    kotlin("multiplatform") version "2.0.10"
    id("maven-publish")
    id("com.github.ben-manes.versions") version "0.51.0"
}

group = "dk.rheasoft"
val workingOnVersion = "1.1"

// Setup SNAPSHOT version if not on master branch.
val githubBranch: String? by project
println("Gradle working on branch : $githubBranch")
version = workingOnVersion + if ("master".equals(githubBranch)) "" else "-SNAPSHOT"
println("Gradle working on version: ${project.version}")

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
            implementation("dk.rheasoft:kafffe:1.7")
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

tasks.register("checkForSnapshots") {
    group = "verification"
    description = "Check whether there are any SNAPSHOT dependencies or this project is a SNAPSHOT."
    doLast {
        val allViolations =
            project.configurations
                .filter { it.isCanBeResolved }
                .flatMap { configuration ->
                    configuration.resolvedConfiguration.resolvedArtifacts
                        .map { it.moduleVersion.id }
                        .filter { it.version.endsWith("-SNAPSHOT") }
                }
                .map { "$it" }
                .toSet()
        if (allViolations.isNotEmpty()) {
            val violationsString = allViolations.joinToString("\n")
            error("Snapshot dependencies found for this project version ${project.version}:\n$violationsString")
        }
        if (project.version.toString().endsWith("-SNAPSHOT")) {
            error("The project is self a SNAPSHOT:\n${project.version}")
        }
    }
}


publishing {
    repositories {
        maven {
            name = "Kafffe"
            url = uri("https://maven.pkg.github.com/palfred/kafffe_echarts") // Github Package
            credentials {
                val githubUser: String by project
                val githubToken: String by project
                username = githubUser
                password = githubToken

            }
        }
    }

    publications {
        create<MavenPublication>("kotlin") {
            from(components["kotlin"])

            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

        }
    }
}
