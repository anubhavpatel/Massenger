package com.example.mass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var login: Button
    private lateinit var register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar=supportActionBar
        actionBar!!.title="Massenger"
        supportActionBar?.hide()
        login=findViewById(R.id.login)
        register=findViewById(R.id.register)
       login.setOnClickListener{
           val intent =Intent(this,LoginActivity::class.java)
           startActivity(intent)
       }
        register.setOnClickListener {
            val intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}