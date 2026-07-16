package com.example.markety.features.Home.presentation.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R

@Composable
fun TopBar(){
    Box(modifier = Modifier.fillMaxWidth()){
        Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.list), contentDescription = "list")
            Spacer(modifier = Modifier.width(10.dp))
            Row() {
                Image(painter = painterResource(id = R.drawable.location), contentDescription = "search")
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "Freedom way, Lekki phase")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "avatar")
        }
    }
}
