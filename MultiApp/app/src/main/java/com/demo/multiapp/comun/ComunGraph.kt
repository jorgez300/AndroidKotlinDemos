package com.demo.multiapp.comun

import android.content.Context
import androidx.room.Room
import com.demo.multiapp.comun.database.ComunDatabase
import com.demo.multiapp.comun.database.repository.LocationRepository
import com.demo.multiapp.comun.helper.LocationHelper

object ComunGraph {

    lateinit var locationHelper: LocationHelper;
    lateinit var appDatabase: ComunDatabase;

    val locationRepository by lazy {
        LocationRepository(appDatabase.locationDao())
    }

    fun provide(context: Context) {
        appDatabase = Room.databaseBuilder(context, ComunDatabase::class.java, "comun_database.db")
            .fallbackToDestructiveMigration()
            .build()

        locationHelper = LocationHelper()
    }
}