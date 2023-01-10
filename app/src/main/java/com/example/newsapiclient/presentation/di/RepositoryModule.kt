package com.example.newapiclient.presentation.di



import com.example.newapiclient.data.repository.NewsRepositoryImpl
import com.example.newapiclient.data.repository.dataSource.NewsRemoteDataSource

import com.example.newapiclient.domain.repository.NewsRepository


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ) : NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }

}