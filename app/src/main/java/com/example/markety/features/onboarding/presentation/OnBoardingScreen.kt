package com.example.markety.features.onboarding.presentation
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.core.constants.Routes
import com.example.markety.features.onboarding.data.models.Page
import com.example.markety.features.onboarding.presentation.components.PageIndicator
import kotlinx.coroutines.launch


val pages = listOf(
    Page("Select the Favorities Menu","Now eat well, don't leave the house,You can \n" +
            "choose your favorite food only with \n" +
            "one click",R.drawable.onboarding1),
    Page("Good food at a cheap price",
            "You can eat at expensive restaurants with\n" +
            "affordable price",R.drawable.onboarding2)
)

@Composable
fun OnBoardingScreen(navController: NavController){

    val pagerState = rememberPagerState(pageCount = {pages.size})
    val scope = rememberCoroutineScope ()
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize().safeDrawingPadding().padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(state = pagerState, modifier = Modifier.weight(1f)) {
                    page->
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
                    Image(painter = painterResource(pages[page].image), contentDescription = pages[page].description, modifier = Modifier.size(400.dp))
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(text= pages[page].title,
                        fontSize = 28.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(text = pages[page].description, textAlign = TextAlign.Center)

                }
            }
            PageIndicator(
                pageCount = pages.size,
                currentPage = pagerState.currentPage
            )
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                Modifier
                    .width(220.dp)
                    .height(56.dp)
                    .clip(RoundedCornerShape(16.dp))

                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFFD61355),
                                Color(0xFFFF0000)
                            )
                        )
                    ),
            ){
                Button(
                    modifier = Modifier.fillMaxSize(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.White
                    ),
                    onClick={
                        scope.launch {
                            if(pagerState.currentPage < pages.lastIndex){
                                pagerState.animateScrollToPage(
                                    pagerState.currentPage+1
                                )
                            }else{
                              navController.navigate(Routes.Home){
                                  popUpTo(0)
                              }
                            }

                        }
                    }
                ){
                    Text(
                        if(pagerState.currentPage == pages.lastIndex)
                            "Get Started"
                        else
                            "Next"
                    )
                }
            }

        }
    }
}