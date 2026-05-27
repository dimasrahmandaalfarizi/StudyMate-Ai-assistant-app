package com.studymate.ai.domain.model

data class User(
    val id: String,
    val email: String,
    val name: String? = null
)
