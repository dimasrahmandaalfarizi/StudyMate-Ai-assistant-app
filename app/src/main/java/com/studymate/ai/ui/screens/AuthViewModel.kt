package com.studymate.ai.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.studymate.ai.domain.usecase.AuthUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class AuthState {
    object Idle : AuthState()
    object Loading : AuthState()
    object Success : AuthState()
    data class Error(val message: String) : AuthState()
}

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authUseCases: AuthUseCases
) : ViewModel() {

    private val _authState = MutableStateFlow<AuthState>(AuthState.Idle)
    val authState: StateFlow<AuthState> = _authState.asStateFlow()

    fun login(email: String, password: String) = viewModelScope.launch {
        if (email.isBlank() || password.isBlank()) {
            _authState.value = AuthState.Error("Email and Password cannot be empty")
            return@launch
        }
        
        _authState.value = AuthState.Loading
        val result = authUseCases.login(email, password)
        result.onSuccess {
            _authState.value = AuthState.Success
        }.onFailure {
            _authState.value = AuthState.Error(it.message ?: "Login failed")
        }
    }

    fun register(email: String, password: String) = viewModelScope.launch {
        if (email.isBlank() || password.isBlank()) {
            _authState.value = AuthState.Error("Email and Password cannot be empty")
            return@launch
        }
        
        _authState.value = AuthState.Loading
        val result = authUseCases.register(email, password)
        result.onSuccess {
            _authState.value = AuthState.Success
        }.onFailure {
            _authState.value = AuthState.Error(it.message ?: "Registration failed")
        }
    }
    
    fun resetState() {
        _authState.value = AuthState.Idle
    }
}
