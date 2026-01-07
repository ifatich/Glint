import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.hilt.android) apply false
}

subprojects {
    plugins.withId("java") {
        configure<JavaPluginExtension> {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }

    plugins.withId("kotlin") {
        configure<org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension> {
            jvmToolchain(17)
        }
    }

    tasks.withType<Test>().configureEach {
        testLogging {
            events(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            showStandardStreams = false
        }
    }

    // Common code quality checks
    plugins.withId("com.android.library") {
        configure<com.android.build.gradle.LibraryExtension> {
            compileSdk = 34

            defaultConfig {
                minSdk = 24
                targetSdk = 34
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                consumerProguardFiles("consumer-rules.pro")
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }

            kotlinOptions {
                jvmTarget = "17"
                freeCompilerArgs = listOf(
                    "-opt-in=kotlin.RequiresOptIn"
                )
            }

            buildFeatures {
                buildConfig = true
            }

            lint {
                targetSdk = 34
                baseline = file("lint-baseline.xml").takeIf { it.exists() }
            }
        }
    }

    plugins.withId("com.android.application") {
        configure<com.android.build.gradle.AppExtension> {
            compileSdkVersion(34)

            defaultConfig {
                minSdk = 24
                targetSdk = 34
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }

            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }
}

// Task to clean all build directories
tasks.register("cleanAll") {
    dependsOn(":clean")
    doLast {
        subprojects {
            delete(buildDir)
        }
    }
}

// Task to print dependency tree
tasks.register("dependencyReport") {
    doLast {
        println("===== Dependency Report =====")
        subprojects {
            println("\n${this.name}:")
            configurations.filter { it.isCanBeResolved }.forEach { config ->
                println("  ${config.name}:")
                config.resolvedConfiguration.resolvedArtifacts.forEach { artifact ->
                    println("    - ${artifact.moduleVersion.id.group}:${artifact.moduleVersion.id.name}:${artifact.moduleVersion.id.version}")
                }
            }
        }
    }
}
