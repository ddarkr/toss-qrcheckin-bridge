package dev.doda.easyQrCheckIn

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.view.Gravity
import android.widget.Toast
import kotlin.system.exitProcess

class SchemeHelper {
    fun startTossQrCheckIn(activity: Activity) {
        try {
            val url = "supertoss://qr-checkin"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            activity.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            val toast = Toast.makeText(activity.applicationContext, "Toss 앱이 설치되어 있는지 확인해주세요.", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}