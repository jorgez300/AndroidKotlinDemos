package com.demo.foregroundservices.model

import com.demo.foregroundservices.database.entity.LocationEntity

class Location {

    var id : Int? = null;
    var latitude: Double = 0.0;
    var longitude: Double = 0.0;
    var speed: Float = 0.0f;
    var timestamp: String? = null;

    constructor(){

    }

    constructor(latitude: Double, longitude: Double, speed: Float){
        this.latitude = latitude
        this.longitude = longitude
        this.speed = speed
    }


    fun ToLocationEntity(): LocationEntity {
        return LocationEntity(
            id = 0,
            latitude = latitude,
            longitude = longitude,
            speed = speed,
            timestamp = getCurrentDateTimeString()
        )
    }


    private fun getCurrentDateTimeString(): String {
        val currentTimeMillis = System.currentTimeMillis()
        val date = java.util.Date(currentTimeMillis)
        val format =
            java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss", java.util.Locale.getDefault())
        return format.format(date)
    }

}