package com.shihab.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import com.shihab.myapplication.ui.screen.MusicService
import com.shihab.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Column {
                    Text(text = "Music Player")
                    Button(onClick = {
                        val intent = Intent(this@MainActivity, MusicService::class.java)
                        intent.action = "START"
                        startService(intent)
                    }) {
                        Text("Start Music")
                    }
                    Button(onClick = {
                        val intent = Intent(this@MainActivity, MusicService::class.java)
                        intent.action = "STOP"
                        startService(intent)
                    }) {
                        Text("Stop Music")
                    }
                }
            }
        }
    }
}
