package com.example.newapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newapiclient.domain.usecase.GetNewsHeadlines


class NewsViewModelFactory(
    private val app: Application,
    private val getNewsHeadlines : GetNewsHeadlines
) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(
            app,
            getNewsHeadlines
        ) as T
    }
}