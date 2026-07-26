package com.example.markety.features.ordersuccess.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.ui.theme.Grey
import com.example.markety.ui.theme.Grey10

@Composable
fun FeedBackField() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        leadingIcon = {
            Image(painter = painterResource(R.drawable.edit), contentDescription = "Search")
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,

            focusedIndicatorColor = Grey,
            unfocusedIndicatorColor = Grey,
            disabledIndicatorColor = Grey
        ),
        placeholder = {
            Text(
                "Leave feedback",
                style = MaterialTheme.typography.titleMedium.copy(color = Grey10)
            )
        }
    )
}