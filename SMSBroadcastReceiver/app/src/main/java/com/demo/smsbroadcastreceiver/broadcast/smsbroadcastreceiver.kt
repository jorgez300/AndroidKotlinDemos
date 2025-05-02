package com.demo.smsbroadcastreceiver.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import android.util.Log
import com.demo.smsbroadcastreceiver.Constantes
import com.demo.smsbroadcastreceiver.MainActivity

class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Telephony.Sms.Intents.SMS_RECEIVED_ACTION) {
            val smsMessages = Telephony.Sms.Intents.getMessagesFromIntent(intent)
            for (message in smsMessages) {
                val sender = message.displayOriginatingAddress
                val messageBody = message.messageBody

                if (messageBody.contains(Constantes.SMS_KEY)) {
                    Log.d("SmsReceiver", "Mensaje recibido de: $sender")
                    Log.d("SmsReceiver", "Contenido: $messageBody")

                    val launchIntent = Intent(context, MainActivity::class.java)
                    launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    launchIntent.putExtra("sms_body", messageBody)
                    context.startActivity(launchIntent)
                }
            }
        }
    }
}