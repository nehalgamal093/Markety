package com.example.markety.features.OrderDetails.presentation.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R


@Composable
fun CartSheet() {
    Box(modifier = Modifier.fillMaxWidth()){
        Image(painter = painterResource(R.drawable.cartbackground), contentDescription = "Cart details")
        Column( modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 30.dp),
            verticalArrangement = Arrangement.Center) {
            Spacer(modifier = Modifier.height(10.dp))
            CartPriceText("Sub-Total","100 \$")
            Spacer(modifier = Modifier.height(5.dp))
            CartPriceText("Delivery Charge","10 \$")
            Spacer(modifier = Modifier.height(5.dp))
            CartPriceText("Discount","10 \$")

            Spacer(modifier = Modifier.height(10.dp))
            CartPriceText("Total","110\$")
            Spacer(modifier = Modifier.height(20.dp))
            PlaceOrderButton {  }
        }
    }
}

