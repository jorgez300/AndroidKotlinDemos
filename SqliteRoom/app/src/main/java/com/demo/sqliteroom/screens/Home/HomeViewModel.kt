package com.demo.sqliteroom.screens.Home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.demo.sqliteroom.database.entity.TaskEntity

class HomeViewModel: ViewModel() {

    private val _id = mutableStateOf(0)
    val id: MutableState<Int> = _id

    private val _title = mutableStateOf("")
    val title: MutableState<String> = _title

    private val _completed = mutableStateOf(false)
    val completed: MutableState<Boolean> = _completed


}