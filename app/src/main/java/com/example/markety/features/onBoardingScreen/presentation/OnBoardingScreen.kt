package com.example.markety.features.OnBoardingScreen.presentation

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.markety.R
import com.example.markety.features.OnBoardingScreen.data.models.Page


val pages = listOf(
    Page("Select the Favorities Menu","Now eat well, don't leave the house,You can \n" +
            "choose your favorite food only with \n" +
            "one click",R.drawable.onboarding1),
    Page("Good food at a cheap price",
            "You can eat at expensive restaurants with\n" +
            "affordable price",R.drawable.onboarding2)
)

@Composable
fun OnBoardingScreen(){
    val pagerState = rememberPagerState(pageCount = {pages.size})
    val scope = rememberCoroutineScope ()
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(state = pagerState, modifier = Modifier.weight(1f)) {
            page->
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
                Image(painter = painterResource(pages[page].image), contentDescription = pages[page].description, modifier = Modifier.size(250.dp))
                Spacer(modifier = Modifier.height(24.dp))
                Text(text= pages[page].title,
                fontSize = 28.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = pages[page].description, textAlign = TextAlign.Center)

            }
        }
    }
}