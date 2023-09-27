package com.example.groceryhub.ui.theme.pages.cart

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
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
import com.example.groceryhub.navigation.BottomBarScreen
import com.example.groceryhub.ui.theme.GroceryHubTheme
import com.example.groceryhub.ui.theme.blue

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun CartScreen(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Row (
            modifier = Modifier .fillMaxWidth()
        ){
            IconButton(onClick = {
                navController.navigate(route = BottomBarScreen.Search.route)
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    modifier = Modifier
                        .size(15.dp)

                )
            }

            ClickableText(
                text = AnnotatedString("Back"),
                onClick ={
                    navController.navigate(route = BottomBarScreen.Search.route)
                },
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    color = blue,
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif
                ),
                modifier = Modifier
                    .padding(0.dp, 15.dp, 300.dp, 0.dp)
            )
        }




        Text(
            text = "Cart",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(5.dp, 20.dp, 250.dp, 0.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)
                    .padding(20.dp, 0.dp, 0.dp, 0.dp)

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.skuma_wiki),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop
                    )
                }

            }

            Column {
                Text(text = "Sukuma Wiki",
                    fontSize = 17.sp,
                    color = blue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )

                Text(text = "Quantity: 3kg",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )

                Text(text = "Price: Ksh 80",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )



            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier
                        .size(15.dp)
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete",
                    modifier = Modifier
                        .size(15.dp)
                )
            }
        }


        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)
                    .padding(20.dp, 0.dp, 0.dp, 0.dp)

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.skuma_wiki),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop
                    )
                }

            }

            Column {
                Text(text = "Tomatoes",
                    fontSize = 17.sp,
                    color = blue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )

                Text(text = "Quantity: 3kg",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )

                Text(text = "Price: Ksh 100",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )



            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier
                        .size(15.dp)
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete",
                    modifier = Modifier
                        .size(15.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)
                    .padding(20.dp, 0.dp, 0.dp, 0.dp)

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.skuma_wiki),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop
                    )
                }

            }

            Column {
                Text(text = "Onions   ",
                    fontSize = 17.sp,
                    color = blue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )

                Text(text = "Quantity: 3kg",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )

                Text(text = "Price: Ksh 100",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )



            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    modifier = Modifier
                        .size(15.dp)
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete",
                    modifier = Modifier
                        .size(15.dp)
                )
            }
        }

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(blue),
            modifier = Modifier
                .padding(5.dp, 20.dp, 0.dp, 0.dp)
                .width(200.dp)
        ) {
            Text(text = "Checkout",
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,)
        }
    }
}




@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun CartScreen() {
    GroceryHubTheme {
        CartScreen(rememberNavController())
    }
}