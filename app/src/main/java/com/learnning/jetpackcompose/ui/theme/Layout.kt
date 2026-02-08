package com.learnning.jetpackcompose.ui.theme

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.fromColorLong
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learnning.jetpackcompose.R


@Composable
fun ExampleCol(modifier: Modifier = Modifier) {
    Column(modifier= Modifier.background(color = Color.Transparent).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text("hi we use column",modifier= Modifier.padding(bottom = 10.dp).scale(1.8f))
        Text("it is an layout",modifier= Modifier.padding(bottom = 10.dp).scale(1.5f))
        Button(onClick = {}) {Text("Do something") }
    }
}
@Composable
fun ExampleRow(modifier: Modifier = Modifier) {
//    Row(modifier= Modifier.background(color = Color.Transparent).fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
//        Text("hi we use column")
//        Text("it is an layout")
//
//        Button(onClick = {}) {Text("Do something") }
//    }


    Box (modifier= Modifier.fillMaxSize()){
        Image(painter = painterResource(R.drawable.demo), contentDescription = null,modifier= Modifier.height(500.dp))
        Text("this is Box layout", modifier = Modifier.padding(vertical = 300.dp), color = Color.Red)
    }






}


@Composable
@Preview(showSystemUi = true)
fun PrevExample(modifier: Modifier = Modifier) {
//    ExampleCol()
    ExampleRow()
}