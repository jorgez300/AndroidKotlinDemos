package com.cmpc.debugvalidator

import android.app.AlertDialog
import android.content.Context
import android.provider.Settings


object DebugValidatorHelper {


    fun ValidateDebugMode(ctx: Context, finish: () -> Nothing) {

        if (Constantes.AMBIENTE != "PRD") {
            return
        }


        if (isDebuggingEnabled(ctx) || isDebuggerAttached()) {

            AlertDialog.Builder(ctx)
                .setTitle("Modo Depuración Detectado")
                .setMessage("No puedes ejecutar esta aplicación con el modo depuración activado.")
                .setPositiveButton("Cerrar") { _, _ ->
                    finish()
                }
                .setCancelable(false)
                .show()

        }


    }

    fun isDebuggingEnabled(context: Context): Boolean {
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.ADB_ENABLED,
            0
        ) != 0
    }


    fun isDebuggerAttached(): Boolean {
        return android.os.Debug.isDebuggerConnected() || android.os.Debug.waitingForDebugger()
    }



}