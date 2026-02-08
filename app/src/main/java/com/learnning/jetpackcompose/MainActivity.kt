package com.learnning.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.learnning.jetpackcompose.ui.theme.CountScreen
import com.learnning.jetpackcompose.ui.theme.GoodDay

import com.learnning.jetpackcompose.ui.theme.Greet
import com.learnning.jetpackcompose.ui.theme.JetPackComposeTheme
import com.learnning.jetpackcompose.ui.theme.LazyLayout
import com.learnning.jetpackcompose.ui.theme.Parent
import com.learnning.jetpackcompose.ui.theme.ToggleExample


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetPackComposeTheme {

//                    Greet("Piyush")
//                    Greet("shivani")


//                ToggleExample()

//                CountScreen()
//                Parent()
//                Profile("prakhar",24, Color.Gray)
                LazyLayout()

            }
        }
    }
}
