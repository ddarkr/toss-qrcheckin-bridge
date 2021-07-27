package dev.doda.easyQrCheckIn

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    private val schemeHelper = SchemeHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Activity 생성될 때 Toss 열기
        this.schemeHelper.startTossQrCheckIn(this)

        setContentView(R.layout.activity_main)
    }

    fun openTossQrCheckIn(view: View) {
        this.schemeHelper.startTossQrCheckIn(this)
    }

    fun appExit(view: View) {
        finishAffinity()

        System.runFinalization()

        exitProcess(0)
    }
}