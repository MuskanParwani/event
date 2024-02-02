package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun QrCodeScreen(navController: NavController){

   var bottomSheetState = rememberModalBottomSheetState();
   var scope = rememberCoroutineScope()
   var isBottomSheetOpen by remember {
      mutableStateOf(true)
   }
   Scaffold(
      modifier = Modifier.fillMaxSize()
   ) { innerPadding ->
      Column (
         modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color(0x4D000000))
            .padding(top = 489.00024.dp),
         //verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Bottom),
         horizontalAlignment = Alignment.CenterHorizontally,
         ){
         OutlinedButton(onClick = {
            scope.launch {bottomSheetState.hide() }
               .invokeOnCompletion{
                  isBottomSheetOpen = true
               }
         })
         {
            Text(text = "Open button",
           fontSize = 24.sp,)
         }

         if (isBottomSheetOpen){
            ModalBottomSheet(
               onDismissRequest = { isBottomSheetOpen = false},
               sheetState = bottomSheetState
            ) {
               Column(
                  modifier = Modifier
                     .fillMaxWidth()
                     //.width(375.dp)
                     //.height(247.dp)
                     .background(color = Color(0xFF161A1D))
                     .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 12.dp),
                  verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
                  horizontalAlignment = Alignment.CenterHorizontally,
                  ) {
                  Text(
                     text = "Get your ticket scanned to check-in",
                     style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xE5DFEFFF),
                        textAlign = TextAlign.Center,
                     )
                  )
                  Image(
                     modifier = Modifier
                        .padding(1.dp)
                        .background(color = Color(0xFFFFFFFF))
                        .clickable { navController.navigate(route = "MyEvents4") },
                     painter = painterResource(id = R.drawable.qr_code),
                     contentDescription = "image description",
                     contentScale = ContentScale.None
                  )
                  Text(
                     text = "Get your ticket scanned",
                     style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xE5DFEFFF),
                        textAlign = TextAlign.Center,
                     )
                  )

               }
            }
         }



   }


   }


}




@Preview(showBackground = true)
@Composable
fun previewQrCode() {
   QrCodeScreen(navController = rememberNavController())
}



