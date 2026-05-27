package com.studymate.ai.di

import com.studymate.ai.data.repository.AuthRepositoryImpl
import com.studymate.ai.domain.repository.AuthRepository
import com.studymate.ai.domain.usecase.AuthUseCases
import com.studymate.ai.domain.usecase.CheckSessionUseCase
import com.studymate.ai.domain.usecase.LoginUseCase
import com.studymate.ai.domain.usecase.LogoutUseCase
import com.studymate.ai.domain.usecase.RegisterUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository
}

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideAuthUseCases(repository: AuthRepository): AuthUseCases {
        return AuthUseCases(
            login = LoginUseCase(repository),
            register = RegisterUseCase(repository),
            logout = LogoutUseCase(repository),
            checkSession = CheckSessionUseCase(repository)
        )
    }
}
