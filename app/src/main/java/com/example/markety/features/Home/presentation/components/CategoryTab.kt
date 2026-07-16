package com.example.markety.features.Home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.ui.theme.Black
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.White

@Composable
fun CategoryTab(image: Int, title: String, isSelected: Boolean,click:()->Unit) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))

            .background(
                if (isSelected)
                    Pink100
                else
                    White
            )
            .padding(horizontal = 20.dp, vertical = 10.dp).clickable {
                click()
            }
    ) {
        Row() {
            Image(
                painter = painterResource(image),
                contentDescription = title,
                Modifier.height(30.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = title, style = MaterialTheme.typography.labelMedium.copy(
                    color =
                        if (isSelected)
                            White
                        else
                            Black
                )
            )
        }
    }
}