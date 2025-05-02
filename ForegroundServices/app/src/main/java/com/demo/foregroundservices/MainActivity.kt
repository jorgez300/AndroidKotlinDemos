package com.demo.foregroundservices

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.demo.foregroundservices.backgroundservice.LocationForegroundService
import com.demo.foregroundservices.core.LocationHelper
import com.demo.foregroundservices.core.PermisosHelper
import com.demo.foregroundservices.ui.theme.ForegroundServicesTheme

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        permisosHelper.checkPermissions();
        Graph.provide(this)
        enableEdgeToEdge()
        setContent {
            ForegroundServicesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                        this
                    )
                }
            }
        }
    }

    /*override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
        val serviceIntent =
            Intent(this, BackService::class.java).apply { action = "MONITOREO_STOP" }
        startForegroundService(serviceIntent)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
        val serviceIntent =
            Intent(this, BackService::class.java).apply { action = "MONITOREO_STOP" }
        startForegroundService(serviceIntent)
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
        val serviceIntent =
            Intent(this, BackService::class.java).apply { action = "MONITOREO_STOP" }
        startForegroundService(serviceIntent)
    }
*/
    /*override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
        val serviceIntent =
            Intent(this, BackService::class.java).apply { action = "MONITOREO_START" }
        startForegroundService(serviceIntent)

    }*/

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, context: Context, locationHelper: LocationHelper = Graph.locationHelper) {

    Column {
        Spacer(modifier = Modifier.height(8.dp))
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            val serviceIntent =
                Intent(context, LocationForegroundService::class.java).apply { action = "MONITOREO_START" }
            context.startForegroundService(serviceIntent)


        }) {
            Text("Iniciar")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            val serviceIntent =
                Intent(context, LocationForegroundService::class.java).apply { action = "MONITOREO_STOP" }
            context.startForegroundService(serviceIntent)


        }) {
            Text("Detener")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {

            locationHelper.startLocationUpdates(context)
        }) {
            Text("Inicia GPS")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            locationHelper.stopLocationUpdates()
        }) {
            Text("Detiene GPS")
        }
    }

}

