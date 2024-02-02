package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun AddYourInterest() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF161A1D))
    ) {
        Row(
            modifier = Modifier
                .border(width = 1.dp, color = Color(0x29A1BDD9))
                .fillMaxWidth()
                //.height(48.dp)
                .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(painter = painterResource(id = R.drawable.arrow), contentDescription = null)
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                // .height(24.dp),
                text = "Add your Interests",
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xE5DFEFFF),
                    textAlign = TextAlign.Center
                )
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                //.height(328.dp)
                .padding(start = 12.dp, top = 16.dp, end = 12.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ){
            Text(
                text = "Select your favourite Interest",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xA6DFEFFF),))
            Row (modifier = Modifier
                .fillMaxWidth()
               //.width(351.dp)
                .height(264.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                verticalAlignment = Alignment.Top,
                ){
                Button ( onClick = {},
                    modifier = Modifier
                        .width(94.dp)
                        .height(34.dp)
                        .border(width = 2.dp, color = Color(0xFF579DFF), shape = RoundedCornerShape(size = 8.dp))
                        .background(color = Color(0x14A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top= 7.dp, bottom = 7.dp, start = 12.dp, end = 12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0x14A1BDD9))
                ){
                    Text(text = "Interest ",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            textAlign = TextAlign.Center,
                            color = Color(0xFF73ABFB)
                        )
                    )
                }
                Button ( onClick = {},
                    modifier = Modifier
                        .width(94.dp)
                        .height(34.dp)
                        .border(width = 2.dp, color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .background(color = Color(0x14A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top= 7.dp, bottom = 7.dp, start = 12.dp, end = 12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0x14A1BDD9))
                ){
                    Text(text = "Interest ",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            textAlign = TextAlign.Center,
                            color = Color(0xE5DFEFFF)
                        )
                    )
                }
                Button ( onClick = {},
                    modifier = Modifier
                        .width(129.dp)
                        .height(34.dp)
                        .border(width = 2.dp, color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .background(color = Color(0x14A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top= 7.dp, bottom = 7.dp, start = 12.dp, end = 12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0x14A1BDD9))
                ){
                    Text(text = "Loreum Ispum",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            textAlign = TextAlign.Center,
                            color = Color(0xE5DFEFFF)
                        )
                    )
                }

                Button ( onClick = {},
                    modifier = Modifier
                        .width(85.dp)
                        .height(34.dp)
                        .border(width = 2.dp, color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .background(color = Color(0x14A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top= 7.dp, bottom = 7.dp, start = 12.dp, end = 12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0x14A1BDD9))
                ){
                    Text(text = "Loreum",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            textAlign = TextAlign.Center,
                            color = Color(0xE5DFEFFF)
                        )
                    )
                }
                Button ( onClick = {},
                    modifier = Modifier
                        .width(94.dp)
                        .height(34.dp)
                        .border(width = 2.dp, color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .background(color = Color(0x14A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top= 7.dp, bottom = 7.dp, start = 12.dp, end = 12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0x14A1BDD9))
                ){
                    Text(text = "Interest ",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            textAlign = TextAlign.Center,
                            color = Color(0xE5DFEFFF)
                        )
                    )
                }






            }












        }

    }
}

@Preview(showBackground = true)
@Composable
fun previewInterest(){
    AddYourInterest()
}