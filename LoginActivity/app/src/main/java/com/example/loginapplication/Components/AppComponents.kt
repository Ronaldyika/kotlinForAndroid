package com.example.loginapplication.Components

import androidx.annotation.ColorRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginapplication.R

@Composable
fun NormalTextComponent(value:String,title:String){
    Column() {
        Text("$value",
            modifier = Modifier
                .width(600.dp),
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontSize = 24.sp,
                fontWeight = FontWeight.Normal
            ),
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text("$title",
            modifier = Modifier
                .width(600.dp),
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontSize = 34.sp,
                fontWeight = FontWeight.Normal
            ),
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun myTextField() {
    var textValue by remember {
        mutableStateOf("")
    }

    val profileIcon = painterResource(id = R.drawable.profile)

    OutlinedTextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = { Text("Enter UserName") },
        modifier = Modifier.width(400.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Cyan,
            focusedLabelColor = Color.Cyan,
            cursorColor = Color.Cyan
        ),
        keyboardOptions = KeyboardOptions.Default,
        leadingIcon = {
            Icon(painter = profileIcon, contentDescription = "Profile Icon")
        }
    )
}

@Composable
fun Emailfield(){
    var emailvalue by remember {
        mutableStateOf("")
    }

    val profileIcon = painterResource(id = R.drawable.email)
    OutlinedTextField(
        value = emailvalue,
        onValueChange = { emailvalue = it },
        label = { Text("Enter email") },
        modifier = Modifier.width(400.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Cyan,
            focusedLabelColor = Color.Cyan,
            cursorColor = Color.Cyan
        ),
        keyboardOptions = KeyboardOptions.Default,
        leadingIcon = {
            Icon(painter = profileIcon, contentDescription = "Profile Icon")
        }
    )
}

@Composable
fun passwordField(){
    var passwordValue by remember {
        mutableStateOf("")
    }
    var passwordvisible by remember {
        mutableStateOf(false)
    }

    val profileIcon = painterResource(id = R.drawable.email)
    OutlinedTextField(
        value = passwordValue,
        onValueChange = { passwordValue = it },
        label = { Text("Enter password") },
        modifier = Modifier.width(400.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Cyan,
            focusedLabelColor = Color.Cyan,
            cursorColor = Color.Cyan
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        leadingIcon = {
            Icon(painter = profileIcon, contentDescription = "Profile Icon")
        },
        trailingIcon = {
            val iconImage = if(passwordvisible){
                Icons.Filled.VisibilityOff
            }else{
                Icons.Filled.VisibilityOff
            }
            var description=if(passwordvisible.Value){
                "hide password"
            }else{
                "show password"
            }
            IconButton(onClick = {passwordvisible.value = !passwordvisible.value }) {
                Icon(imageVector = iconImage, contentDescription = description)

            }
        },
        visualTransformation = if(passwordvisible.value) VisualTransformation.None else PasswordVisualTransformation()
    )
}
@Composable
fun Buttonfunction(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Register")
        
    }
}