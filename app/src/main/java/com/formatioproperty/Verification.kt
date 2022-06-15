package com.formatioproperty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        //Declare val and call button
        val smsVerifyButton = findViewById<Button>(R.id.btnSMSVerify)
        // when button is clicked open home
        smsVerifyButton.setOnClickListener {
            val smsVerifyIntent = Intent(this, HomeActivity::class.java)
            startActivity(smsVerifyIntent)
        }
    }
}