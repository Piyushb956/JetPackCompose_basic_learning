package com.learnning.jetpackcompose.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.unit.dp

@Composable
fun GoodDay(text: String, onTextChange:(String)-> Unit) {
    TextField(
        value = text,
        onValueChange = onTextChange,
        label = { Text("Enter name") }
    )

}

@Composable
fun Parent(modifier: Modifier = Modifier.fillMaxSize()) {
    var text by remember { mutableStateOf("") }
    GoodDay(text) {
        text=it
    }
}
