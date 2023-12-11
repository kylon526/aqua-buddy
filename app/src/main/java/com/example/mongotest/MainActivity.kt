package com.example.mongotest

import com.example.mongotest.db.MongoClientConnectionExample
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mongotest.db.MongoClientConnectionExample.globalRealm
import com.example.mongotest.db.models.User
import com.example.mongotest.ui.components.LoginScreen
import com.example.mongotest.ui.theme.MongoTestTheme
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import dagger.hilt.android.AndroidEntryPoint
import io.realm.kotlin.ext.query
import kotlinx.coroutines.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MongoTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}