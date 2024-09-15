package com.example.task_1.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.task_1.R
import com.example.task_1.router.FundamentalsRouter
import com.example.task_1.router.Screen

@Composable
fun NavigationScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            NavigationButton(stringResource(id = R.string.button_view_text), Screen.Text)
            NavigationButton(stringResource(id = R.string.button_textField), Screen.TextField)
            NavigationButton(stringResource(id = R.string.button_buttons), Screen.Buttons)
            NavigationButton(stringResource(id = R.string.button_progress), Screen.ProgressIndicator)
            NavigationButton(stringResource(id = R.string.button_alertDialog), Screen.AlertDialog)
        }
    }
}

@Composable
fun NavigationButton(text: String, screen: Screen) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.blue)),
        onClick = { FundamentalsRouter.navigateTo(screen) }
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}