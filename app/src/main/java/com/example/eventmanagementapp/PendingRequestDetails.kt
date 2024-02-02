package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun PendingRequestdetails(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF161A1D)),
        //.padding(bottom = 44.dp),
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
    ){
        Row (
            modifier = Modifier
                .border(width = 1.dp, color = Color(0x29A1BDD9))
                .fillMaxWidth()
                //.width(375.dp)
                .height(48.dp)
                .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,

            )
        {
            Image(painter = painterResource(id = R.drawable.arrow), contentDescription = null )

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(24.dp),
                text = "Full Name",
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xE5DFEFFF),
                    textAlign = TextAlign.Center,)
            )

        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top)
        ){
            Box(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                contentAlignment = Alignment.Center
            ){
                Image(painter = painterResource(id = R.drawable.image2), contentDescription = null,
                    contentScale = ContentScale.FillBounds)
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, top = 16.dp, end = 8.dp, bottom = 16.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top)
            ){
                Text(text = "Submitted Details",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        lineHeight = 24.sp,
                        color = Color.White
                    )
                )
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        //.width(343.dp)
                        .height(40.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
                ){
                    Text(text = "Name",
                        style = TextStyle(
                            fontWeight = FontWeight(400) ,
                            fontSize = 12.sp ,
                            lineHeight = 16.sp,
                            color = Color.White
                        )
                    )
                    Text(text = "Full name",
                        style = TextStyle(
                            fontWeight =FontWeight(600) ,
                            fontSize = 14.sp ,
                            lineHeight = 20.sp,
                            color = Color.White
                        ))

                }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        //.width(343.dp)
                        .height(40.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
                ){
                    Text(text = "Email",
                        style = TextStyle(
                            fontWeight = FontWeight(400) ,
                            fontSize = 12.sp ,
                            lineHeight = 16.sp,
                            color = Color.White
                        )
                    )
                    Text(text = "email@gmail.com",
                        style = TextStyle(
                            fontWeight =FontWeight(600) ,
                            fontSize = 14.sp ,
                            lineHeight = 20.sp,
                            color = Color.White
                        ))

                }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        //.width(343.dp)
                        .height(40.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
                ){
                    Text(text = "Campus",
                        style = TextStyle(
                            fontWeight = FontWeight(400) ,
                            fontSize = 12.sp ,
                            lineHeight = 16.sp,
                            color = Color.White
                        )
                    )
                    Text(text = "Campus name",
                        style = TextStyle(
                            fontWeight =FontWeight(600) ,
                            fontSize = 14.sp ,
                            lineHeight = 20.sp,
                            color = Color.White
                        ))

                }



            }

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text( modifier = Modifier.width(307.dp),
                    text = "Campus",
                    style = TextStyle(
                        fontWeight = FontWeight(400) ,
                        fontSize = 12.sp ,
                        lineHeight = 16.sp,
                        color = Color.White
                    )
                )

                Image(painter = painterResource(id = R.drawable.arrowright), contentDescription = null )

            }


        }
    }

    }






@Preview(showBackground = true)
@Composable
fun previewReqDetails() {
    // HeaderRow1()
    PendingRequestdetails()
}