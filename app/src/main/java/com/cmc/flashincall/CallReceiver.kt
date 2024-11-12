package com.cmc.flashincall

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.util.Log
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraManager

class CallReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val sharedPreferences = context.getSharedPreferences("flash_preferences", Context.MODE_PRIVATE)
        val flashEnabled = sharedPreferences.getBoolean("flash_enabled", false)

        if (flashEnabled) {
            val state = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
            if (state == TelephonyManager.EXTRA_STATE_RINGING) {
                val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as CameraManager
                val cameraId = cameraManager.cameraIdList[0]
                try {
                    for (i in 0..4) {
                        cameraManager.setTorchMode(cameraId, true)
                        Thread.sleep(500)
                        cameraManager.setTorchMode(cameraId, false)
                        Thread.sleep(500)
                    }
                } catch (e: CameraAccessException) {
                    Log.e("CallReceiver", "Error accessing camera", e)
                } catch (e: InterruptedException) {
                    Log.e("CallReceiver", "Interrupted Exception", e)
                }
            }
        }
    }
}
