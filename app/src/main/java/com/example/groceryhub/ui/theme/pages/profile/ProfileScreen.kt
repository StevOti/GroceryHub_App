package com.example.groceryhub.ui.theme.pages.profile

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.groceryhub.R
import com.example.groceryhub.navigation.ROUTE_SHOP
import com.example.groceryhub.navigation.ROUTE_SIGNUP
import com.example.groceryhub.ui.theme.GroceryHubTheme
import com.example.groceryhub.ui.theme.blue

@Composable
fun ProfileScreen(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {


        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {

            Column(

                modifier = Modifier
                    .padding(20.dp, 40.dp, 30.dp, 0.dp)
            ) {
                Text(
                    text = "Profile",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                )

                Spacer(modifier = Modifier.height(35.dp))

                Button(onClick = {
                    navController.navigate(ROUTE_SIGNUP)
                },
                    colors = ButtonDefaults.buttonColors(blue),
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                ) {
                    Text(text = "Login or Sign up")
                }

            }

            Image(painter = painterResource(id = R.drawable.family),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .padding(0.dp, 40.dp, 30.dp, 20.dp)
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Shop faster and manage your details more",
            modifier = Modifier
                .padding(20.dp, 0.dp, 42.dp, 0.dp),
            textAlign = TextAlign.Start,
        )
        Text(text = "easily with an account.",
            modifier = Modifier
                .padding(20.dp, 0.dp, 190.dp, 0.dp)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Manage your account",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(20.dp, 0.dp, 120.dp, 0.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
        ){
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.details),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Your details",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.globe),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Discover",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
        ){
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.settings),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Settings",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.customer_service),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Support",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }
        }

    }


}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ProfileScreen() {
    GroceryHubTheme {
        ProfileScreen(rememberNavController())
    }
}