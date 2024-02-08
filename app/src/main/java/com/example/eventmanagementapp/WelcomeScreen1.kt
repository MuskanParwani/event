package com.example.eventmanagementapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun WelcomeScreen1(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF161A1D))
            .padding(bottom = 161.5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            Image(painter = painterResource(id = R.drawable.thunder), contentDescription = null)
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Welcome",
                    style = TextStyle(
                        fontSize = 24.sp,
                        lineHeight = 32.sp,
                        fontWeight = FontWeight(600),
                        color = Color.White
                    )
                )
                Text(
                    text = "Enter your event id and password to manage",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color.White
                    )
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Email",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color.White,
                    )
                )
                OutlinedTextField(
                    modifier = Modifier.width(343.dp),
                    // .height(40.dp),
                    value = email, onValueChange = {
                        email = it

                    },
                    textStyle = TextStyle(color = Color.White)

                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Password",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color.White,
                    )
                )
                OutlinedTextField(
                    modifier = Modifier.width(343.dp),
                    // .height(40.dp),
                    value = password, onValueChange = {
                        password = it

                    },
                    textStyle = TextStyle(color = Color.White),
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.eye),
                            contentDescription = null
                        )
                    })
            }

            Button(
                onClick = { navController.navigate(route = "MyEvents") },
                modifier = Modifier
                    .width(343.dp)
                    .height(40.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0x29ACCAE7),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color(0xFFAE5707), shape = RoundedCornerShape(size = 8.dp))
                    .clip(RoundedCornerShape(8)),
                contentPadding = PaddingValues(12.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFAE5707))
            ) {
                Text(
                    text = "Continue",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                        color = Color(0xE5161A1D)
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Not a sponsor?",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    )
                )
                Text(
                    text = "Login",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFAE5707),
                    )
                )
                Text(
                    text = "with student email",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Divider(
                    modifier = Modifier
                        .width(151.dp),
                    color = Color(0x29A1BDD9),
                    thickness = 1.dp
                )
                Text(
                    text = "OR",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    )
                )
                Divider(
                    modifier = Modifier
                        .width(151.dp),
                    color = Color(0x29A1BDD9),
                    thickness = 1.dp
                )
            }
            Row {
                Text(
                    text = "Signup ",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFF58419)
                    )
                )
                Text(
                    text = "for an account",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFFF)
                    )
                )
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewLogo() {
    WelcomeScreen1(navController = rememberNavController())
    // WelcomeScreen1(navController = rememberNavController())

}
