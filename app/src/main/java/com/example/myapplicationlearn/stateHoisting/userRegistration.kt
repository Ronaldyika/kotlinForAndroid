package com.example.myapplicationlearn.stateHoisting

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun userFields(){
    var fname by remember {
        mutableStateOf("")
    }
    var lName by remember {
        mutableStateOf("")
    }
    var mail by remember {
        mutableStateOf("")
    }

    Column(
        modifier= Modifier.fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(3.dp)
    ) {
        OutlinedTextField(value = fname, onValueChange ={
            fname=it
        } )
        OutlinedTextField(value = lName, onValueChange ={
            lName=it
        } )
        OutlinedTextField(value = mail, onValueChange ={
            mail=it
        } )
        btnRegister(firstname = fname , lastName = lName, email =mail, onRegister = {
            println("the user $fname $lName has just registered with the email $mail")
        } )

    }

}

@Composable
fun btnRegister(firstname:String,lastName:String,email:String,onRegister:()->Unit){
    var username = "$firstname $lastName"
    Button(onClick = {
        onRegister()
    }) {
        Text(text = "Register")
    }

}