package com.example.groceryhub.ui.theme.pages.shop

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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCartCheckout
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
import com.example.groceryhub.navigation.ROUTE_CART
import com.example.groceryhub.ui.theme.GroceryHubTheme
import com.example.groceryhub.ui.theme.blue

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun MarketScreen(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
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

            IconButton(onClick = {
                navController.navigate(ROUTE_CART)
            }) {
                Icon(
                    imageVector = Icons.Default.ShoppingCartCheckout,
                    contentDescription = "Account",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp),
                )
            }
        }


        Text(
            text = "Marketplace",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(20.dp, 20.dp, 210.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.offers_img),
            contentDescription = null,
            modifier = Modifier
                .width(450.dp)
                .height(250.dp)
                .padding(10.dp, 0.dp, 10.dp, 0.dp)
                .clip(RoundedCornerShape(16.dp))
        )


        Spacer(modifier = Modifier.height(20.dp))

        var text by rememberSaveable { mutableStateOf("") }
        var active by rememberSaveable { mutableStateOf(false) }

        Box(
            modifier = Modifier
//                .fillMaxSize()
                .width(350.dp)
                .semantics { isTraversalGroup = true })
        {
            SearchBar(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .semantics { traversalIndex = -1f },
                query = text,
                onQueryChange = { text = it },
                onSearch = { active = false },
                active = active,
                onActiveChange = {
                    active = it
                },
                placeholder = { Text("Search Here ...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                trailingIcon = { Icon(Icons.Default.MoreVert, contentDescription = null) },
            ) {
                repeat(4) { idx ->
                    val resultText = "Suggestion $idx"
                    ListItem(
                        headlineContent = { Text(resultText) },
                        supportingContent = { Text("Additional info") },
                        leadingContent = { Icon(Icons.Filled.Star, contentDescription = null) },
                        modifier = Modifier
                            .clickable {
                                text = resultText
                                active = false
                            }
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .padding(start = 10.dp)
                    .size(width = 100.dp, height = 100.dp)

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
                ClickableText(
                    text = AnnotatedString("Tomatoes"),
                    onClick = {},
                    style = TextStyle(
                        fontSize = 17.sp,
                        color = blue,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Text(text = "Price: Ksh 139 / kg",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                                contentDescription = "Location",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }
                    Text(text = "50 meters",
                        fontSize = 10.sp,
                        modifier = Modifier
                            .padding(0.dp, 12.dp, 0.dp, 0.dp))

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Remove,
                            contentDescription = "Add",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                }

            }


        }
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .padding(start = 10.dp)
                    .size(width = 100.dp, height = 100.dp)

            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.carrots),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop
                    )
                }
            }


            Column {
                ClickableText(
                    text = AnnotatedString("Carrots"),
                    onClick = {},
                    style = TextStyle(
                        fontSize = 17.sp,
                        color = blue,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Text(text = "Price: Ksh 120 / kg",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Location",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }
                    Text(text = "50 meters",
                        fontSize = 10.sp,
                        modifier = Modifier
                            .padding(0.dp, 12.dp, 0.dp, 0.dp))

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Remove,
                            contentDescription = "Add",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                }

            }


        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .padding(start = 10.dp)
                    .size(width = 100.dp, height = 100.dp)

            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.onions),
                        modifier = Modifier.fillMaxSize(),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop
                    )
                }
            }


            Column {
                ClickableText(
                    text = AnnotatedString("Onions"),
                    onClick = {},
                    style = TextStyle(
                        fontSize = 17.sp,
                        color = blue,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Text(text = "Price: Ksh 150 / kg",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Account",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }
                    Text(text = "30 meters",
                        fontSize = 10.sp,
                        modifier = Modifier
                            .padding(0.dp, 12.dp, 0.dp, 0.dp))

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Remove,
                            contentDescription = "Remove",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                }

            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .padding(start = 10.dp)
                    .size(width = 100.dp, height = 100.dp)

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
                ClickableText(
                    text = AnnotatedString("Rice"),
                    onClick = {},
                    style = TextStyle(
                        fontSize = 17.sp,
                        color = blue,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Text(text = "Price: Ksh 98 / kg ",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Account",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }
                    Text(text = "10km away.",
                        fontSize = 10.sp,
                        modifier = Modifier
                            .padding(0.dp, 12.dp, 0.dp, 0.dp))

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(blue),
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Remove,
                            contentDescription = "Remove",
                            modifier = Modifier
                                .size(15.dp),
                        )
                    }

                }

            }
        }



    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreen() {
    GroceryHubTheme {
        MarketScreen(rememberNavController())
    }
}