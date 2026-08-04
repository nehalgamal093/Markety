package com.example.markety.features.auth.presentation.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.markety.core.constants.Routes
import com.example.markety.features.auth.presentation.components.AuthButton
import com.example.markety.features.auth.presentation.components.AuthTextField
import com.example.markety.features.auth.presentation.components.GoogleAuthButton
import com.example.markety.features.auth.presentation.viewmodel.LoginViewModel
import com.example.markety.ui.theme.Grey
import com.example.markety.ui.theme.Pink100

@Composable
fun LoginTab(viewModel: LoginViewModel = viewModel(), navController: NavController) {
    val state = viewModel.uiState
    LaunchedEffect(state.isLoggedIn) {
        if (state.isLoggedIn) {
            navController.navigate(Routes.Main) {
                popUpTo(Routes.Auth) {
                    inclusive = true
                }
            }
        }
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AuthTextField("Email", "Type your email", state.email, viewModel::updateEmail)
        Spacer(Modifier.height(5.dp))
        AuthTextField("Password", "Type your password", state.password, viewModel::updatePassword)
        Spacer(Modifier.height(10.dp))
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(

                text = "Forgot Password?",
                style = MaterialTheme.typography.titleSmall.copy(color = Pink100),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 20.dp),
            )
        }

        Spacer(Modifier.height(50.dp))
        AuthButton(
            if (state.isLoading) {
                "Loading"
            } else {
                "Login"
            }, onClick = {
                viewModel.login()
            })
        Spacer(Modifier.height(15.dp))
        HorizontalDivider(color = Grey, thickness = 1.dp, modifier = Modifier.width(80.dp))
        Spacer(Modifier.height(15.dp))
        GoogleAuthButton()

    }
}

