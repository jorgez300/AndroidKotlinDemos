package com.demo.smsbroadcastreceiver

import android.content.IntentFilter
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
import com.demo.smsbroadcastreceiver.broadcast.SmsReceiver
import com.demo.smsbroadcastreceiver.core.PermisosHelper
import com.demo.smsbroadcastreceiver.ui.theme.SMSBroadcastReceiverTheme



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


        val intentFilter = IntentFilter("android.provider.Telephony.SMS_RECEIVED")
        registerReceiver(smsReceiver, intentFilter)

        enableEdgeToEdge()
        setContent {
            SMSBroadcastReceiverTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(smsReceiver)

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SMSBroadcastReceiverTheme {
        Greeting("Android")
    }
}