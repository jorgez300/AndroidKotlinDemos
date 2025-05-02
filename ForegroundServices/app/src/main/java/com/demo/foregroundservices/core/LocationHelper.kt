package com.demo.foregroundservices.core


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.provider.Settings
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import android.annotation.SuppressLint
import com.google.android.gms.location.*


class LocationHelper {
    constructor() {

    }

    //private val activity: Context;
    private val TAG = "GPSHelper"

    private lateinit var fusedLocationClient: FusedLocationProviderClient;

    private var _tarea: (latitude: Double, longitude: Double, speed: Float) -> Unit =
        { latitude, longitude, speed ->
            Log.d(
                TAG,
                "onLocationResult ${getCurrentDateTimeString()}: ${latitude} ${longitude}, ${speed}"
            )

        }


    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {

            val location = locationResult.lastLocation

            if (location == null) {
                Log.d(TAG, "onLocationResult: Location is null")
                return
            }

            _tarea(location.latitude, location.longitude, location.speed)

        }
    }

    @SuppressLint("MissingPermission")
    fun startLocationUpdates(
        context: Context,
        tarea: (latitude: Double, longitude: Double, speed: Float) -> Unit = _tarea
    ) {

        fusedLocationClient =
            LocationServices.getFusedLocationProviderClient(context)

        _tarea = tarea
        val locationRequest = LocationRequest.Builder(Priority.PRIORITY_HIGH_ACCURACY, 1000)
            .setMinUpdateIntervalMillis(1000)
            //.setMaxUpdateDelayMillis(20000)
            .build()

        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            locationCallback,
            null
        )
    }

    private fun getCurrentDateTimeString(): String {
        val currentTimeMillis = System.currentTimeMillis()
        val date = java.util.Date(currentTimeMillis)
        val format =
            java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss", java.util.Locale.getDefault())
        return format.format(date)
    }

    fun stopLocationUpdates() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }

    fun isGPSEnabled(context: Context) {
        var enabled = true
        try {
            val locationManager =
                context.getSystemService(Context.LOCATION_SERVICE) as? LocationManager
            enabled = locationManager?.isProviderEnabled(LocationManager.GPS_PROVIDER) ?: false
        } catch (e: Exception) {
            enabled = false
        }

        if (!enabled) {
            openGPSSettings(context)
        }

    }

    private fun openGPSSettings(context: Context) {
        try {
            val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
            startActivity(context, intent, null)
        } catch (e: Exception) {
            Log.e("LocationManager", "Error abriendo configuración del GPS: ${e.message}", e)
        }
    }

}