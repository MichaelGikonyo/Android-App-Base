package com.formatioproperty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)

        //declare reset button and ID
        val resetPasswordButton = findViewById<Button>(R.id.btnResetPassword)
        //when the button is Clicked
        resetPasswordButton.setOnClickListener {
            val resetPassIntent = Intent(this, ResetPasswordActivity::class.java)
            startActivity(resetPassIntent)
        }

    }
}