package com.learnning.jetpackcompose.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyLayout(modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            Text("Header", modifier = Modifier.padding(16.dp))
        }
        items(100) { index ->
            Text("Item $index", modifier = Modifier.padding(16.dp))
        }
    }


//    LazyRow(modifier= Modifier.fillMaxSize()){
//        item{
//            Text("Header",modifier= Modifier.padding(16.dp))
//        }
//        items(100){index->
//            Te
//            xt("Item $index",modifier= Modifier.padding(16.dp))
//        }
//    }
}