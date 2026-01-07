pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx\\..*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Glint"

// Core UI Module
include(":core-ui")
project(":core-ui").projectDir = file("modules/core-ui")

// Components Module
include(":components")
project(":components").projectDir = file("modules/components")

// Catalog Module
include(":catalog")
project(":catalog").projectDir = file("modules/catalog")
