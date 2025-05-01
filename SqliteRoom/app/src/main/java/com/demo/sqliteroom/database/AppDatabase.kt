package com.demo.sqliteroom.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.demo.sqliteroom.database.dao.TaskDao
import com.demo.sqliteroom.database.entity.TaskEntity

@Database(
    entities = [TaskEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao


}