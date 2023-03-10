package com.example.newsapiclient.data.repository

import com.example.newsapiclient.data.model.APIResponse
import com.example.newsapiclient.data.model.Article
import com.example.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsapiclient.data.util.Resource
import com.example.newsapiclient.domain.repository.NewsRepository

import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val remoteDataSource: NewsRemoteDataSource
): NewsRepository {
    suspend fun responseToResource(response: Response<APIResponse>): Resource<APIResponse> {
        if(response.isSuccessful){
            response.body()?.let { result->
                return Resource.Success(result)

            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun getNewsHeadlines(country: String, page : Int): Resource<APIResponse> {

        return responseToResource(remoteDataSource.getTopHeadlines(country,page))
    }
    override suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}