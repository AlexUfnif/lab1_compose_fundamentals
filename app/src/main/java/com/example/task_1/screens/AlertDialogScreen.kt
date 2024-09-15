package com.example.task_1.screens

import androidx.compose.runtime.Composable
import com.example.task_1.router.BackButtonHandler
import com.example.task_1.router.FundamentalsRouter
import com.example.task_1.router.Screen


@Composable
fun AlertDialogScreen() {

    MyAlertDialog()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyAlertDialog() {
    //TODO add your code here
}