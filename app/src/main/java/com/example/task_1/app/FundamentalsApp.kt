package com.example.task_1.app

import androidx.compose.animation.Crossfade
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.task_1.router.FundamentalsRouter
import com.example.task_1.router.Screen
import com.example.task_1.screens.AlertDialogScreen
import com.example.task_1.screens.ExploreButtonsScreen
import com.example.task_1.screens.NavigationScreen
import com.example.task_1.screens.ProgressIndicatorScreen
import com.example.task_1.screens.TextFieldScreen
import com.example.task_1.screens.TextScreen


@Composable
fun FundamentalsApp(modifier: Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Crossfade(
            targetState = FundamentalsRouter.currentScreen
        ) { screenState ->
            when (screenState.value) {
                is Screen.Navigation -> NavigationScreen()
                is Screen.Text -> TextScreen()
                is Screen.TextField -> TextFieldScreen()
                is Screen.Buttons -> ExploreButtonsScreen()
                is Screen.ProgressIndicator -> ProgressIndicatorScreen()
                is Screen.AlertDialog -> AlertDialogScreen()
            }
        }
    }
}