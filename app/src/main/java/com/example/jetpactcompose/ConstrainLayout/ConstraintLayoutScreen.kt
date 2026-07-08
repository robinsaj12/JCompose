package com.example.jetpactcompose.ConstrainLayout

import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.jetpactcompose.R

@Composable
fun ConstraintLayoutScreenApp(){
    ConstraintLayout(modifier = Modifier
        .background(MaterialTheme.colorScheme.surface)
        .fillMaxSize()
        //Enable Vertical Scrolling
        .verticalScroll(rememberScrollState())
    ) {
        val(gradientBackground) = createRefs()
        //Guidlline
    }
}

@Composable
fun BackgroundGradient(modifier: Modifier){
    Image(painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "main backgorund",
        contentScale = modifier.
        )
}