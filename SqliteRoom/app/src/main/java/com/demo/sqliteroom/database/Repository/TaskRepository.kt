package com.demo.sqliteroom.database.Repository

import com.demo.sqliteroom.database.dao.TaskDao
import com.demo.sqliteroom.database.entity.TaskEntity
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {


    suspend fun addTask(task: TaskEntity) {
        taskDao.insertTask(task)
    }

    suspend fun deleteTask(task: TaskEntity) {
        taskDao.deleteTask(task)
    }

    suspend fun updateTask(task: TaskEntity) {
        taskDao.updateTask(task)
    }

    suspend fun getAllTask(): Flow<List<TaskEntity>> {
        return taskDao.getAllTask()
    }

    suspend fun getByIdTask(id: Int): Flow<TaskEntity> {
        return taskDao.getByIdTask(id)
    }


}


