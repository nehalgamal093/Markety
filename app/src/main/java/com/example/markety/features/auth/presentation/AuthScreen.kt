package com.example.markety.features.auth.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.features.auth.presentation.components.AuthTextField
import com.example.markety.features.auth.presentation.tabs.LoginTab

@Composable
fun AuthScreen(navController: NavController){
    val tabs = listOf("Create Account", "Login")
    var selectedTab by remember{
        mutableIntStateOf(0)
    }
    Column(modifier= Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.height(500.dp)){
            Image(
                painter = painterResource(R.drawable.fast_food),
                contentDescription = "Fast Food",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(450.dp)
            )
        }
        Box(modifier = Modifier.height(50.dp)){


            PrimaryTabRow(selectedTabIndex = selectedTab
            ) {
                tabs.forEachIndexed {
                        index,title->
                    Tab(selected = selectedTab == index,
                        onClick = {selectedTab = index}, text = {Text(title)})
                }
            }
        }
        when (selectedTab) {

            0 -> AuthTextField()

            1 -> LoginTab()

        }
    }


}

