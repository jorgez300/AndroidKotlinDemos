package com.demo.multiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.demo.multiapp.comun.broadcast.SmsReceiver
import com.demo.multiapp.comun.helper.PermisosHelper
import com.demo.multiapp.navigation.NavigationHelper
import com.demo.multiapp.ui.theme.MultiAppTheme

class MainActivity : ComponentActivity() {

    val TAG = "MainActivity"
    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        permisosHelper.handlePermissionResult(isGranted)
    }
    private val permisosHelper: PermisosHelper by lazy {
        PermisosHelper(this, requestPermissionLauncher)
    }
    private val smsReceiver: SmsReceiver by lazy {
        SmsReceiver()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        permisosHelper.checkPermissions();


        enableEdgeToEdge()
        setContent {
            MultiAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavigationHelper(this, innerPadding)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()

        permisosHelper.checkPermissions();
    }
}
