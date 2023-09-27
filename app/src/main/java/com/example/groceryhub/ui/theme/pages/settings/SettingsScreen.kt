package com.example.groceryhub.ui.theme.pages.settings

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.groceryhub.R
import com.example.groceryhub.ui.theme.GroceryHubTheme

@Composable
fun SettingsScreen(navController: NavHostController) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {

            Text(
                text = "Settings",
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(20.dp, 115.dp, 30.dp, 0.dp)
            )

            Image(painter = painterResource(id = R.drawable.settings_icon),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .padding(0.dp, 40.dp, 30.dp, 0.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "General",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(20.dp, 0.dp, 280.dp, 0.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                )
            }

            ClickableText(
                text = AnnotatedString("My account"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
//                    color = green,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(0.dp, 12.dp, 0.dp, 0.dp)
            )


        }



        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Lock",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                )
            }

            ClickableText(
                text = AnnotatedString("Signin and Security"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
//                    color = green,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(0.dp, 12.dp, 0.dp, 0.dp)
            )


        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notifications",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                )
            }

            ClickableText(
                text = AnnotatedString("Notifications"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
//                    color = green,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(0.dp, 12.dp, 0.dp, 0.dp)
            )


        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "About",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                )
            }

            ClickableText(
                text = AnnotatedString("About GroceryHub"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
//                    color = green,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(0.dp, 12.dp, 0.dp, 0.dp)
            )


        }


        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                )
            }

            ClickableText(
                text = AnnotatedString("Share Feedback and Support"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
//                    color = green,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(0.dp, 12.dp, 0.dp, 0.dp)
            )


        }
    }
    }




@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun SettingsScreen() {
   GroceryHubTheme {
        SettingsScreen(rememberNavController())
    }
}