package com.example.markety.features.auth.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.markety.features.auth.presentation.tabs.LoginTab
import com.example.markety.features.auth.presentation.tabs.RegisterTab
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.White

//@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun AuthBottomSheet() {
    var showBottomSheet by remember {
        mutableStateOf(false)
    }

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )

    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

        AuthButton("Sign Up",onClick = {
            showBottomSheet = true
        })
        if (showBottomSheet) {

            ModalBottomSheet(
                containerColor = White,
                onDismissRequest = {
                    showBottomSheet = false
                },
                sheetState = sheetState
            ) {

                val tabTextStyle = MaterialTheme.typography.bodyLarge
                val tabs = listOf("Create Account", "Login")
                var selectedTab by remember {
                    mutableIntStateOf(0)
                }
                Box(modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .padding(16.dp).background(color = White)) {


                    PrimaryTabRow(
                        indicator = {
                            TabRowDefaults.PrimaryIndicator(
                                modifier = Modifier
                                    .tabIndicatorOffset(
                                        selectedTab,
                                        matchContentSize = false
                                    )
                                    .width(40.dp),
                                color = Pink100
                            )
                        },
                        selectedTabIndex = selectedTab, containerColor = White,
                        contentColor = Color.Black,
                        divider = {

                        },

                        ) {
                        tabs.forEachIndexed { index, title ->
                            Tab(
                                selected = selectedTab == index,
                                onClick = { selectedTab = index },
                                text = {
                                    Text(
                                        title,
                                        style = if (selectedTab == index) tabTextStyle.copy(color = Pink100) else tabTextStyle
                                    )
                                })
                        }
                    }
                }
                when (selectedTab) {

                    0 -> RegisterTab()

                    1 -> LoginTab()

                }
            }

        }
    }
}