package com.demo.foregroundservices

import android.content.Context
import androidx.room.Room
import com.demo.foregroundservices.core.LocationHelper
import com.demo.foregroundservices.database.AppDatabase
import com.demo.foregroundservices.database.repository.LocationRepository

object Graph {

    lateinit var locationHelper: LocationHelper;
    lateinit var appDatabase: AppDatabase;

    lateinit var app2Database: AppDatabase;

    val locationRepository by lazy {
        LocationRepository(appDatabase.locationDao())
    }

    val locationRepository2 by lazy {
        LocationRepository(app2Database.locationDao())
    }


    fun provide(context: Context) {
        appDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "app_database.db")
            .fallbackToDestructiveMigration()
            .build()

        app2Database = Room.databaseBuilder(context, AppDatabase::class.java, "app2_database.db")
            .fallbackToDestructiveMigration()
            .build()
        locationHelper = LocationHelper()
    }


}