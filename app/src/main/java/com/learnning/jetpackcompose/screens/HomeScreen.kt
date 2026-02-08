package com.learnning.jetpackcompose.screens

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learnning.jetpackcompose.R
import com.learnning.jetpackcompose.ui.theme.JetPackComposeTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        Row(modifier=modifier
            .fillMaxWidth()
            .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu",
                tint=Color.Black,
                modifier=modifier.size(24.dp)
            )

            Column(horizontalAlignment = Alignment.CenterHorizontally)
            {
                Image(painter = painterResource(R.drawable.shopping_basket),
                    contentDescription = null,
                    modifier=modifier.size(24.dp)
                )

            }
        }
// greeting main colum
        Text("Hello Piyush, what food and vegetables do you want to buy today?",
            fontSize = 18.sp, fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier=modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center,
            lineHeight = 28.sp
            )

//        searchbar
        Row(modifier=modifier
            .fillMaxWidth()
            .background(
                color = Color(0x3FFF1F1F1),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp), verticalAlignment = Alignment.CenterVertically
            ){

            Icon(imageVector = Icons.Default.Search,
                contentDescription = "search",
                tint=Color.Black, modifier = modifier.size(24.dp))
            Spacer(modifier = modifier.width(12.dp))
            Text("Search here for vegetables and fruits ", fontSize = 14.sp,
                color = Color(0xFF86869E))
            Spacer(modifier=modifier.weight(1f))
            Image(painter = painterResource(R.drawable.filter_list),
                contentDescription = null, modifier = modifier.size(24.dp))

        }
        Spacer(modifier=modifier.height(32.dp))
        Text("Recommended Combo",
            fontSize = 24.sp, fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier=modifier.padding(bottom = 16.dp)
        )
        LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier=modifier.padding(bottom = 16.dp)
        ) { items(2){index->
            RecommendedComboCard(name=if(index==0)"Honey Limb Combo" else "Berry Mango Combo",
                price = if (index==0)"$200" else "$400",
                imageRes = if (index==0)R.drawable.food_1 else R.drawable.food_2)

            }

        }
        LazyRow(horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier=modifier.padding(bottom = 16.dp)
        ){
            items(listOf("Hottest","New","Popoular","Best Seller","Top")){category->
                Text(text=category, fontSize =16.sp, fontWeight = if (category=="Hottest") FontWeight.Bold else FontWeight.Normal)
            }

        }
    }


}


@Composable
fun RecommendedComboCard(modifier: Modifier = Modifier,name: String,price: String,imageRes:Int) {
    Card(modifier = modifier.width(165.dp),
        shape = RoundedCornerShape(16.dp), colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ){
        Column(modifier=modifier.padding(26.dp)) {
            Row(modifier=modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End)
            {
                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,tint=Color(0xFFFF8C42),
                    modifier = modifier.size(20.dp)
                )

            }
            Image(painter=painterResource(imageRes),contentDescription = null,
            modifier = modifier.size(80.dp))
            Spacer(modifier = modifier.height(12.dp))

            Text(name, fontSize = 16.sp, fontWeight = FontWeight.Medium,
                color = Color.Black)

            Spacer(modifier = modifier.height(8.dp))
            Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text(price, fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF8C42))

                Icon(imageVector = Icons.Default.Add,
                    contentDescription = null, tint = Color(0xFFFF8C42),
                    modifier = modifier.size(24.dp).background(Color(0xFFFFF2E7), shape = CircleShape).padding(4.dp))
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun Homeprv(modifier: Modifier = Modifier) {
    JetPackComposeTheme() {
        HomeScreen()
    }

}