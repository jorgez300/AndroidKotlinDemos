package com.demo.mvvmsample.screens.Login

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _usuario = mutableStateOf("")
    val usuario: MutableState<String> = _usuario

    private val _pass = mutableStateOf("")
    val pass: MutableState<String> = _pass

    private val _vip = mutableStateOf(false)
    val vip: MutableState<Boolean> = _vip


    fun updateUsuario (valor: String) {
        _usuario.value = valor
    }

    fun updatePass (valor: String) {
        _pass.value = valor
    }

    fun updateVip (valor: Boolean) {
        _vip.value = valor
    }

}