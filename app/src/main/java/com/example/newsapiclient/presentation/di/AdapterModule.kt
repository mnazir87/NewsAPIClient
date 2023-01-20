package com.example.newsapiclient.presentation.di

import android.app.Application
import com.example.newsapiclient.presentation.adapter.NewsAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {
    @Provides
    @Singleton
    fun provideNewsAdapter(): NewsAdapter{
        return NewsAdapter()
    }
}