package com.example.jetpactcompose.retrofit

import org.w3c.dom.Comment
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<Post>

    @GET("Comments")
    suspend fun getComments(): List<com.example.jetpactcompose.retrofit.Comment>


}