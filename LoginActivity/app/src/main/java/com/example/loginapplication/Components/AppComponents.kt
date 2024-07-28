package com.example.loginapplication.Components

import androidx.annotation.ColorRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginapplication.R

@Composable
fun NormalTextComponent(value:String){
    Text("$value",
    modifier = Modifier
        .fillMaxSize()
        .heightIn(min = 80.dp),
    style = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal
    ),
        color = Color.Black,
        textAlign = TextAlign.Center
    )

}


@Composable
fun HeadingTextMain(value:String){
    Text(text = "$value",
        modifier = Modifier.fillMaxSize(),
        style = TextStyle(
            fontSize = 30.sp,
        ),
        color = Color.Black,
        textAlign = TextAlign.Center,
        )
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
        modifier = Modifier.fillMaxSize(),
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