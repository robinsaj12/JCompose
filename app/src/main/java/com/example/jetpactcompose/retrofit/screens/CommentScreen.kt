package com.example.jetpactcompose.retrofit.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpactcompose.retrofit.Comment

@Composable
fun CommentItem(comment: Comment){


    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = comment.name,
                style = MaterialTheme.typography.labelLarge
            )
            Text(
                text = comment.email,
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = comment.body,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}