package com.cmpc.debugvalidator

import android.app.AlertDialog
import android.content.Context

object DebugValidatorHelper {


    fun ValidateDebugMode(ctx: Context, finish: () -> Nothing) {

        if (Constantes.AMBIENTE != "PRD") {
            return
        }


        if (android.os.Debug.isDebuggerConnected() || android.os.Debug.waitingForDebugger()) {

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




}