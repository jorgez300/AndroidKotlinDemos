package com.demo.smsbroadcastreceiver.core

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import androidx.core.content.ContextCompat


class PermisosHelper {

    constructor(activity: Activity, launcher: ActivityResultLauncher<String>) {
        this.activity = activity
        this.launcher = launcher
    }

    private val requiredPermissions = arrayOf(
        Manifest.permission.POST_NOTIFICATIONS,
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.RECEIVE_SMS,
        Manifest.permission.READ_SMS,
    )

    private val activity: Activity;
    private var currentPermission: String? = null
    private val pendingPermissions = requiredPermissions.toMutableList()

    private val launcher: ActivityResultLauncher<String>

    private val TAG = "PermisosHelper"

    fun checkPermissions() {
        Log.d(TAG, "Verificando permisos")
        pendingPermissions.clear()
        pendingPermissions.addAll(requiredPermissions.filter {
            ContextCompat.checkSelfPermission(
                this.activity,
                it
            ) != PackageManager.PERMISSION_GRANTED
        })

        if (pendingPermissions.isEmpty()) {
            Log.d(TAG, "Todos los permisos ya concedidos")
        } else {
            Log.d(TAG, "Permisos faltantes: ${pendingPermissions.joinToString()}")
            requestNextPermission()
        }
    }

    private fun requestNextPermission() {
        if (pendingPermissions.isNotEmpty()) {
            currentPermission = pendingPermissions.removeAt(0)
            Log.d(TAG, "Solicitando permiso: $currentPermission")
            launcher.launch(currentPermission!!)
        } else {
            Log.d(TAG, "Todos los permisos solicitados")
            // Verificar si todos los permisos están concedidos
            val allGranted = requiredPermissions.all {
                ContextCompat.checkSelfPermission(
                    this.activity,
                    it
                ) == PackageManager.PERMISSION_GRANTED
            }
            if (allGranted) {
                Log.d(TAG, "Todos los permisos concedidos tras solicitud")
            } else {
                Log.w(TAG, "Algunos permisos no concedidos")
            }
        }
    }

    fun handlePermissionResult(isGranted: Boolean) {
        Log.d(
            TAG,
            "Resultado para $currentPermission: ${if (isGranted) "CONCEDIDO" else "DENEGADO"}"
        )
        if (isGranted) {
            // Continuar con el siguiente permiso
            requestNextPermission()
        } else {
            // No redirigir a configuración, solo continuar con el siguiente permiso
            Log.w(TAG, "Permiso $currentPermission denegado, continuando con el siguiente")
            requestNextPermission()
        }
    }

}