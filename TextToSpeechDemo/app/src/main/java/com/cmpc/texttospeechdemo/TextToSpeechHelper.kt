package com.cmpc.texttospeechdemo

import android.app.AlertDialog
import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.Locale
import android.media.AudioManager

object TextToSpeechHelper {

    private lateinit var textToSpeech: TextToSpeech
    private lateinit var audioManager: AudioManager


    fun initialize(ctx: Context) {

        if (::textToSpeech.isInitialized) {
            textToSpeech.shutdown()
        }

        audioManager = ctx.getSystemService(Context.AUDIO_SERVICE) as AudioManager

        textToSpeech = TextToSpeech(ctx) { status ->
            if (status == TextToSpeech.SUCCESS) {
                textToSpeech.language = getLanguage()
            } else {
                AlertDialogHelper.showDialog(
                    "Error texto a voz",
                    "No se puede iniciar el servicio de texto a voz."
                )
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

    private fun setMaxVolume() {
        audioManager.setStreamVolume(
            AudioManager.STREAM_MUSIC,
            audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC),
            AudioManager.FLAG_SHOW_UI
        )
    }

    fun speak(text: String) {

        if (::textToSpeech.isInitialized) {
            setMaxVolume()
            textToSpeech.speak(text, TextToSpeech.QUEUE_ADD, null, null)
        } else {
            AlertDialogHelper.showDialog(
                "TextToSpeech no iniciado",
                "Llamar initialize() en Graph.provide() antes de usar Speak()."
            )
        }
    }

    fun forceSpeak(text: String) {

        if (::textToSpeech.isInitialized) {
            setMaxVolume()
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
        } else {
            AlertDialogHelper.showDialog(
                "TextToSpeech no iniciado",
                "Llamar initialize() en Graph.provide() antes de usar Speak()."
            )
        }
    }

    fun stop() {
        if (::textToSpeech.isInitialized) {
            textToSpeech.stop()
        } else {
            AlertDialogHelper.showDialog(
                "TextToSpeech no iniciado",
                "Llamar initialize() en Graph.provide() antes de usar Speak()."
            )
        }
    }

}



