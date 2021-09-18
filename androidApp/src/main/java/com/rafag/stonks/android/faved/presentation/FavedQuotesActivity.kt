package com.rafag.stonks.android.faved.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.navigation.compose.rememberNavController
import com.rafag.stonks.android.navigation.ComposeNavigation

class FavedQuotesActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            Scaffold {
                ComposeNavigation(navController)
            }
        }
    }
}
