package com.example.newsapiclient.presentation.di

import android.app.Application
import com.example.newsapiclient.domain.usecase.GetNewsHeadlines
import com.example.newsapiclient.presentation.viewmodel.NewsViewModelFactory

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class FactoryModule {
    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlines
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase
        )
    }
}