package dev.doda.easyQrCheckIn

import android.app.Activity
import android.content.Intent
import android.net.Uri

class SchemeHelper {
    fun startTossQrCheckIn(activity: Activity) {
        val url = "supertoss://qr-checkin"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        activity.startActivity(intent)
    }
}