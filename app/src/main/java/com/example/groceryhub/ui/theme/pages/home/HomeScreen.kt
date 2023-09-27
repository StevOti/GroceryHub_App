package com.example.groceryhub.ui.theme.pages.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.example.groceryhub.navigation.BottomBarScreen
import com.example.groceryhub.ui.theme.GroceryHubTheme
import com.example.groceryhub.ui.theme.blue


@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        var context = LocalContext.current
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Account",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp),
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp),
                )
            }
        }

        Text(
            text = "Home",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(5.dp, 20.dp, 250.dp, 0.dp)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp),
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(20.dp, 0.dp, 0.dp, 0.dp)
            ) {

            Column {
                ElevatedCard(

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier
                        .size(width = 120.dp, height = 80.dp)
                ) {

                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.spices),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(RoundedCornerShape(16.dp))
                            )
                        }

                    }


                }

                ClickableText(
                    text = AnnotatedString("Spices"),
                    onClick ={},
                    style = TextStyle(
                        color = blue,
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif),
                    modifier = Modifier.padding(10.dp)
                )

            }


            Column {
                ElevatedCard(

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier
                        .size(width = 120.dp, height = 80.dp)
                ) {

                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.cereals),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(RoundedCornerShape(16.dp))
                            )
                        }

                    }


                }

                ClickableText(
                    text = AnnotatedString("Cereals"),
                    onClick ={},
                    style = TextStyle(
                        color = blue,
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif),
                    modifier = Modifier.padding(10.dp)
                )


            }



            Column {
                ElevatedCard(

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier
                        .size(width = 120.dp, height = 80.dp)
                ) {

                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.fruits),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(16.dp))
                        )
                    }
                }

                ClickableText(
                    text = AnnotatedString("Fruits"),
                    onClick ={},
                    style = TextStyle(
                        color = blue,
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif),
                    modifier = Modifier.padding(10.dp)
                )
            }


            Column {
                ElevatedCard(

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier
                        .size(width = 120.dp, height = 80.dp)
                ) {

                    Box {

                        Image(
                            painter = painterResource(id = R.drawable.vegetables),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(16.dp))
                        )
                    }


                }

                ClickableText(
                    text = AnnotatedString("Vegetables"),
                    onClick ={},
                    style = TextStyle(
                        color = blue,
                     fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif),
                    modifier = Modifier.padding(10.dp)
                )
            }


        }


            Spacer(modifier = Modifier.height(40.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                modifier = Modifier.padding(10.dp, 0.dp, 100.dp, 0.dp)
            ) {

                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier
                        .size(width = 120.dp, height = 120.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.earth),
                        contentDescription = null,
                        modifier = Modifier
                            .size(70.dp)
                            .padding(16.dp)
                    )
                    Column(
                        modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        ClickableText(text = AnnotatedString("Explore"), onClick = {
                            navController.navigate(route = BottomBarScreen.Search.route)
                        })
                        ClickableText(text = AnnotatedString("the variety"), onClick = {
                            navController.navigate(route = BottomBarScreen.Search.route)
                        })
                    }


                }

                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier
                        .size(width = 120.dp, height = 120.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.question),
                        contentDescription = null,
                        modifier = Modifier
                            .size(70.dp)
                            .padding(16.dp)
                    )
                    Column(
                        modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)
                    ) {
//                        Text(text = "Ways")
                        ClickableText(text = AnnotatedString("Ways"), onClick = {
                            navController.navigate(route = BottomBarScreen.Search.route)
                        })
                        ClickableText(text = AnnotatedString("to help you"), onClick = {
                            navController.navigate(route = BottomBarScreen.Search.route)
                        })
                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            ElevatedCard(

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .padding(20.dp, 0.dp, 20.dp, 0.dp)
                    .size(width = 450.dp, height = 400.dp)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.fruits_vegetables),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier
                            .padding(30.dp, 20.dp, 30.dp, 100.dp)
                    ) {
                        Text(
                            text = "Your home of Fresh Produce!",
                            color = blue


                        )

                        Text(
                            text = "Shop groceries and",
                            color = blue,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.ExtraBold,


                            )
                        Text(
                            text = "get the right deals",
                            color = blue,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.ExtraBold,


                            )
                        Text(
                            text = "for you",
                            color = blue,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.ExtraBold,


                            )


                    }
                }

            }

            Spacer(modifier = Modifier.height(20.dp))

            ElevatedCard(

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .padding(20.dp, 0.dp, 20.dp, 0.dp)
                    .size(width = 450.dp, height = 400.dp)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.delivery_man),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop
                    )

                    Column(
                        modifier = Modifier
                            .padding(30.dp, 20.dp, 30.dp, 100.dp)
                    ) {
                        Text(
                            text = "Track your delivery",
                            color = blue,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier

                        )

                        Text(
                            text = "using the fastest ",
                            color = blue,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier

                        )

                        Text(
                            text = "delivery service",
                            color = blue,
                            fontSize = 25.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier

                        )
                    }

                }

            }
            Spacer(modifier = Modifier.height(100.dp))

        }
    }


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreen() {
    GroceryHubTheme {
        HomeScreen(rememberNavController())
    }
}