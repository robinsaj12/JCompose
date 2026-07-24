package com.example.jetpactcompose.ComposePract

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
