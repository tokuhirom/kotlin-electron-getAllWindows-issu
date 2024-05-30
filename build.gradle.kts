plugins {
    kotlin("multiplatform") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        moduleName = "main"
        nodejs {
        }
        useEsModules()
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting {
        }
        val jsMain by getting {
            dependencies {
                implementation(project.dependencies.platform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.754"))
                implementation("org.jetbrains.kotlin-wrappers:kotlin-electron")
            }
        }
    }
}

