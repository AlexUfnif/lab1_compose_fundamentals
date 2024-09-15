package com.example.task_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.task_1.app.FundamentalsApp
import com.example.task_1.ui.theme.Task_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task_1Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                )
                { innerPadding ->
                    FundamentalsApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewFundamentalApp() {
    FundamentalsApp(Modifier)
}