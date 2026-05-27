package com.studymate.ai.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Auth : Screen("auth_screen")
    object Home : Screen("home_screen")
    object Chat : Screen("chat_screen")
    object OCR : Screen("ocr_screen")
    object PDF : Screen("pdf_screen")
    object Task : Screen("task_screen")
    object Note : Screen("note_screen")
}
