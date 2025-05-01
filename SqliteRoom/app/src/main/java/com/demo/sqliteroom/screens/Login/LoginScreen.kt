package com.demo.sqliteroom.screens.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun  LoginScreen(/*viewModel: LoginViewModel*/) {
    val viewModel:LoginViewModel = viewModel()

    Box(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .background(color = Color.Blue)
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = viewModel.usuario.value,
                onValueChange = { viewModel.updateUsuario(valor = it) })
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                value = viewModel.pass.value,
                onValueChange = { viewModel.updatePass(valor = it) })
            Spacer(modifier = Modifier.height(20.dp))
            Checkbox(
                checked = viewModel.vip.value,
                onCheckedChange = { viewModel.updateVip(valor = it) }
            )
        }
    }
}