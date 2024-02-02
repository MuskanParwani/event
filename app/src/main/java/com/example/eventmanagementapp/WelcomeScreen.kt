package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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

@Composable
fun WelcomeScreen(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF161A1D))
            .padding(bottom = 161.5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            Image(painter = painterResource(id = R.drawable.thunder1), contentDescription = null)
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
                    text = "Enter your student email to continue",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF))
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
                    value = email , onValueChange = { email = it

                    } )
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
                    value = password , onValueChange = { password = it

                    } ,
                    trailingIcon = { Image(painter = painterResource(id = R.drawable.eye), contentDescription = null )
                    })
            }

            Button ( onClick = {},
                modifier = Modifier
                    .width(343.dp)
                    .height(40.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0x29ACCAE7),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color(0xFFB899FF), shape = RoundedCornerShape(size = 8.dp))
                    .clip(RoundedCornerShape(8)),
                contentPadding = PaddingValues(12.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFB899FF))
            ){
                Text(text = "Continue",
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
                    text = "Don't have an account?",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    )
                )
                Text(
                    text = "Signup",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB899FF),
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Divider(modifier = Modifier
                    .width(151.dp),
                    color = Color(0x29A1BDD9) ,
                    thickness = 1.dp)
                Text(
                    text = "OR",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    )
                )
                Divider(modifier = Modifier
                    .width(151.dp),
                    color = Color(0x29A1BDD9),
                    thickness = 1.dp)
            }
            Button ( onClick = {},
                modifier = Modifier
                    .width(343.dp)
                    .height(40.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0x29ACCAE7),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color(0x14A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                    .clip(RoundedCornerShape(8)),
                contentPadding = PaddingValues(top = 12.dp, bottom = 12.dp),
                colors = ButtonDefaults.buttonColors(Color(0x14A1BDD9))
            ){
                Image(painter = painterResource(id = R.drawable.google), contentDescription = null )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Continue wth Google",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                        color = Color(0xE5DFEFFF)
                    )
                )
            }

            Row {
                Text(
                    text = "Not a students?",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF)
                    )
                )
                Text(
                    text = " manage your events",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB899FF)
                    )
                )
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewScreen() {
    WelcomeScreen()

}