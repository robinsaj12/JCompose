package com.example.jetpactcompose.retrofit.screens

import androidx.compose.runtime.Composable
import com.example.jetpactcompose.retrofit.Comment
import com.example.jetpactcompose.retrofit.viewmodal.PostViewModel

@Composable
//fun CommentListRender(viewModel: PostViewModel){
//    val comments  = viewModel.comments
//    CommentListScreen(comments = comments)
//}

fun CommentListRender(comments: List<Comment>){

    CommentListScreen(comments = comments)
}