package com.demo.sqliteroom.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class TaskEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name="title")
    val title: String,
    @ColumnInfo(name="completed")
    val completed: Boolean = false
)