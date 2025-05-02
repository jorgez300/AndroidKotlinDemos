package com.demo.foregroundservices.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Location")
data class LocationEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "latitude")
    val latitude: Double = 0.0,
    @ColumnInfo(name = "longitude")
    val longitude: Double = 0.0,
    @ColumnInfo(name = "speed")
    val speed: Float = 0.0f,

    @ColumnInfo(name = "timestamp")
    val timestamp: String = "",

    )