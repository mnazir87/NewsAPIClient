package com.example.newapiclient.presentation.di



import com.example.newapiclient.data.api.NewsAPIService
import com.example.newapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.example.newapiclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {
    @Singleton
    @Provides
    fun prodivesNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
        return  NewsRemoteDataSourceImpl(newsAPIService)
    }
}
