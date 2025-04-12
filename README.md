# 💬 Chat App

**Chat** is a simple Android application that demonstrates real-time messaging using a custom WebSocket-based library called `chatlibrary`.

---

## 📱 Demo

https://drive.google.com/file/d/1SICUciBNLlFh5hXI-P7QLZPjdEQbDONR/view?usp=sharing
---

## 📦 Chat Library

This project integrates a custom Android library for chat functionality, published via GitHub Packages.

🔗 [chatlibrary repository](https://github.com/aiiisana/chat-library)

---

## 🚀 Features

- Real-time chat via WebSocket
- Simple UI with RecyclerView
- Easy integration via Gradle
- Built with ViewBinding

---

## 🛠️ Technologies Used

- Kotlin
- Android SDK
- WebSocket (OkHttp)
- Gradle (Kotlin DSL)
- GitHub Packages (for library publishing)

---

## 🔧 How to Use the Library

In your `settings.gradle.kts`:

```kotlin
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
