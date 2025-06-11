package com.cmpc.texttospeechdemo

import android.content.Context

object Graph {
    fun provide(context: Context) {
        AlertDialogHelper.initialize(context)
        TextToSpeechHelper.initialize(context)
    }
}