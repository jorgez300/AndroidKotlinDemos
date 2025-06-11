package com.cmpc.texttospeechdemo

import android.app.AlertDialog
import android.content.Context


object AlertDialogHelper {
    private lateinit var alertDialog: AlertDialog

    fun initialize(ctx: Context) {
        alertDialog = AlertDialog.Builder(ctx)
            .setCancelable(true)
            .create()
    }

    fun showDialog(title: String, message: String) {
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)
        alertDialog.show()
    }

}