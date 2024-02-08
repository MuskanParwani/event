package com.example.eventmanagementapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eventmanagementapp.ui.theme.EventManagementAppTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventManagementAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Navigation(rememberNavController())
                }
            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun Navigation(navController: NavController) {
    var navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "welcomeScreen1")

    {
        composable("welcomeScreen1")
        {
            WelcomeScreen1(navController = navController)
        }
//        composable("EventsScreen")
//        {
//            EventsScreen(navController = navController)
//        }
        composable("MyEvents") {
            MyEvents(navController = navController)
        }
        composable("MyEvents1") {
            MyEvents1(navController = navController)
        }
        composable("MyEvents2") {
            MyEvents2(navController = navController)
        }
        composable("MyEvents3") {
            MyEvents3(navController = navController)
        }
        composable("QrCodeScreen")
        {
            QrCodeScreen(navController = navController)
        }
        composable("MyEvents4") {
            MyEvents4(navController = navController)
        }

        composable("Experience") {
            Experience(navController = navController)
        }
        composable("MyEvents5") {
            MyEvents5(navController = navController)
        }
        composable("PendingRequests") {
            PendingRequests(navController)
        }
        composable("pendingrequestdetail") {
            PendingRequestdetails()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}