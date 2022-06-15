package com.formatioproperty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //Declare button and identify
        val signupButton = findViewById<Button>(R.id.btnRegister)
        //when the button is clicked
        signupButton.setOnClickListener {
            val registerIntent = Intent(this, Verification::class.java)
            startActivity(registerIntent)
        }
    }
}