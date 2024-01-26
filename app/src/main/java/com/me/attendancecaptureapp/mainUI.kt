package com.me.attendancecaptureapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class mainUI : AppCompatActivity() {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui)
        button = findViewById(R.id.registerbutton)
        button?.setOnClickListener(View.OnClickListener {
            CameraIntegration()
        })
    }

    fun CameraIntegration() {
        val intent = Intent(this, CameraIntegration::class.java)
        startActivity(intent)
    }
}