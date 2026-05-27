package com.studymate.ai

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class StudyMateApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialization code here
    }
}
