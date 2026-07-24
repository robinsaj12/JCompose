package com.example.jetpactcompose.retrofit.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.jetpactcompose.retrofit.Comment

@Composable
fun CommentListScreen(comments: List<Comment>){
    LazyColumn {
        items(comments){
            comment-> CommentItem(comment)
        }
    }
}