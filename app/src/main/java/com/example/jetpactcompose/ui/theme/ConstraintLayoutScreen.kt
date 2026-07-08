package com.example.jetpactcompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.fromColorLong
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.navArgument

@Composable
fun ConstraintLayoutScreen(){
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        //refrences
        val (box1, box2, text) = createRefs()

        val guiideline1 = createGuidelineFromStart(0.15f)
        val guideline2 = createGuidelineFromEnd(0.15f)

        Box(modifier = Modifier.size(100.dp)
            .background(Color.Red)
            .constrainAs(box1){
                top.linkTo(parent.top, margin = 16.dp)
//                start.linkTo(parent.start, margin = 16.dp)
                start.linkTo(guiideline1)

            }

        )
        Box(modifier = Modifier.size(200.dp)
            .background(Color.Red)
            .constrainAs(box2){
                top.linkTo(box1.bottom, margin = 16.dp)
                start.linkTo(guiideline1)
            }

        )

        Text("this is Text", modifier = Modifier.constrainAs(text){
            top.linkTo(box2.bottom, margin = 16.dp)
            end.linkTo(guideline2)

        })


        createVerticalChain(
            box1, box2,
            chainStyle = ChainStyle.Packed

        )
    }
}