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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
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
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Experience(navController: NavController) {
    var bottomSheetState = rememberModalBottomSheetState();
    var scope = rememberCoroutineScope()
    var isBottomSheetOpen by remember {
        mutableStateOf(false)
    }
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = androidx.compose.ui.Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Color(0x4D000000))
                .padding(top = 489.00024.dp),
            //verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Bottom),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedButton(onClick = {
                scope.launch { bottomSheetState.hide() }
                    .invokeOnCompletion {
                        isBottomSheetOpen = true
                    }
            })
            {
                Text(
                    text = "Open button",
                    fontSize = 24.sp,
                )
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
}

@Preview(showBackground = true)
@Composable
fun previewExperience() {
    Experience(navController = rememberNavController())
}