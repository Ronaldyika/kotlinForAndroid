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
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun DisplayCard(title:String){
    Text("helo $title")
    Card( modifier = Modifier.background(androidx.compose.ui.graphics.Color.Gray)
        .padding(1.dp)
        .border()) {
        Text(text = "your invited")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .width(300.dp)
            .heightIn(10.dp)
            .padding(2.dp)
            .background(androidx.compose.ui.graphics.Color.Green)
            .clickable {
            },
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Greeting("Ronald" )
        DisplayCard("yika")
        
    }
}