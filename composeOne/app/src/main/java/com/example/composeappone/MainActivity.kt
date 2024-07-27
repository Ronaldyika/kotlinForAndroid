package com.example.composeappone

import android.graphics.Color
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeappone.ui.theme.ComposeAppOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Ronald")
        }
    }
}

@Composable
fun Greeting(name: String
) {
    Text(text = "Hello $name!")
}


@Composable
fun MainRegisterBody(
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.LightGray)
            .padding(1.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("welcome To Flashlight",
        style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(16.dp)
        )
        var username:String by remember{ mutableStateOf("") }
        var email:String by remember{ mutableStateOf("") }
        var password:String by remember{ mutableStateOf("") }

        TextField(value = username, onValueChange ={username = it},
        label = {Text("enter username")}, shape = RoundedCornerShape(16.dp)
        )
        TextField(value = email, onValueChange ={email = it},
        label = {Text("enter a valid email")}, shape = RoundedCornerShape(16.dp)
        )
        TextField(value = password, onValueChange ={password=it},
        label = {Text("enter password")},
        shape = RoundedCornerShape(16.dp)
        )


        Button(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = androidx.compose.ui.graphics.Color.Magenta
            )
        ) {
            Text("Register", modifier = Modifier
                .clickable {
                           println("the username is $username")
                },
            )

        }
    }

//    Card(modifier = Modifier
//        .fillMaxSize()
//        .background(androidx.compose.ui.graphics.Color.LightGray)
//        .padding(1.dp)) {
//        Card(
//            modifier = Modifier.width(100.dp)
//                .heightIn(30.dp)
//        ) {
//            Column() {
//                Text(text = "Ronald")
//            }
//
//        }
//        Card(
//            modifier = Modifier
//                .background(androidx.compose.ui.graphics.Color.Magenta)
//                .padding(2.dp)
//                .width(300.dp)
//                .fillMaxHeight()
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(androidx.compose.ui.graphics.Color.Cyan),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "Ronald YIka")
//
//            }
//
//        }
//
//    }
//
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainRegisterBody()
}