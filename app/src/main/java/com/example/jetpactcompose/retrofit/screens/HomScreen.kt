package com.example.jetpactcompose.retrofit.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.room.util.TableInfo
import com.example.jetpactcompose.retrofit.Comment
import com.example.jetpactcompose.retrofit.Post
import com.example.jetpactcompose.retrofit.viewmodal.PostViewModel

@Composable
fun HomeScreen(viewModel: PostViewModel){

    var comments = viewModel.comments
    var posts  = viewModel.posts

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "REST API",style = MaterialTheme.typography.labelLarge)

        Spacer(modifier = Modifier
            .height(16.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                viewModel.fetchPosts()
            }) {
                Text("Posts")
            }
            Button(onClick = {
                viewModel.fetchComments()
            }) {
                Text("Comments")
            }
        }

        Spacer(modifier = Modifier
            .height(16.dp))

        if (posts.isNotEmpty()){
            PostScreen(posts)
            posts  = emptyList()
        }
        if (comments.isNotEmpty()){
            CommentListRender(comments)
            comments  = emptyList()
        }
    }
}