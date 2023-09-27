package com.example.groceryhub.ui.theme.pages.login

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.groceryhub.R
import com.example.groceryhub.data.AuthRepository
import com.example.groceryhub.navigation.BottomBarScreen
import com.example.groceryhub.ui.theme.GroceryHubTheme
import com.example.groceryhub.ui.theme.blue

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current

        Image(painter = painterResource(id = R.drawable.vegetables_icon),
            contentDescription = null,
            modifier = Modifier
                .width(150.dp)
                .height(300.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Sign in",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            color = blue,
            modifier = Modifier.padding(0.dp, 0.dp, 150.dp, 0.dp),
            fontWeight = FontWeight.ExtraBold,

            )


        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Enter email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            shape = RoundedCornerShape(25.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            shape = RoundedCornerShape(25.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row{

            val checkedState = remember { mutableStateOf(true) }

            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = checkedState.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(10.dp, 2.dp, 20.dp,0.dp ),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { checkedState.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Remember me", modifier = Modifier.padding(0.dp, 16.dp, 0.dp,0.dp), color = blue)



            Spacer(modifier = Modifier.width(5.dp))

            ClickableText(
                text = AnnotatedString("Forgot password?"),
                onClick ={},
                style = TextStyle(
                    color = blue,
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif
                ),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

        }

        Button(onClick = {
            navController.navigate(route = BottomBarScreen.Search.route)
            //------ WRITE THE SIGN IN LOGIC HERE ------//
            var authRepository = AuthRepository(navController, context)
            authRepository.login(email.text.trim(), password.text.trim())

        },
            colors = ButtonDefaults.buttonColors(blue),
            modifier = Modifier
                .width(200.dp)) {
            Text(text = "Sign in",
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,)
        }
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreview() {
    GroceryHubTheme {
        LoginScreen(rememberNavController())
    }

}