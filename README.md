# StudyMate AI 🎓

StudyMate AI is a modern Android-based AI Study Assistant application designed to help university students improve productivity, understand academic material faster, and manage study activities in one integrated platform.

## 🚀 Features

- **🤖 AI Chat Assistant**: An intelligent academic companion powered by Google Gemini to explain concepts and answer study questions.
- **📸 OCR Question Scanner**: Scan academic questions using ML Kit Text Recognition and send them directly to the AI for step-by-step explanations.
- **📄 PDF Summarizer**: Upload study materials and let AI generate concise summaries.
- **✅ Task Management**: Organize academic workloads and track deadlines.
- **📝 Notes System**: Create, manage, and sync study notes to the cloud.

## 🛠 Tech Stack

- **UI**: Jetpack Compose (Material 3)
- **Language**: Kotlin
- **Architecture**: Clean Architecture + MVVM + Repository Pattern
- **Dependency Injection**: Hilt
- **Backend & Auth**: Supabase
- **AI Integration**: Google Gemini API
- **OCR**: ML Kit Text Recognition
- **Local Database**: Room
- **Networking**: Retrofit & Ktor

## 📁 Architecture Overview

The app follows strict Clean Architecture principles separated into:
- **Presentation Layer** (`ui`): Screens, ViewModels, and Navigation.
- **Domain Layer** (`domain`): Business logic, Use Cases, and Domain Models.
- **Data Layer** (`data`): Repositories, Local DB, and Remote APIs.
- **AI Layer** (`ai`): Gemini-specific services and prompt handling.

## 📱 Getting Started

1. Clone this repository:
   ```bash
   git clone https://github.com/dimasrahmandaalfarizi/StudyMate-Ai-assistant-app.git
   ```
2. Open the project in **Android Studio**.
3. Let Gradle sync the dependencies.
4. Run the app on an emulator or a physical device.

---
*Built with ❤️ for better learning and productivity.*
