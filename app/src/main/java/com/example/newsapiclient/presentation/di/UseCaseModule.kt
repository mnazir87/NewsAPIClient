package com.example.newapiclient.presentation.di

import com.example.newapiclient.domain.repository.NewsRepository
import com.example.newapiclient.domain.usecase.GetNewsHeadlines

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetNewsheadLinesUseCase(
        newsRepository: NewsRepository
    ): GetNewsHeadlines {
        return GetNewsHeadlines(newsRepository)
    }
}