package com.example.jetpactcompose.retrofit.repository

import androidx.compose.material3.rememberTimePickerState
import com.example.jetpactcompose.retrofit.Comment
import com.example.jetpactcompose.retrofit.Post
import com.example.jetpactcompose.retrofit.RetrofitInstance

class PostRepository {

    private val apiService = RetrofitInstance.api

    suspend fun getPosts():List<Post>{
        return apiService.getPosts()
    }
    suspend fun getComments():List<Comment>{
        return apiService.getComments()
    }

}