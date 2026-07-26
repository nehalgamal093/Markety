package com.example.markety.features.ordersuccess.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.features.ordersuccess.presentation.components.FeedBackField
import com.example.markety.features.ordersuccess.presentation.components.SubmitButton
import com.example.markety.ui.theme.Grey10
import com.example.markety.ui.theme.Grey5
import com.example.markety.ui.theme.Pink100

@Composable
fun OrderSuccessScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.finish_order),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),

            )
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.success),
                contentDescription = "success",
            )
            Text(
                text = "Thank You! \n Order Completed",
                style = MaterialTheme.typography.labelLarge,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Please rate your last Driver",
                style = MaterialTheme.typography.labelMedium,
                textAlign = TextAlign.Center,
                color = Grey5
            )
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(R.drawable.stars),
                contentDescription = "stars",
            )
            Spacer(modifier = Modifier.height(80.dp))
            FeedBackField()
            Spacer(modifier = Modifier.height(30.dp))
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                SubmitButton {  }
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Skip",style = MaterialTheme.typography.labelMedium.copy(color=Pink100))

            }
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}