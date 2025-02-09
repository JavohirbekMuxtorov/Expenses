pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io") // Bu joyda ham qolsa bo‘ladi, lekin asosiy joy dependencyResolutionManagement bo‘lishi kerak
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // ❗ BU JOYGA QO‘SHISH KERAK
    }
}

rootProject.name = "Expenses"
include(":app")
 