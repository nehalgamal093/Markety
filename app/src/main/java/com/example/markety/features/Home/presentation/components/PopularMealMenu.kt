package com.example.markety.features.Home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Text
import com.example.markety.R
import com.example.markety.ui.theme.Grey10
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.White

@Composable
fun PopularMealMenu(){
    Column(modifier = Modifier
        .fillMaxWidth()) {
        Text(text = "Popular Meal Menu",style = MaterialTheme.typography.bodyLarge.copy(color = Color.Black))

        Card(modifier = Modifier.padding(10.dp).shadow(
            elevation = 4.dp,
            shape = RoundedCornerShape(16.dp),
            clip = false
        ).fillMaxWidth(),colors = CardDefaults.cardColors(
            containerColor = White
        ),) {
            Row(modifier = Modifier
                .fillMaxWidth().padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(R.drawable.pizza2), contentDescription = "Pizza2")
                Spacer(modifier = Modifier.width(10.dp))
                Column() {
                    Text(text = "Pepper Pizza", style = MaterialTheme.typography.bodyLarge.copy(color = Color.Black))
                    Text(text = "5kg box of Pizza", style = MaterialTheme.typography.labelMedium.copy(color = Grey10))
                }
                Spacer(modifier = Modifier.width(100.dp))
                   Text(text = "\$15", style = MaterialTheme.typography.bodyLarge.copy(color = Pink100, fontSize = 20.sp))

            }
        }
    }
}