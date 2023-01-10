package com.example.newapiclient.domain.usecase

import com.example.newapiclient.data.model.Article
import com.example.newapiclient.domain.repository.NewsRepository


class DeleteSavedNews(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}