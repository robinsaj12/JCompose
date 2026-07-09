package com.example.jetpactcompose.ConstrainLayout

import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
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
        val horizontalGuideline1 = createGuidelineFromTop(0.45f)


        BackgroundGradient(modifier = Modifier.constrainAs(gradientBackground){
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            bottom.linkTo(horizontalGuideline1)
            width= Dimension.fillToConstraints
            height= Dimension.fillToConstraints
        })

        //Header
        val guideLineTop = createGuidelineFromTop(16.dp)
        val guideLineStart = createGuidelineFromStart(16.dp)
        val guideLineEnd  = createGuidelineFromEnd(16.dp)

        createHorizontalChain(

        )

        ProfileImage(modifier = Modifier)
    }
}
//Backgound
@Composable
fun BackgroundGradient(modifier: Modifier){
    Image(painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "main backgorund",
        contentScale = ContentScale.FillBounds,
        modifier = modifier
        )
}
//Header
@Composable
fun ProfileImage(modifier: Modifier){
    Image(painter = painterResource(R.drawable.user),
        contentDescription = "Profile",
        modifier =modifier.padding(start = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
        )
}
@Composable
fun NotificationImage(modifier: Modifier){
    Image(painter = painterResource(R.drawable.bell),
        contentDescription = "Bell",
        modifier=modifier.padding(end = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
        )
}