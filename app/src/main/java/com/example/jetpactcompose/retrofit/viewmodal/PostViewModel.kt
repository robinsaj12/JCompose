package com.example.jetpactcompose.retrofit.viewmodal

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpactcompose.retrofit.Comment
import com.example.jetpactcompose.retrofit.Post
import com.example.jetpactcompose.retrofit.repository.PostRepository
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    private val repository = PostRepository()


    var posts by mutableStateOf<List<Post>>(emptyList())
        private set
    var comments  by mutableStateOf<List<Comment>>(emptyList())
        private set

//    init {
//        viewModelScope.launch {
//            val  fetchdPosts = repository.getPosts()
//
//            posts = fetchdPosts
//
//            val fetchComment = repository.getComments()
//
//            comments =fetchComment
//        }
//
//
//
//    }

    fun fetchPosts(){
        viewModelScope.launch {
            val fetchPosts = repository.getPosts()
            posts = fetchPosts
            comments = emptyList()
        }
    }
    fun fetchComments(){
        viewModelScope.launch {
            val fetchComments = repository.getComments()
            comments = fetchComments
            posts = emptyList()
        }
    }

}