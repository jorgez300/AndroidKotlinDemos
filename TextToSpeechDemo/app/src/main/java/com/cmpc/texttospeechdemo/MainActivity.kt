package com.cmpc.texttospeechdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cmpc.texttospeechdemo.ui.theme.TextToSpeechDemoTheme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Graph.provide(this)
        enableEdgeToEdge()
        setContent {
            TextToSpeechDemoTheme {
                TextToSpeechScreen()
            }
        }
    }
}

@Composable
fun TextToSpeechScreen() {

    Column(modifier = Modifier.padding(16.dp)) {

        Button(onClick =
        {
            TextToSpeechHelper.speak("Hola mundo, soy una aplicacion android")
        }) {
            Text("Speak")
        }

        Button(onClick =
        {
            TextToSpeechHelper.speak("Hola mundo, soy una aplicacion android")
        }) {
            Text("Speak")
        }

        Button(onClick =
        {
            TextToSpeechHelper.speak("Hola mundo, soy una aplicacion android")
        }) {
            Text("Speak")
        }
        Button(onClick =
        {
            TextToSpeechHelper.speak("Hola mundo, soy una aplicacion android")
        }) {
            Text("Speak")
        }
        Button(onClick =
        {
            TextToSpeechHelper.speak("Hola mundo, soy una aplicacion android")
        }) {
            Text("Speak")
        }

        Button(onClick =
        {
            TextToSpeechHelper.speak("Hola mundo, soy una aplicacion android")
        }) {
            Text("Speak")
        }


    }
}

