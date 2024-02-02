package com.example.eventmanagementapp

import android.widget.ImageButton
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateYourAccount() {
    var firstname by remember {
        mutableStateOf("")
    }
    var lastname by remember {
        mutableStateOf("")
    }
    var campus by remember {
        mutableStateOf("")
    }
    var batch by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var confrmPassword by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF161A1D))
    ){
        Row(
          modifier = Modifier
              .border(width = 1.dp, color = Color(0x29A1BDD9))
              .fillMaxWidth()
              //.height(48.dp)
              .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            ) {

               Image(painter = painterResource(id = R.drawable.arrow), contentDescription = null )

            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                   // .height(24.dp),
                text = "Create an account",
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xE5DFEFFF),
                    textAlign = TextAlign.Center))
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, top = 16.dp, end = 12.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            ){
            Text(
                    text = "Create a profile to find the best food available around you",
                    style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xA6DFEFFF),))

                 Row (
                     horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                     verticalAlignment = Alignment.Top,
                     ){
                     Column(
                         verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                         horizontalAlignment = Alignment.Start,
                         ) {
                         Text(
                             text = "First Name",
                             style = TextStyle(
                                 fontSize = 12.sp,
                                 lineHeight = 16.sp,
                                 fontWeight = FontWeight(400),
                                 color = Color(0xA6DFEFFF),
                             )
                         )
                         OutlinedTextField(
                             modifier = Modifier
                                 .width(169.5.dp),
                             // .height(40.dp),
                             value = firstname , onValueChange = { firstname = it

                             } )

                     }
                     Column(
                         verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                         horizontalAlignment = Alignment.Start,
                     ) {
                         Text(
                             text = "Last Name",
                             style = TextStyle(
                                 fontSize = 12.sp,
                                 lineHeight = 16.sp,
                                 fontWeight = FontWeight(400),
                                 color = Color(0xA6DFEFFF),
                             )
                         )
                         OutlinedTextField(
                             modifier = Modifier.width(169.5.dp),
                             // .height(40.dp),
                             value = lastname , onValueChange = {lastname = it

                             } )

                     }
                 }
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Campus",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    ))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                        //.width(351.dp),
                    value = campus , onValueChange = {campus = it },
                    trailingIcon = {
                        Icon(painter = painterResource(id = R.drawable.cheveron), contentDescription = null,
                            tint = Color(0xA6DFEFFF)
                        )
                    })

            }

            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Batch/Year of enrollment",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    ))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                        //.width(351.dp),
                    value = batch , onValueChange = {batch = it },
                    trailingIcon = {
                        Icon(painter = painterResource(id = R.drawable.cheveron), contentDescription = null,
                            tint = Color(0xA6DFEFFF)
                        )
                    })

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
                        color = Color(0xA6DFEFFF),
                    ))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                        //.width(351.dp),
                    value = email , onValueChange = {email = it },)

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
                        color = Color(0xA6DFEFFF),
                    ))
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = password , onValueChange = { password = it },
                    trailingIcon = {
                        Icon(painter = painterResource(id = R.drawable.eye), contentDescription = null,
                            tint = Color(0xA6DFEFFF)
                        )
                    })

            }
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Confirm password",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xA6DFEFFF),
                    ))
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                    .height(40.dp),
                    value = confrmPassword , onValueChange = {confrmPassword = it },
                    trailingIcon = {
                        Icon(painter = painterResource(id = R.drawable.eyeclose), contentDescription = null,
                            tint = Color(0xA6DFEFFF)
                        )
                    })

            }
        }

        Row(
            modifier = Modifier.fillMaxWidth().fillMaxHeight()
                .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.Bottom,
            ){
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
                contentPadding = PaddingValues(top= 12.dp, bottom = 12.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFB899FF))
            ){
                Text(text = "Next",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                        color = Color(0xE5161A1D)
                    )
                )
            }

        }


        }

    }

//}
@Preview(showBackground = true)
@Composable
fun previewAccount(){
    CreateYourAccount()
}



//            IconButton(onClick = { /* Handle navigation back */ })
//            {
//                Icon(painter = painterResource(id = R.drawable.arrow), contentDescription = null,
//                    tint = Color(0xE5DFEFFF))
//
//            }
//            Text(modifier = Modifier.fillMaxWidth(),
//                text = "Create an account", color = Color(0xE5DFEFFF) )