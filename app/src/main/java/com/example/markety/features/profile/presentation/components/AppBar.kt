package com.example.markety.features.profile.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.ui.theme.Pink5

@Composable
fun AppBar(){
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(color = Pink5)
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Image(painter = painterResource(R.drawable.arrow_back), contentDescription = "back")

        }
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(color = Pink5)
                .padding(horizontal = 16.dp, vertical = 10.dp).width(15.dp)
        ) {
            Image(painter = painterResource(R.drawable.notification), contentDescription = "notification")

        }
    }
}