package com.cmpc.texttospeechdemo

import android.app.AlertDialog
import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.Locale

object TextToSpeechHelper {

    private lateinit var textToSpeech: TextToSpeech



    fun initialize(ctx: Context) {

        if (::textToSpeech.isInitialized) {
            textToSpeech.shutdown()
        }


        textToSpeech = TextToSpeech(ctx) { status ->
            if (status == TextToSpeech.SUCCESS) {
                textToSpeech.language = getLanguage()
            } else {
              AlertDialogHelper.showDialog("Error texto a voz", "No se puede iniciar el servicio de texto a voz.")
            }
        }
    }

    private fun getLanguage(): Locale {
        if (textToSpeech.isLanguageAvailable(Locale("es", "MX")) >= TextToSpeech.LANG_AVAILABLE) {
            return Locale("es", "MX")
        } else {
            return Locale.US
        }
    }

    fun speak(text: String) {
        if (::textToSpeech.isInitialized) {
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
        } else {
            AlertDialogHelper.showDialog("TextToSpeech no iniciado", "Llamar initialize() en Graph.provide() antes de usar Speak().")
        }
    }


}