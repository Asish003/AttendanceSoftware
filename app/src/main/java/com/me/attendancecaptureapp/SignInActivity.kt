package com.me.attendancecaptureapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class SignInActivity : AppCompatActivity() {
    var button: Button? = null
    var entered_mail: TextInputEditText? = null
    var entered_password: TextInputEditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val entered_mail = findViewById<EditText>(R.id.signInEditText)
        val entered_password = findViewById<EditText>(R.id.signInPassword)
        button = findViewById(R.id.sign_in_button)
        button?.setOnClickListener(View.OnClickListener {
            val email: String
            val password: String
            email = entered_mail.text.toString()
            password = entered_password.text.toString()
            if (email == "a" && password == "b") {
                mainUI()
            }
        })
    }

    fun mainUI() {
        val intent = Intent(this, mainUI::class.java)
        startActivity(intent)
    }
}