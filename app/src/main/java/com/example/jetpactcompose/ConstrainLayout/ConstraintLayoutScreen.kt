package com.example.jetpactcompose.ConstrainLayout

import android.health.connect.datatypes.HeightRecord
import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
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
        val(gradientBackground, profileImage, notificationImage,
            welcomeText, questionText, joinButton, courseImg,
            myCard,
            newCoures
            ) = createRefs()
        //********************Guidlline********************
        val horizontalGuideline1 = createGuidelineFromTop(0.45f)


        BackgroundGradient(modifier = Modifier.constrainAs(gradientBackground){
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            bottom.linkTo(horizontalGuideline1)
            width= Dimension.fillToConstraints
            height= Dimension.fillToConstraints
        })

        //*****************Header*************************
        val guideLineTop = createGuidelineFromTop(28.dp)
        val guideLineStart = createGuidelineFromStart(16.dp)
        val guideLineEnd  = createGuidelineFromEnd(16.dp)

        createHorizontalChain(
            profileImage,notificationImage,
            chainStyle = ChainStyle.SpreadInside
        )

        ProfileImage(modifier = Modifier.constrainAs(profileImage){
            top.linkTo(guideLineTop)
        })
        NotificationImage(modifier = Modifier.constrainAs(notificationImage){
            top.linkTo(profileImage.top)
        })

        //****************Middle Part************************

        WelcomeText(modifier = Modifier.constrainAs(welcomeText){
            top.linkTo(profileImage.bottom, margin = 32.dp)
            start.linkTo(guideLineStart)
        })

        QuestionText(modifier = Modifier.constrainAs(questionText){
            top.linkTo(welcomeText.bottom, margin = 0.dp)
            start.linkTo(guideLineStart)
        }
        )

        JoinButton(modifier = Modifier.constrainAs(joinButton){
            top.linkTo(welcomeText.bottom, margin = 48.dp)
            start.linkTo(guideLineStart)
        })

        CourseImage(modifier = Modifier.constrainAs(courseImg){
            bottom.linkTo(horizontalGuideline1, margin = -42.dp)
            end.linkTo(guideLineEnd)
            //if you define for property but above is only two so you cant
//            width = Dimension.fillToConstraints
//            height = Dimension.fillToConstraints
            width= Dimension.value(250.dp)
            height = Dimension.value(280.dp)
        })
// **************************Card Dev********************

        MyCard(modifier = Modifier.constrainAs(myCard){
            top.linkTo(horizontalGuideline1, margin = -28.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height   = Dimension.fillToConstraints
        })

//********************Out Courses Section *************
        TextOurCourdces(modifier = Modifier.constrainAs(newCoures){
            top.linkTo(myCard.top, margin = 24.dp)
            start.linkTo(myCard.start, margin = 16.dp)
        })

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
@Composable
fun WelcomeText(modifier: Modifier){
    Text("Welcome Back!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier=modifier
        )
}
@Composable
fun QuestionText(modifier: Modifier){
    Text("what do you want to learn?",
        color = Color.Gray,
        modifier=modifier)
}
@Composable
fun JoinButton(modifier: Modifier){
    Button(onClick = {},modifier=modifier) {
        Text("Join")
    }
}

@Composable
fun CourseImage(modifier: Modifier){
    Image(painter = painterResource(R.drawable.designer),
        contentDescription = "courseImage",
        modifier=modifier
        )
}
//Cards
@Composable
fun MyCard(modifier: Modifier){
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(
            topStart = 32.dp,
            topEnd = 32.dp
        ),
        modifier = modifier
    ){}
}

//Out Cources
@Composable
fun TextOurCourdces(modifier: Modifier){
    Text(
        text = "New Courses",
        modifier = modifier,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}

@Composable
fun AndoidImage(modifer: Modifier){
    Image(painter = painterResource(R.drawable.android_img),
        contentDescription = "andoied icon Image",
        modifier =modifer
        )
}

@Composable
fun JavaImage(modifier: Modifier){
    Image(painter = painterResource(R.drawable.java_img),
        contentDescription = "java icon image",
        modifier = modifier
        )
}

@Composable
fun PythonImage(modifier: Modifier){
    Image(painter = painterResource(R.drawable.python_img),
        contentDescription = "python icon image",
        modifier = modifier
        )
}
