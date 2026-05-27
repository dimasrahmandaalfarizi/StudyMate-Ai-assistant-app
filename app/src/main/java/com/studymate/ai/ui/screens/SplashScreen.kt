package com.studymate.ai.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigateToAuth: () -> Unit,
    onNavigateToHome: () -> Unit
) {
    LaunchedEffect(key1 = true) {
        delay(2000L) // 2 seconds delay
        // For now, let's navigate to Auth directly since no auth logic is implemented yet
        onNavigateToAuth()
    }
    
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "StudyMate AI",
            style = MaterialTheme.typography.displayLarge,
            color = MaterialTheme.colorScheme.primary
        )
    }
}
