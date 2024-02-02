package com.example.eventmanagementapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Logo(){
    Column( modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF161A1D)),
       // .padding(bottom = 358.dp),
        verticalArrangement = Arrangement.spacedBy(314.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
             Image(painter = painterResource(id = R.drawable.thunder1), contentDescription = null)
    }
}


@Preview(showBackground = true)
@Composable
fun Previewlogo() {
    Logo()

}