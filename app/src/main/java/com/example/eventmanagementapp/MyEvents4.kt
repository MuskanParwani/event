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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
@Composable
fun MyEvents4(navController: NavController){

    var bottomSheetState = rememberModalBottomSheetState();
    var scope = rememberCoroutineScope()
    var isBottomSheetOpen by remember {
        mutableStateOf(false)
    }
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                // .fillMaxHeight()
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
                    )
                )
                Text(
                    text = "DJ Night",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xE5DFEFFF),
                    )
                )
                Row {
                    Text(
                        text = "Hosted by Club Name",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xA6DFEFFF),
                        )
                    )
                    Image(modifier = Modifier.padding(1.dp),
                        painter = painterResource(id = R.drawable.star), contentDescription = null )
                    Text(
                        text = "4.3 (150)",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xA6DFEFFF),
                        )
                    )

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
                    text = "Full address goes here",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xE5DFEFFF),
                    )
                )

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
                    text = "Full address goes here",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xE5DFEFFF),
                    )
                )

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
                    )
                )

                Text(
                    text = "Lorem ipsum dolor sit amet consectetur. Egestas purus lectus purus ut pellentesque ultrices in. Amet risus eget amet quam. Sollicitudin at venenatis quis molestie at volutpat amet magnis feugiat. Eu dictum sed mauris id malesuada.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xE5DFEFFF),
                    )
                )

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
                    )
                )
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
                            .background(
                                color = Color(0x14A1BDD9),
                                shape = RoundedCornerShape(size = 52.dp)
                            )
                            .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp),
                        //horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                        // verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(painter = painterResource(id = R.drawable.invite), contentDescription = null )
                    }
                    Text(
                        text = "Invite friends",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFB899FF),
                        ))
                }
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
                            .background(
                                color = Color(0x14A1BDD9),
                                shape = RoundedCornerShape(size = 52.dp)
                            )
                            .padding(start = 8.dp, top = 8.dp, end = 8.dp, bottom = 8.dp),
                        //horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                        // verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(painter = painterResource(id = R.drawable.share), contentDescription = null )
                    }
                    Text(
                        text = "Share link",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFB899FF),
                        )
                    )
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
                            ))

                    }

                }

                Button ( onClick = {    scope.launch {
                        isBottomSheetOpen = true
                    }},
                    modifier = Modifier
                        .width(351.dp)
                        //.height(44.dp)
                        // .border(width = 1.dp, color = Color(0x29A1BDD9), shape = RoundedCornerShape(size = 8.dp))
                        .background(
                            color = Color(0xFFB899FF),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .clip(RoundedCornerShape(8)),
                    contentPadding = PaddingValues(top = 12.dp, bottom = 12.dp),
                   colors = ButtonDefaults.buttonColors(Color(0xFFB899FF))
                ){
                    Text(
                        text = "Rate Event",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight(500),
                            textAlign = TextAlign.Center,
                            color = Color(0xFF6650a4)
                        )
                    )
                }



            }


        }
        if (isBottomSheetOpen) {
            ModalBottomSheet(
                onDismissRequest = { isBottomSheetOpen = false },
                sheetState = bottomSheetState
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        // .height(247.dp)
                        .background(color = Color(0xFF161A1D))
                        .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 12.dp),
                    verticalArrangement = Arrangement.spacedBy(
                        12.dp,
                        Alignment.CenterVertically
                    ),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "How was your experience?",
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xE5DFEFFF),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,

                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.purple_star1),
                            contentDescription = "image description",
                            contentScale = ContentScale.None
                        )
                        Image(
                            painter = painterResource(id = R.drawable.purple_star1),
                            contentDescription = "image description",
                            contentScale = ContentScale.None
                        )
                        Image(
                            painter = painterResource(id = R.drawable.purple_star2),
                            contentDescription = "image description",
                            contentScale = ContentScale.None
                        )
                        Image(
                            painter = painterResource(id = R.drawable.purple_star2),
                            contentDescription = "image description",
                            contentScale = ContentScale.None
                        )
                        Image(
                            painter = painterResource(id = R.drawable.purple_star2),
                            contentDescription = "image description",
                            contentScale = ContentScale.None
                        )


                    }
                    Row(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color(0x29A1BDD9),
                                shape = RoundedCornerShape(size = 8.dp)
                            )
                            .width(351.dp)
                            .height(136.dp)
                            .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 12.dp),
                        horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(16.dp),
                            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,

                            ){
                            Text(
                                text = "Feedback",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    fontWeight = FontWeight(400),
                                    color = Color(0x47BFDBF8),
                                )
                            )

                        }

                    }
                    Button ( onClick = {navController.navigate(route = "MyEvents5")},
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
                            text = "Submit",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight(500),
                                textAlign = TextAlign.Center,
                                color = Color(0xE5161A1D)))
                    }


                }
            }
        }
    }


}



@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun previewMyEvents4() {
    MyEvents4(navController = rememberNavController())

}