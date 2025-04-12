pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/aiiisana/chat-library")
            credentials {
                username = providers.gradleProperty("gpr.user").orNull ?: System.getenv("USERNAME_GITHUB")
                password = providers.gradleProperty("gpr.key").orNull ?: System.getenv("TOKEN_GITHUB")
            }
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "Chat"
include(":app")
include(":chatlibrary")
