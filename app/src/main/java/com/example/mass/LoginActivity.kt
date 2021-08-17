package com.example.mass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.view.ActionMode
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    private lateinit var forgotPassword:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val actionbar =supportActionBar
        actionbar!!.title="Login"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        forgotPassword=findViewById(R.id.forgotPassword)
       forgotPassword.setOnClickListener {
           val intent=Intent(this,ForgotPassword::class.java)
           startActivity(intent)
       }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}