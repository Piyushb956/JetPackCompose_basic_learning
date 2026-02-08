package com.learnning.jetpackcompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.core.R


@Composable
fun CountScreen(){
    var count by rememberSaveable{ mutableStateOf(0) }
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
    Text("$count" , modifier = Modifier.padding(30.dp).scale(3f))
         Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(end = 10.dp).fillMaxWidth()){
             Button(onClick = {
            count++
            }, modifier = Modifier.padding(end = 16.dp)) {
            Text("increase")
            }
            Button(onClick = {
            count=0
            }, modifier = Modifier.padding(end = 10.dp)) {Text("Reset ", modifier = Modifier.padding(horizontal = 10.dp)) }}
    }
}

