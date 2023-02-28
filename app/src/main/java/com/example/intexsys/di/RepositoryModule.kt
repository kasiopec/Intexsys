package com.example.intexsys.di

import com.example.intexsys.repository.MainRepository
import com.example.intexsys.repository.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun mainRepository(repository: MainRepositoryImpl): MainRepository
}