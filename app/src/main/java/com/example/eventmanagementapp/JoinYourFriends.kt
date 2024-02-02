package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JoinYourFriends() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF161A1D))
    ) {
        Scaffold(
            containerColor = Color(0xFF161A1D),
            topBar = {
                Row(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color(0x29A1BDD9))
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow), contentDescription = null,
                        //alignment = Alignment.CenterStart
                    )
                    Text(
                        modifier = Modifier
                            .weight(1f)
                            .width(141.dp),
                        // .height(24.dp),
                        text = "Join your friends",
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xE5DFEFFF),
                            textAlign = TextAlign.Center
                        )
                    )
                    Text(
                        text = "Skip",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xE5DFEFFF),
                            textAlign = TextAlign.Right,
                        )
                    )
                }
                // Add your top bar here if needed
            },
            bottomBar = {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        //.width(351.dp)
                        .height(44.dp)
                      // .padding(start =12.dp , top = 12.dp , end = 12.dp, bottom = 16.dp)
                        .background(
                            color = Color(0xFFB899FF),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top = 12.dp, bottom = 12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFB899FF))
                ) {
                    Text(
                        text = "Allow contacts access",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(400),
                            textAlign = TextAlign.Center,
                            color = Color(0xE5161A1D)
                        )
                    )
                }

            },
            content = { innerPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(innerPadding)
                        .padding(start = 12.dp, top = 16.dp, end = 12.dp, bottom = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box(
                        modifier = Modifier
                            .width(124.dp)
                            .height(124.dp)
                            .border(
                                width = 1.dp,
                                color = Color(0x29A1BDD9),
                                shape = RoundedCornerShape(size = 104.dp)
                            )
                            .background(
                                color = Color(0x29A1BDD9),
                                shape = RoundedCornerShape(size = 104.dp)
                            )
                            .padding(start = 12.dp, top = 7.dp, end = 12.dp, bottom = 7.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = "image description",
                            contentScale = ContentScale.None
                        )
                    }
                    Text(
                        text = "Don’t want to share event you are joining with your friends?\nSettings -> Friend's & Social",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0x47BFDBF8),
                            textAlign = TextAlign.Center,
                        )
                    )
                }

            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun previewFriend(){
    JoinYourFriends()
}

//@Composable
//fun JoinYourFriends(){
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xFF161A1D))
//    ) {
//        Row(
//            modifier = Modifier
//                .border(width = 1.dp, color = Color(0x29A1BDD9))
//                .fillMaxWidth()
//                //.height(48.dp)
//                .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
//            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
//            verticalAlignment = Alignment.CenterVertically,
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.arrow), contentDescription = null,
//                //alignment = Alignment.CenterStart
//            )
//            Text(
//                modifier = Modifier
//                    .weight(1f)
//                    .width(141.dp),
//                // .height(24.dp),
//                text = "Join your friends",
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    lineHeight = 24.sp,
//                    fontWeight = FontWeight(500),
//                    color = Color(0xE5DFEFFF),
//                    textAlign = TextAlign.Center
//                ))
//            Text(
//                text = "Skip",
//                style = TextStyle(
//                    fontSize = 14.sp,
//                    lineHeight = 20.sp,
//                    fontWeight = FontWeight(500),
//                    color = Color(0xE5DFEFFF),
//                    textAlign = TextAlign.Right,
//                )
//            )
//        }
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(236.dp)
//                .padding(start = 12.dp, top = 16.dp, end = 12.dp, bottom = 16.dp),
//            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            ) {
//            Box(
//                modifier = Modifier
//                    .width(124.dp)
//                    .height(124.dp)
//                    .border(width = 1.dp, color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 104.dp))
//                    .background(color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 104.dp))
//                    .padding(start = 12.dp, top = 7.dp, end = 12.dp, bottom = 7.dp),
//                     contentAlignment = Alignment.Center
//            ){
//                Image(
//                    painter = painterResource(id = R.drawable.profile),
//                    contentDescription = "image description",
//                    contentScale = ContentScale.None
//                )
//            }
//            Text(
//                text = "Don’t want to share event you are joining with your friends?\nSettings -> Friend's & Social",
//                style = TextStyle(
//                    fontSize = 12.sp,
//                    lineHeight = 16.sp,
//                    fontWeight = FontWeight(400),
//                    color = Color(0x47BFDBF8),
//                    textAlign = TextAlign.Center,
//                )
//            )
//        }
//        Button ( onClick = {},
//            modifier = Modifier
//                .fillMaxWidth()
//               //.width(351.dp)
//                .height(44.dp)
//                .background(color = Color(0xFFB899FF), shape = RoundedCornerShape(size = 8.dp))
//                .clip(RoundedCornerShape(8)),
//            contentPadding = PaddingValues(top= 12.dp, bottom = 12.dp),
//            colors = ButtonDefaults.buttonColors(Color(0xFFB899FF))
//        ){
//            Text(text = "Allow contacts access",
//                style = TextStyle(
//                    fontSize = 12.sp,
//                    lineHeight = 16.sp,
//                    fontWeight = FontWeight(400),
//                    textAlign = TextAlign.Center,
//                    color = Color(0xE5161A1D)
//                )
//            )
//        }
//
//
//    }
//
//    }