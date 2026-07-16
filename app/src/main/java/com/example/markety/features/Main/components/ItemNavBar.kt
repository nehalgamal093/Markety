package com.example.markety.features.Main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.ui.theme.Black
import com.example.markety.ui.theme.Pink10
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.Pink5

@Composable
fun ItemNavBar(isSelected: Boolean,title:String,image:Int){
    Box(modifier = Modifier.clip(RoundedCornerShape(10.dp)).background(if(isSelected) Pink5 else Color.Transparent).padding(10.dp)){
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = image),
                contentDescription = title
            )

            if(isSelected){
                Spacer(modifier = Modifier.width(10.dp))
                Text(text =  title,style = MaterialTheme.typography.titleSmall.copy(color = Black))
            }
        }
    }
}