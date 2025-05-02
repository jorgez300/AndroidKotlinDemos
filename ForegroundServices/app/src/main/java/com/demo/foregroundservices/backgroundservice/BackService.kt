package com.demo.foregroundservices.backgroundservice

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.demo.foregroundservices.Graph
import com.demo.foregroundservices.MainActivity
import com.demo.foregroundservices.R
import com.demo.foregroundservices.core.LocationHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class BackService : Service() {

    private val TAG = "BackService"

    private val serviceScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    private lateinit var notificationManager: NotificationManager
    private lateinit var notification: NotificationCompat.Builder

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        Log.d(TAG, "onCreate: BackService")

        notificationManager = this.getSystemService(NotificationManager::class.java)
        notification = createNotification()


    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            MONITOREO_START -> {
                start()
            }

            MONITOREO_STOP -> {
                stop()
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    private val _tarea: (latitude: Double, longitude: Double, speed: Float) -> Unit =
        { latitude, longitude, speed ->
            Log.d(
                TAG,
                "BackService ${getCurrentDateTimeString()}: ${latitude} ${longitude}, ${speed}"
            )

        }



    private fun start(_locationHelper: LocationHelper = Graph.locationHelper) {
        _locationHelper.startLocationUpdates(_tarea)
        /*serviceScope.launch {

            _locationHelper.startLocationUpdates()

            /*while (true) {
                Log.d(TAG, getCurrentDateTimeString())
                val updatedNotification = notification.setContentText(getCurrentDateTimeString())
                updatedNotification.build()
                notificationManager.notify(556, updatedNotification.build())
                delay(10000)  // Espera X segundos


            }*/
        }*/
        Log.d(TAG, "start")
        startForeground(556, notification.build())
    }

    private fun getCurrentDateTimeString(): String {
        val currentTimeMillis = System.currentTimeMillis()
        val date = java.util.Date(currentTimeMillis)
        val format =
            java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss", java.util.Locale.getDefault())
        return format.format(date)
    }


    private fun stop(_locationHelper: LocationHelper = Graph.locationHelper) {
        _locationHelper.stopLocationUpdates()
        notificationManager.cancelAll()
        stopForeground(STOP_FOREGROUND_REMOVE)
        stopSelf()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: BackService")
        serviceScope.cancel()
    }

    private val CHANNEL_ID = "BackService - ForegroundServiceChannel"

    private fun createNotification(): NotificationCompat.Builder {


        val channel = NotificationChannel(
            CHANNEL_ID,
            "Servicio en primer plano",
            NotificationManager.IMPORTANCE_LOW
        )
        notificationManager.createNotificationChannel(channel)

        // Intent para abrir la actividad al tocar la notificación
        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Servicio en ejecución")
            .setContentText("Tu servicio en primer plano está activo")
            .setSmallIcon(R.drawable.ic_launcher_background)
        //.setContentIntent(pendingIntent) // Abre actividad al tocar
        //.setOngoing(true) // Evita que se cierre accidentalmente
    }

    companion object {
        const val MONITOREO_START = "MONITOREO_START"
        const val MONITOREO_STOP = "MONITOREO_STOP"
    }
}