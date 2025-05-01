package com.demo.sqliteroom.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.demo.sqliteroom.database.entity.TaskEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertTask(task: TaskEntity)

    @Update
    abstract suspend fun updateTask(task: TaskEntity)

    @Delete
    abstract suspend fun deleteTask(task: TaskEntity)

    @Query("SELECT * FROM task")
    abstract fun getAllTask(): Flow<List<TaskEntity>>

    @Query("SELECT * FROM task WHERE id = :id")
    abstract suspend fun getByIdTask(id: Int): Flow<TaskEntity>

}