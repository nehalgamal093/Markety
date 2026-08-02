package com.example.markety.features.profile.presentation.screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.features.profile.presentation.components.AppBar
import com.example.markety.features.profile.presentation.components.EditButton

@Composable
fun ProfileScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(40.dp))
            AppBar()
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Profile",
                style = MaterialTheme.typography.labelLarge,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                Box() {

                    Image(
                        painter = painterResource(R.drawable.avatar_large),
                        contentDescription = "avatar",
                        alignment = Alignment.Center
                    )
                    Image(
                        painter = painterResource(R.drawable.edit_profile),
                        contentDescription = "edit",
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                    )

                }
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Personal Info",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(30.dp))
            Details("Your name", "Joyce Johnson")
            Spacer(modifier = Modifier.height(20.dp))
            Details("Occupation", "Manager")
            Spacer(modifier = Modifier.height(20.dp))
            Details("Employer", "Food Couriers")
            Spacer(modifier = Modifier.height(20.dp))
            Details("Nigeria", "Food Couriers")
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Contact Info",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(30.dp))
            Details("Phone number", "+234 813 0400 445")
            Spacer(modifier = Modifier.height(20.dp))
            Details("Email", "ekamcy@mail.com")
            Spacer(modifier = Modifier.height(100.dp))
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                EditButton { }
            }
        }
    }
}

@Composable
fun Details(title: String, value: String) {
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.W400),
            textAlign = TextAlign.Start
        )

        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.W500),
            textAlign = TextAlign.Start
        )

    }
}