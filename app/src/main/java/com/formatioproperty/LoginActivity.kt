package com.formatioproperty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // declare the val button and identify its id
        val signupbutton = findViewById<Button>(R.id.signupbtn)
        // when next button is clicked open Signup Activity
        signupbutton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        //Declare forgot pass link
        val forgotPass = findViewById<TextView>(R.id.tvForgotPass)
        // when forgot pass link is clicked
        forgotPass.setOnClickListener {
            val forgotPassIntent = Intent(this, ForgotPassActivity::class.java)
            startActivity(forgotPassIntent)
        }
    }
}