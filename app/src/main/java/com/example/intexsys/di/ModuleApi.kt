package com.example.intexsys.di

import com.example.intexsys.network.IntexsysApi
import com.example.intexsys.network.IntexsysService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {
    private val api: IntexsysApi = IntexsysApi()

    @Singleton
    @Provides
    fun intexsysApi(): IntexsysService = api.buildService(IntexsysService::class.java)
}
