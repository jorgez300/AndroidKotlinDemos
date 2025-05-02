package com.demo.foregroundservices.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.demo.foregroundservices.database.dao.*
import com.demo.foregroundservices.database.entity.*

@Database(
    entities = [LocationEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun locationDao(): LocationDao
}