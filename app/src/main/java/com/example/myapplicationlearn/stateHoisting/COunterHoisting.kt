package com.example.myapplicationlearn.stateHoisting

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CounterApplication(){
    var count by remember {
        mutableStateOf(0)
    }
    Column(
        modifier= Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$count")
        Counter(counter = count, onIncrement = {count++})
        resetCount (onReset = {count=0})
    }

}

@Composable
fun Counter(counter:Int,onIncrement:()->Unit){
    Button(onClick = {
        onIncrement()
    }) {
        Text(text = "Count")
    }
}

@Composable
fun resetCount(onReset:()->Unit){
    Button(onClick = { onReset() }) {
        Text(text = "Reset")
    }
}