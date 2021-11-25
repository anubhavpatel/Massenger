package com.example.mass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ViewFlipper

class ForgotPassword : AppCompatActivity() {
//    lateinit var viewflipper : ViewFlipper
//    var image = intArrayOf(R.drawable.registration,R.drawable.login,R.drawable.music)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val actionbar =supportActionBar
        actionbar!!.title="Reset Password"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
//        viewflipper = findViewById(R.id.v_flip)
//        for(i in image.indices){
//            flip_image(image[i])
//        }
    }
//    fun flip_image(i :Int){
//        val view = ImageView(this)
//        view.setBackgroundResource(i)
//        viewflipper.addView(view)
//        viewflipper.flipInterval = 3000
//        viewflipper.isAutoStart
//        viewflipper.setInAnimation(this,android.R.anim.slide_in_left)
//        viewflipper.setOutAnimation(this,android.R.anim.slide_out_right)
//    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}