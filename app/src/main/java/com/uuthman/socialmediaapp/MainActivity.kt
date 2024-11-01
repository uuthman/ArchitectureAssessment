package com.uuthman.socialmediaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.uuthman.socialmediaapp.presentation.user.UserScreenRoot
import com.uuthman.socialmediaapp.ui.theme.SocialMediaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SocialMediaAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
//                    val navController = rememberNavController()
//                    NavigationRoot(
//                        navController = navController
//                    )
                    UserScreenRoot()
                }
            }
        }
    }
}
