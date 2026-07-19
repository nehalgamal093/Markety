package com.example.markety.features.OrderDetails.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.ui.theme.Grey10
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.Pink5
import com.example.markety.ui.theme.White

@Composable
fun ProductCartItem(){
    Card(
        modifier = Modifier
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
                    ).fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = White
        ),

        ){
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Image(painter = painterResource(R.drawable.menu1), contentDescription = "Menu1")
            Spacer(modifier = Modifier.width(10.dp))
            Column() {
                Text(text = "Chicken Burger", style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Burger Factory LTD", style = MaterialTheme.typography.labelMedium.copy(color = Grey10))
                Spacer(modifier = Modifier.height(10.dp))
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "\$ 15",style = MaterialTheme.typography.labelMedium.copy(color = Pink100))
                    Spacer(modifier = Modifier.width(140.dp))
                    ProductCount()
                }
            }
        }

    }
}
@Composable
fun ProductCount(){
    Row() {
        Box(
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Pink5),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = R.drawable.minus), contentDescription = "minus")
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "1")
        Spacer(modifier = Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Pink100),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = R.drawable.add), contentDescription = "plus")

        }

    }
}