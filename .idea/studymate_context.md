# StudyMate AI — Full Project Context

## Project Overview

StudyMate AI is a modern Android-based AI Study Assistant application designed to help students improve productivity, understand academic material faster, and manage study activities in one integrated platform.

The application combines:
- AI learning assistant
- OCR question scanner
- PDF summarizer
- Notes management
- Task management
- Cloud synchronization

The application is built primarily for university students and learners who need a smart and lightweight productivity ecosystem.

---

# Product Vision

To become an all-in-one AI-powered academic assistant for students.

StudyMate AI focuses on:
- improving learning efficiency
- reducing academic workload stress
- simplifying study workflows
- helping students understand concepts instead of only giving answers

---

# Product Goals

## Primary Goals
- Help students learn faster with AI assistance
- Centralize productivity tools into one app
- Create a modern and scalable Android application
- Build a strong portfolio-grade production-ready application

---

# Target Users

## Primary Users
University students:
- Software engineering students
- Computer science students
- Engineering students
- General academic students

Age range:
18–25 years old

---

# Core Features

## 1. AI Chat Assistant
An AI-powered academic assistant capable of:
- answering study questions
- explaining concepts
- helping with programming
- summarizing text
- simplifying difficult material

---

## 2. OCR Question Scanner
Allows users to:
- scan questions using camera
- extract text automatically
- send extracted text directly to AI

---

## 3. PDF Summarizer
Allows users to:
- upload PDF documents
- extract document text
- generate concise summaries using AI

---

## 4. Task Management
Allows users to:
- create tasks
- manage deadlines
- track completion status
- organize academic workload

---

## 5. Notes System
Allows users to:
- create study notes
- organize notes by subjects
- edit and delete notes
- store notes locally and in cloud

---

# Product Identity

## Personality
StudyMate AI should feel:
- intelligent
- modern
- minimal
- friendly
- academic-focused
- professional

---

# Design Direction

## UI Style
- Clean UI
- Minimal layout
- Rounded cards
- Material 3 design
- Smooth animations
- Dark mode support

---

# Technical Stack

## Frontend
- Kotlin
- Jetpack Compose

## Architecture
- MVVM
- Repository Pattern
- Clean Architecture principles

## Backend
- Supabase

## AI
- Gemini API

## OCR
- ML Kit Text Recognition

## Local Database
- Room Database

## Networking
- Retrofit

## Dependency Injection
- Hilt

---

# Architecture Overview

## Layers

### Presentation Layer
Contains:
- screens
- components
- viewmodels
- navigation

### Domain Layer
Contains:
- business logic
- use cases
- domain models

### Data Layer
Contains:
- repositories
- API services
- local database
- remote data sources

---

# Folder Structure

```plaintext
app/
├── ui/
│   ├── screens/
│   ├── components/
│   ├── navigation/
│   └── theme/
│
├── data/
│   ├── local/
│   ├── remote/
│   ├── repository/
│   └── model/
│
├── domain/
│   ├── usecase/
│   └── model/
│
├── ai/
│   ├── prompts/
│   ├── service/
│   └── repository/
│
├── di/
│
├── utils/
│
└── MainActivity.kt
```

---

# AI Context

The AI inside StudyMate AI exists specifically to help students learn and improve productivity.

The AI should:
- prioritize education
- explain concepts clearly
- encourage learning
- simplify difficult material
- maintain academic context

The AI should not:
- behave like a random chatbot
- roleplay unnecessarily
- generate harmful content
- encourage cheating

---

# Navigation Structure

```plaintext
Splash Screen
      ↓
Authentication
      ↓
Home Dashboard
 ├── AI Chat
 ├── OCR Scanner
 ├── PDF Summary
 ├── Tasks
 ├── Notes
 └── Profile
```

---

# Database Tables

## users
- id
- name
- email
- created_at

## tasks
- id
- user_id
- title
- description
- deadline
- is_completed

## notes
- id
- user_id
- title
- content
- created_at

## chat_history
- id
- user_id
- prompt
- response
- created_at

## summaries
- id
- user_id
- pdf_name
- summary_text

---

# Development Phases

## Phase 1 — Foundation
- Project setup
- Navigation
- Theme system
- Folder structure

## Phase 2 — Authentication
- Supabase integration
- Login/Register

## Phase 3 — AI Integration
- Gemini API
- Chat system

## Phase 4 — Productivity Features
- Tasks
- Notes

## Phase 5 — Smart Features
- OCR Scanner
- PDF Summary

## Phase 6 — Finalization
- Testing
- Optimization
- Bug fixing
- UI polishing

---

# Future Expansion

Potential future features:
- AI flashcard generator
- AI quiz maker
- Gamification system
- Voice assistant
- Study analytics
- Calendar integration
- Cross-platform version

---

# Success Metrics

The project is considered successful if users can:
- login successfully
- communicate with AI
- scan academic questions
- summarize PDFs
- manage tasks
- create notes
- use the app smoothly without major issues

---

# Developer Notes

This project should:
- follow scalable architecture
- maintain clean code practices
- prioritize maintainability
- use reusable components
- keep AI responses context-aware
