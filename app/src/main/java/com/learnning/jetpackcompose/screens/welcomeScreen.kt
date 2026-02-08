package com.learnning.jetpackcompose.screens

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learnning.jetpackcompose.ui.theme.JetPackComposeTheme

@Composable
fun welcomScreen(modifier: Modifier = Modifier) {
    Column(modifier=modifier.fillMaxSize()
        .background(color = Color.White))
    {
        Box( modifier=modifier.fillMaxSize().weight(0.65f).background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFFF8C42),Color(0xFFFF7A2B)
                    )
                )
            ), contentAlignment = Alignment.Center)
        {
            Box(modifier=modifier.size(280.dp)
                .background(color = Color.White.copy(alpha = 0.1f), shape = CircleShape),
                contentAlignment = Alignment.Center)
            {
                Image(painter = painterResource
                    (com.learnning.jetpackcompose.R.drawable.fruit_basket_image),
                    contentDescription = null,modifier=modifier.size(160.dp),
                    )

            }

        }

        Column(modifier=modifier.fillMaxSize().weight(0.35f)
            .padding(horizontal = 24.dp, vertical = 32.dp), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Text("Get the best fruit and vegetables",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp, lineHeight = 28.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(14.dp))

            Text("we deliver the best fruit and vegetables to your door",
                fontSize = 16.sp, lineHeight = 24.sp, textAlign = TextAlign.Center, color = Color.Black)

            Spacer(modifier = Modifier.height(14.dp))

            Button(onClick = {},modifier=modifier.fillMaxWidth().height(56.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8C42)), shape = RoundedCornerShape(16.dp)
            )
            {
                Text("Let's Continue",
                color = Color.White, fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                )
            }

        }
    }
}
@Composable
@Preview(showSystemUi = true)
fun welcomePrv(modifier: Modifier = Modifier) {
    JetPackComposeTheme() {
        welcomScreen()
    }
}