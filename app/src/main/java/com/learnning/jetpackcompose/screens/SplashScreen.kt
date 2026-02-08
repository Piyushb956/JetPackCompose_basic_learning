package com.learnning.jetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learnning.jetpackcompose.R
import com.learnning.jetpackcompose.ui.theme.JetPackComposeTheme

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Column(modifier=modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter= painterResource(R.drawable.ic_launcher_background),
            contentDescription = null
        ,modifier=modifier.size(184.dp,100.dp))
    }
}
@Preview(showSystemUi = true)
@Composable
fun pre(modifier: Modifier = Modifier) {
    JetPackComposeTheme() {
        SplashScreen()
    }
}