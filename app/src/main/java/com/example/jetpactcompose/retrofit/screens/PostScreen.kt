package com.example.jetpactcompose.retrofit.screens

import androidx.compose.runtime.Composable
import com.example.jetpactcompose.retrofit.Post
import com.example.jetpactcompose.retrofit.viewmodal.PostViewModel

@Composable
//fun PostScreen(viewModel: PostViewModel){
//    val posts = viewModel.posts
//    PostList(posts=posts)
//}
fun PostScreen(posts: List<Post>){
//    val posts = viewModel.posts
    PostList(posts=posts)
}