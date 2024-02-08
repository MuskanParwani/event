package com.example.eventmanagementapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MyEvents5(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF161A1D))
    ) {
        Image(modifier = Modifier
            .fillMaxWidth(),
            contentScale = ContentScale.FillWidth,
            painter = painterResource(id = R.drawable.image),
            contentDescription = null)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                //.width(340.dp)
                // .height(60.dp)
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(58.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.Top,
        ){
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0x29A1BDD9),
                            shape = RoundedCornerShape(size = 52.dp)
                        )
                        .width(36.dp)
                        .height(36.dp)
                        .background(
                            color = Color(0x14A1BDD9),
                            shape = RoundedCornerShape(size = 52.dp)
                        )
                        .padding(start = 6.dp, top = 6.dp, end = 6.dp, bottom = 6.dp),
                    horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(painter = painterResource(id = R.drawable.edit), contentDescription = null )
                }
                Text(
                    text = "Edit",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    ))
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0x29A1BDD9),
                            shape = RoundedCornerShape(size = 52.dp)
                        )
                        .width(36.dp)
                        .height(36.dp)
                        .background(
                            color = Color(0x14A1BDD9),
                            shape = RoundedCornerShape(size = 52.dp)
                        )
                        .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(painter = painterResource(id = R.drawable.share), contentDescription = null )
                }
                Text(
                    text = "Share",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    ))
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0x29A1BDD9),
                            shape = RoundedCornerShape(size = 52.dp)
                        )
                        .width(36.dp)
                        .height(36.dp)
                        .background(
                            color = Color(0x14A1BDD9),
                            shape = RoundedCornerShape(size = 52.dp)
                        )
                        .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(painter = painterResource(id = R.drawable.invite), contentDescription = null )
                }
                Text(
                    text = "Invite",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    ))
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 16.dp, top = 12.dp, end = 16.dp, bottom = 12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Column (
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ){
                Text(
                    text = "FREE",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF7EE2B8),
                    ))
                Text(
                    text = "DJ Night",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xE5DFEFFF),
                    ))
                Row {
                    Text(
                        text = "Hosted by Club Name",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xA6DFEFFF),
                        ))
                    Image(modifier = Modifier.padding(1.dp),
                        painter = painterResource(id = R.drawable.star), contentDescription = null )
                    Text(
                        text = "4.3 (150)",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xA6DFEFFF),
                        ))

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(32.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(painter = painterResource(id = R.drawable.symbols_map), contentDescription = null)
                Text(
                    text = "Full address goes gere",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xE5DFEFFF),
                    ))

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(32.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(painter = painterResource(id = R.drawable.clock), contentDescription = null)
                Text(
                    text = "Full address goes gere",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xE5DFEFFF),
                    ))

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(124.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "About",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xE5DFEFFF),
                    ))
                Text(
                    text = "Lorem ipsum dolor sit amet consectetur. Egestas purus lectus purus ut pellentesque ultrices in. Amet risus eget amet quam. Sollicitudin at venenatis quis molestie at volutpat amet magnis feugiat. Eu dictum sed mauris id malesuada.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xE5DFEFFF),
                    ))
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Attendees",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFF4F7FB),
                    ))
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(36.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Box(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color(0x29A1BDD9),
                                shape = RoundedCornerShape(size = 52.dp)
                            )
                            .width(36.dp)
                            .height(36.dp)
                            .clickable { navController.navigate(route = "PendingRequests") }
                            .background(
                                color = Color(0x14A1BDD9),
                                shape = RoundedCornerShape(size = 52.dp)
                            )
                            .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp),
                        //horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                        // verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(painter = painterResource(id = R.drawable.clock), contentDescription = null )
                    }
                   ClickableText(text = AnnotatedString("13 pending requests",
                       ),
                       onClick = {

                       })
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(36.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Image(
                        painter = painterResource(id = R.drawable.image2),
                        contentDescription = "image description",
                        //contentScale = ContentScale.FillBounds
                    )
                    Column(
                        modifier = Modifier
                            .width(85.dp)
                            .height(36.dp),
                        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Text(
                            text = "Lorem ipsum",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xE5DFEFFF),
                            ))
                        Text(
                            text = "Batch Name",
                            style = TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xA6DFEFFF),
                            )
                        )

                    }

                }
                Button ( onClick = {},
                    modifier = Modifier
                        .width(351.dp)
                        .height(44.dp)
                        //.border(width = 1.dp, color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .background(
                            color = Color(0xFFB899FF),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top = 12.dp, bottom = 12.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFB899FF))
                ){
                    Text(
                        text = "Check in Attendees",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            textAlign = TextAlign.Center,
                            color = Color(0xFF6650a4)))
                }



            }


        }
    }
}


@Preview(showBackground = true)
@Composable
fun previewMyEvents5() {
    MyEvents5(navController = rememberNavController())
}
