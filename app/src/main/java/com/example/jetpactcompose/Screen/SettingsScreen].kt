package com.example.jetpactcompose.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable

fun SettingsScreen(){
    Column {
        Text("Setting Screen")
        Button(onClick = {/*Todo*/}) {
            Text("Navigate to Home")
        }
    }

}