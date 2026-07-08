package com.example.jetpactcompose.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Button(onClick = {/*Todo*/}) {
            Text("Profile")
        }
        Button(onClick = {/*Todo*/}) {
            Text("Settings")
        }
    }
}