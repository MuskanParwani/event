package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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


data class PendingRequest(val fullName: String, val campusTitle: String)


@Composable
fun PendingRequests(navController: NavController) {
    val pendingRequestsList = remember {
        listOf(
            PendingRequest("Full Name 1", "Campus Title"),
            PendingRequest("Full Name 2", "Campus Title"),
            PendingRequest("Full Name 3", "Campus Title"),

            )
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF161A1D)),
        verticalArrangement = Arrangement.spacedBy(8.dp,Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 16.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    // .border(width = 1.dp, color = Color(0x29A1BDD9))
                    .height(48.dp)
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(24.dp),
                    text = "Pending Requests",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xE5DFEFFF),
                        textAlign = TextAlign.Center
                    )
                )
            }
        }

        items(pendingRequestsList) { pendingRequest ->
            PendingRequestItem(pendingRequest, rememberNavController(), onClick = {
                navController.navigate("pendingrequestdetail")

            })
        }
    }
}

@Composable
fun PendingRequestItem(pendingRequest: PendingRequest,navController: NavController,
                       onClick:()-> Unit) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(36.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.image2),
                contentDescription = "image description",
                //contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .height(36.dp)
                    .clickable {
                               onClick.invoke()
                    },
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = pendingRequest.fullName,
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xE5DFEFFF),
                    )
                )
                Text(
                    text = pendingRequest.campusTitle,
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    )
                )
            }
            Row(
                modifier = Modifier
                    .width(74.dp)
                    .height(32.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.End),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.check_yes),
                    contentDescription = null
                )
                Image(
                    painter = painterResource(id = R.drawable.check_no),
                    contentDescription = null
                )
            }
        }
    }





@Preview(showBackground = true)
@Composable
fun previewReq() {
   PendingRequests(rememberNavController())
}


//@Composable
//fun PendingRequests(){
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xFF161A1D))
//    ) {
//        Row (
//            modifier = Modifier
//                .border(width = 1.dp, color = Color(0x29A1BDD9))
//                .fillMaxWidth()
//                //.width(375.dp)
//                .height(48.dp)
//                .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
//            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
//            verticalAlignment = Alignment.CenterVertically,
//
//            )
//        {
//            Image(painter = painterResource(id = R.drawable.arrow), contentDescription = null )
//
//            Text(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(24.dp),
//                text = "Pending Requests",
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    lineHeight = 24.sp,
//                    fontWeight = FontWeight(500),
//                    color = Color(0xE5DFEFFF),
//                    textAlign = TextAlign.Center)
//            )
//        }
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(604.dp)
//                .padding(horizontal = 12.dp, vertical = 16.dp),
//            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    //.width(345.dp)
//                    .height(36.dp),
//                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.image2),
//                    contentDescription = "image description",
//                    //contentScale = ContentScale.FillBounds
//                )
//                Column(
//                    modifier = Modifier
//                        .width(225.dp)
//                        .height(36.dp),
//                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
//                    horizontalAlignment = Alignment.Start,
//                ) {
//                    Text(
//                        text = "Full Name",
//                        style = TextStyle(
//                            fontSize = 14.sp,
//                            lineHeight = 20.sp,
//                            fontWeight = FontWeight(400),
//                            color = Color(0xE5DFEFFF),
//                        ))
//                    Text(
//                        text = "Campus Title",
//                        style = TextStyle(
//                            fontSize = 12.sp,
//                            lineHeight = 16.sp,
//                            fontWeight = FontWeight(400),
//                            color = Color(0xA6DFEFFF),
//                        )
//                    )
//
//                }
//                Row(
//                    modifier = Modifier
//                        .width(74.dp)
//                        .height(32.dp),
//                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.End),
//                    verticalAlignment = Alignment.CenterVertically
//                ){
//                    Image(painter = painterResource(id = R.drawable.check_yes), contentDescription = null)
//                    Image(painter = painterResource(id = R.drawable.check_no), contentDescription = null)
//
//
//                }
//
//
//            }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    //.width(345.dp)
//                    .height(36.dp),
//                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.image2),
//                    contentDescription = "image description",
//                    //contentScale = ContentScale.FillBounds
//                )
//                Column(
//                    modifier = Modifier
//                        .width(225.dp)
//                        .height(36.dp),
//                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
//                    horizontalAlignment = Alignment.Start,
//                ) {
//                    Text(
//                        text = "Full Name",
//                        style = TextStyle(
//                            fontSize = 14.sp,
//                            lineHeight = 20.sp,
//                            fontWeight = FontWeight(400),
//                            color = Color(0xE5DFEFFF),
//                        ))
//                    Text(
//                        text = "Campus Title",
//                        style = TextStyle(
//                            fontSize = 12.sp,
//                            lineHeight = 16.sp,
//                            fontWeight = FontWeight(400),
//                            color = Color(0xA6DFEFFF),
//                        )
//                    )
//
//                }
//                Row(
//                    modifier = Modifier
//                        .width(74.dp)
//                        .height(32.dp),
//                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.End),
//                    verticalAlignment = Alignment.CenterVertically
//                ){
//                    Image(painter = painterResource(id = R.drawable.check_yes), contentDescription = null)
//                    Image(painter = painterResource(id = R.drawable.check_no), contentDescription = null)
//
//
//                }
//
//
//            }
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    //.width(345.dp)
//                    .height(36.dp),
//                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.image2),
//                    contentDescription = "image description",
//                    //contentScale = ContentScale.FillBounds
//                )
//                Column(
//                    modifier = Modifier
//                        .width(225.dp)
//                        .height(36.dp),
//                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
//                    horizontalAlignment = Alignment.Start,
//                ) {
//                    Text(
//                        text = "Full Name",
//                        style = TextStyle(
//                            fontSize = 14.sp,
//                            lineHeight = 20.sp,
//                            fontWeight = FontWeight(400),
//                            color = Color(0xE5DFEFFF),
//                        ))
//                    Text(
//                        text = "Campus Title",
//                        style = TextStyle(
//                            fontSize = 12.sp,
//                            lineHeight = 16.sp,
//                            fontWeight = FontWeight(400),
//                            color = Color(0xA6DFEFFF),
//                        )
//                    )
//
//                }
//                Row(
//                    modifier = Modifier
//                        .width(74.dp)
//                        .height(32.dp),
//                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.End),
//                    verticalAlignment = Alignment.CenterVertically
//                ){
//                    Image(painter = painterResource(id = R.drawable.check_yes), contentDescription = null)
//                    Image(painter = painterResource(id = R.drawable.check_no), contentDescription = null)
//
//
//                }
//
//
//            }
//
//
//        }
//        }
//
//
//}