package com.demo.multiapp.comun.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.demo.multiapp.comun.database.dao.*
import com.demo.multiapp.comun.database.entity.*


@Database(
    entities = [LocationEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ComunDatabase : RoomDatabase() {

    abstract fun locationDao(): LocationDao
}