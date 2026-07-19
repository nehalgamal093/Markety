package com.example.markety.features.Home.presentation.components
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.ui.theme.Grey10
import com.example.markety.ui.theme.Pink5

@Composable
fun SearchField() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        leadingIcon = {
            Image(painter = painterResource(  R.drawable.search), contentDescription = "Search")
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Pink5, shape = RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Pink5,
            unfocusedContainerColor = Pink5,

            focusedIndicatorColor = Pink5,
            unfocusedIndicatorColor = Pink5,
            disabledIndicatorColor = Pink5
        ),
        placeholder = {
            Text("Search",style = MaterialTheme.typography.titleMedium.copy(color = Grey10))
        }
    )


}