package com.example.markety.features.auth.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.features.auth.presentation.components.AuthBottomSheet
import com.example.markety.features.auth.presentation.components.GoogleAuthButton
import com.example.markety.features.auth.presentation.tabs.LoginTab
import com.example.markety.features.auth.presentation.tabs.RegisterTab
import com.example.markety.features.auth.presentation.viewmodel.RegisterViewModel
import com.example.markety.ui.theme.Grey
import com.example.markety.ui.theme.White

@Composable
fun AuthScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(color = White), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.height(400.dp)) {
            Image(
                painter = painterResource(R.drawable.fast_food),
                contentDescription = "Fast Food",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
        }
        RegisterTab(navController = navController)
        Spacer(Modifier.height(5.dp))

        AuthBottomSheet(navController = navController)
        Spacer(Modifier.height(15.dp))
        HorizontalDivider(color = Grey, thickness = 1.dp, modifier = Modifier.width(80.dp))
        Spacer(Modifier.height(15.dp))
        GoogleAuthButton()
    }

}

