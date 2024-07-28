package com.example.loginapplication.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginapplication.Components.HeadingTextMain
import com.example.loginapplication.Components.NormalTextComponent
import com.example.loginapplication.Components.myTextField
import com.example.loginapplication.R

@Composable
fun SignUpScreen(){
    Surface(color =Color.White,
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(28.dp),
    ) {
        Column(
            modifier =Modifier.fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NormalTextComponent(value = stringResource(id = R.string.Yika_login),)
            HeadingTextMain(value = stringResource(id = R.string.Login_App))
            myTextField()
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SignUpScreen()
}