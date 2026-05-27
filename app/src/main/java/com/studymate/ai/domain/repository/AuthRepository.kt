package com.studymate.ai.domain.repository

import com.studymate.ai.domain.model.User
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<User>
    suspend fun register(email: String, password: String): Result<User>
    suspend fun logout(): Result<Unit>
    fun getSessionStatus(): Flow<Boolean>
}
