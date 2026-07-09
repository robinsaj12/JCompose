package com.example.jetpactcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpactcompose.ConstrainLayout.ConstraintLayoutScreenApp
import com.example.jetpactcompose.ui.theme.ConstraintLayoutScreen
import com.example.jetpactcompose.ui.theme.JetpactComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            JetpactComposeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//            Counter()
//            var text by remember { mutableStateOf("") }
//            StatelessTextField(text, {newText -> text = newText})
//            SetNavigator()
            ConstraintLayoutScreenApp()

        }
    }
}

//
////NavController
//@Preview
//@Composable
//fun SetNavigator(){
//    val navController = rememberNavController()
//
//    NavHost(
//        navController=navController,
//        startDestination = "first"
//    ){
//        composable("first") {
//            FirstScreen(navController)
//        }
//        composable(
//            route="second/{userName}",
//            arguments = listOf(
//                navArgument("userName"){
//                    type= NavType.StringType
//                }
//            )) {
//
//
//            backStackEntry->
//            val userName=
//
//            SecondScreen(navController,
//                backStackEntry.arguments?.getString("userName").toString())
//        }
//
//    }
//}
//
//@Composable
//fun FirstScreen(navController: NavController){
//Column (modifier = Modifier.padding(40.dp)){
//    Text(text = "fist Screen")
//    var enteredText by remember {
//        mutableStateOf("")
//    }
//
//    TextField(
//        value = enteredText,
//        onValueChange = {enteredText=it}
//    )
//
//
//    Button(onClick = {navController.navigate("Second/$enteredText")}) {
//        Text(text = "Next")
//    }
//}
//}
//
//@Composable
//fun SecondScreen(navController: NavController, userName: String){
//    Column (modifier = Modifier.padding(40.dp)){
//        Text(text = "Second Screen")
//        Text(text = "userName: $userName")
//        Button(onClick = {navController.navigate("First")}) {
//            Text(text = "click to first Screen")
//        }
//    }
//}



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    JetpactComposeTheme {
//        Greeting("Android")
//    }
//}
////remember,  mutable state of,  value
//@Composable
//fun Counter (){
//    //remember / mutable state of .value ,
//    var count = remember{ mutableStateOf(0)}
//    Column {
//        Text("The counter : ${count.value}")
//        Button(onClick = {
//            count.value++
//            Log.v("Tagy", "Counger value: ${count.value}")
//        }) {
//            Text("Increase counter")
//
//        }
//    }
//}
//
////stateless
//@Composable
//fun StatelessTextField(
//    text: String,
//    onTextChanged:(String)->Unit
//){
//    Column {
//        TextField(
//            value = text,
//            onValueChange = onTextChanged,
//            label =   {Text("type here")}
//        )
//        Text("You Typed : $text")
//    }
//}
