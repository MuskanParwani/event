package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion.FillWidth
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
fun MyEvents(navController: NavController)
{
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xFF161A1D))
                        .padding(bottom = 44.dp),
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
                                text = "My Events",
                                style = TextStyle(
                                        fontSize = 18.sp,
                                        lineHeight = 24.sp,
                                        fontWeight = FontWeight(500),
                                        color = Color(0xE5DFEFFF),
                                        textAlign = TextAlign.Center,)
                        )
                }
                Column(
                        modifier = Modifier
                                .fillMaxHeight()
                                //width(375.dp)
                                //.height(676.dp)
                                .padding(start = 12.dp, top = 16.dp, end = 12.dp, bottom = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        ){
                        Row (
                                modifier = Modifier
                                        .fillMaxWidth()
                                        //.width(351.dp)
                                        //.height(40.dp)
                                        // .background(color = Color(0x14A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                                        .padding(
                                                start = 4.dp,
                                                top = 4.dp,
                                                end = 4.dp,
                                                bottom = 4.dp
                                        ),
                                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.Top,
                                ){
                                Button ( onClick = {},
                                        modifier = Modifier
                                                .width(165.5.dp)
                                                .height(32.dp)
                                                .border(
                                                        width = 4.dp,
                                                        color = Color(0x29ACCAE7),
                                                        shape = RoundedCornerShape(size = 8.dp)
                                                )
                                                .background(
                                                        color = Color.Gray,
                                                        shape = RoundedCornerShape(size = 8.dp)
                                                )
                                                .clip(RoundedCornerShape(8)),
                                        contentPadding = PaddingValues(horizontal = 44.dp, vertical = 6.dp),
                                        colors = ButtonDefaults.buttonColors(Color.Gray)
                                ){
                                        Text(text = "Attending",
                                                style = TextStyle(
                                                        fontSize = 14.sp,
                                                        lineHeight = 20.sp,
                                                        fontWeight = FontWeight(500),
                                                        textAlign = TextAlign.Center,
                                                        color = Color(0xA6DFEFFF)))
                                }
                                Button ( onClick = {navController.navigate(route = "MyEvents1")},
                                        modifier = Modifier
                                                .width(165.5.dp)
                                                .height(32.dp)
                                                .border(
                                                        width = 4.dp,
                                                        color = Color(0x29ACCAE7),
                                                        shape = RoundedCornerShape(size = 8.dp)
                                                )
                                                .background(
                                                        color = Color(0xFF783FF8),
                                                        shape = RoundedCornerShape(size = 8.dp)
                                                )
                                                .clip(RoundedCornerShape(8)),
                                        contentPadding = PaddingValues(horizontal = 44.dp, vertical = 6.dp),
                                        colors = ButtonDefaults.buttonColors(Color(0xFF783FF8))
                                ){
                                        Text(text = "Hosting",
                                                style = TextStyle(
                                                        fontSize = 14.sp,
                                                        lineHeight = 20.sp,
                                                        fontWeight = FontWeight(500),
                                                        textAlign = TextAlign.Center,
                                                        color = Color(0xA6DFEFFF)))
                                }
                        }
                        Text(
                                text = "Active Events",
                                style = TextStyle(
                                        fontSize = 16.sp,
                                        lineHeight = 20.sp,
                                        fontWeight = FontWeight(600),
                                        color = Color(0xE5DFEFFF)
                                ))

                        Box(
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .height(168.dp)
                                        .border(
                                                width = 1.dp,
                                                color = Color(0x29A1BDD9),
                                                shape = RoundedCornerShape(size = 6.dp)
                                        )
                        ) {
                                Image(
                                        modifier = Modifier
                                                .fillMaxWidth(),
                                        contentScale = ContentScale.FillWidth,
                                        painter = painterResource(id = R.drawable.image),
                                        contentDescription = null
                                )

                                Row(
                                        modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 8.dp, top = 8.dp, end = 8.dp),
                                        // .align(Alignment.TopStart),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.Top,
                                ) {
                                        Row(
                                                modifier = Modifier
                                                        .border(
                                                                width = 1.dp,
                                                                color = Color(0x29A1BDD9),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .width(85.dp)
                                                        .height(20.dp)
                                                        .background(
                                                                color = Color(0xFF1B1831),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .padding(
                                                                start = 7.dp,
                                                                top = 4.dp,
                                                                end = 7.dp,
                                                                bottom = 4.dp
                                                        ),
                                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                                                verticalAlignment = Alignment.Top,
                                        ) {
                                                Image(painter = painterResource(id = R.drawable.celebrate), contentDescription = null)
                                                Text(
                                                        text = "Celebration",
                                                        style = TextStyle(
                                                                fontSize = 10.sp,
                                                                lineHeight = 12.sp,
                                                                fontWeight = FontWeight(400),
                                                                color = Color(0xFF68BEC6),
                                                                textAlign = TextAlign.Center
                                                        ))
                                        }
                                        Row(
                                                modifier = Modifier
                                                        .border(
                                                                width = 1.dp,
                                                                color = Color(0x29A1BDD9),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .width(39.dp)
                                                        .height(20.dp)
                                                        .background(
                                                                color = Color(0xFF1B1831),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .padding(
                                                                start = 7.dp,
                                                                top = 4.dp,
                                                                end = 7.dp,
                                                                bottom = 4.dp
                                                        ),
                                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.End),
                                                verticalAlignment = Alignment.Top,
                                        ) {
                                                Text(
                                                        text = "FREE",
                                                        style = TextStyle(
                                                                fontSize = 10.sp,
                                                                lineHeight = 12.sp,
                                                                fontWeight = FontWeight(400),
                                                                color = Color(0xFF68BEC6),
                                                                textAlign = TextAlign.Center
                                                        ))
                                        }
                                }
                                Column (
                                        modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(top = 8.dp, start = 8.dp, bottom = 8.dp)
                                                .align(Alignment.BottomStart),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.spacedBy(0.dp)
                                ) {
                                        Text(
                                                text = "DJ Night",
                                                style = TextStyle(
                                                        fontSize = 14.sp,
                                                        lineHeight = 20.sp,
                                                        fontWeight = FontWeight(600),
                                                        color = Color(0xE5DFEFFF),
                                                ))
                                        Text(
                                                text = "27 Dec, 8AM - 12PM",
                                                style = TextStyle(
                                                        fontSize = 12.sp,
                                                        lineHeight = 16.sp,
                                                        fontWeight = FontWeight(400),
                                                        color = Color(0xE5DFEFFF),
                                                )
                                        )
                                }
                        }

                        Text(
                                text = "Past Events",
                                style = TextStyle(
                                        fontSize = 16.sp,
                                        lineHeight = 20.sp,
                                        fontWeight = FontWeight(600),
                                        color = Color(0xE5DFEFFF)
                                ))


                        Box(
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .height(168.dp)
                                        .border(
                                                width = 1.dp,
                                                color = Color(0x29A1BDD9),
                                                shape = RoundedCornerShape(size = 6.dp)
                                        )
                        ) {
                                Image(
                                        modifier = Modifier
                                                .fillMaxWidth(),
                                        contentScale = ContentScale.FillWidth,
                                        painter = painterResource(id = R.drawable.image),
                                        contentDescription = null
                                )

                                Row(
                                        modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 8.dp, top = 8.dp, end = 8.dp),
                                        // .align(Alignment.TopStart),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.Top,
                                ) {
                                        Row(
                                                modifier = Modifier
                                                        .border(
                                                                width = 1.dp,
                                                                color = Color(0x29A1BDD9),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .width(85.dp)
                                                        .height(20.dp)
                                                        .background(
                                                                color = Color(0xFF1B1831),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .padding(
                                                                start = 7.dp,
                                                                top = 4.dp,
                                                                end = 7.dp,
                                                                bottom = 4.dp
                                                        ),
                                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                                                verticalAlignment = Alignment.Top,
                                        ) {
                                                Image(painter = painterResource(id = R.drawable.celebrate), contentDescription = null)
                                                Text(
                                                        text = "Celebration",
                                                        style = TextStyle(
                                                                fontSize = 10.sp,
                                                                lineHeight = 12.sp,
                                                                fontWeight = FontWeight(400),
                                                                color = Color(0xFF68BEC6),
                                                                textAlign = TextAlign.Center
                                                        ))
                                        }
                                        Row(
                                                modifier = Modifier
                                                        .border(
                                                                width = 1.dp,
                                                                color = Color(0x29A1BDD9),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .width(39.dp)
                                                        .height(20.dp)
                                                        .background(
                                                                color = Color(0xFF1B1831),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .padding(
                                                                start = 7.dp,
                                                                top = 4.dp,
                                                                end = 7.dp,
                                                                bottom = 4.dp
                                                        ),
                                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.End),
                                                verticalAlignment = Alignment.Top,
                                        ) {
                                                Text(
                                                        text = "FREE",
                                                        style = TextStyle(
                                                                fontSize = 10.sp,
                                                                lineHeight = 12.sp,
                                                                fontWeight = FontWeight(400),
                                                                color = Color(0xFF68BEC6),
                                                                textAlign = TextAlign.Center
                                                        ))
                                        }
                                }
                                Column (
                                        modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(top = 8.dp, start = 8.dp, bottom = 8.dp)
                                                .align(Alignment.BottomStart),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.spacedBy(0.dp)
                                ) {
                                        Text(
                                                text = "DJ Night",
                                                style = TextStyle(
                                                        fontSize = 14.sp,
                                                        lineHeight = 20.sp,
                                                        fontWeight = FontWeight(600),
                                                        color = Color(0xE5DFEFFF),
                                                ))
                                        Text(
                                                text = "27 Dec, 8AM - 12PM",
                                                style = TextStyle(
                                                        fontSize = 12.sp,
                                                        lineHeight = 16.sp,
                                                        fontWeight = FontWeight(400),
                                                        color = Color(0xE5DFEFFF),
                                                )
                                        )
                                }
                        }

                        Box(
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .height(168.dp)
                                        .border(
                                                width = 1.dp,
                                                color = Color(0x29A1BDD9),
                                                shape = RoundedCornerShape(size = 6.dp)
                                        )
                        ) {
                                Image(
                                        modifier = Modifier
                                                .fillMaxWidth(),
                                        contentScale = ContentScale.FillWidth,
                                        painter = painterResource(id = R.drawable.image),
                                        contentDescription = null
                                )

                                Row(
                                        modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 8.dp, top = 8.dp, end = 8.dp),
                                        // .align(Alignment.TopStart),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.Top,
                                ) {
                                        Row(
                                                modifier = Modifier
                                                        .border(
                                                                width = 1.dp,
                                                                color = Color(0x29A1BDD9),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .width(85.dp)
                                                        .height(20.dp)
                                                        .background(
                                                                color = Color(0xFF1B1831),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .padding(
                                                                start = 7.dp,
                                                                top = 4.dp,
                                                                end = 7.dp,
                                                                bottom = 4.dp
                                                        ),
                                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                                                verticalAlignment = Alignment.Top,
                                        ) {
                                                Image(painter = painterResource(id = R.drawable.celebrate), contentDescription = null)
                                                Text(
                                                        text = "Celebration",
                                                        style = TextStyle(
                                                                fontSize = 10.sp,
                                                                lineHeight = 12.sp,
                                                                fontWeight = FontWeight(400),
                                                                color = Color(0xFF68BEC6),
                                                                textAlign = TextAlign.Center
                                                        ))
                                        }
                                        Row(
                                                modifier = Modifier
                                                        .border(
                                                                width = 1.dp,
                                                                color = Color(0x29A1BDD9),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .width(39.dp)
                                                        .height(20.dp)
                                                        .background(
                                                                color = Color(0xFF1B1831),
                                                                shape = RoundedCornerShape(size = 5.dp)
                                                        )
                                                        .padding(
                                                                start = 7.dp,
                                                                top = 4.dp,
                                                                end = 7.dp,
                                                                bottom = 4.dp
                                                        ),
                                                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.End),
                                                verticalAlignment = Alignment.Top,
                                        ) {
                                                Text(
                                                        text = "FREE",
                                                        style = TextStyle(
                                                                fontSize = 10.sp,
                                                                lineHeight = 12.sp,
                                                                fontWeight = FontWeight(400),
                                                                color = Color(0xFF68BEC6),
                                                                textAlign = TextAlign.Center
                                                        ))
                                        }
                                }
                                Column (
                                        modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(top = 8.dp, start = 8.dp, bottom = 8.dp)
                                                .align(Alignment.BottomStart),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.spacedBy(0.dp)
                                ) {
                                        Text(
                                                text = "DJ Night",
                                                style = TextStyle(
                                                        fontSize = 14.sp,
                                                        lineHeight = 20.sp,
                                                        fontWeight = FontWeight(600),
                                                        color = Color(0xE5DFEFFF),
                                                ))
                                        Text(
                                                text = "27 Dec, 8AM - 12PM",
                                                style = TextStyle(
                                                        fontSize = 12.sp,
                                                        lineHeight = 16.sp,
                                                        fontWeight = FontWeight(400),
                                                        color = Color(0xE5DFEFFF),
                                                )
                                        )
                                }
                        }



                }

        }
}








@Preview(showBackground = true)
@Composable
fun preview() {

MyEvents(navController = rememberNavController())
}