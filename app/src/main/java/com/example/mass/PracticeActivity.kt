package com.example.mass

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import de.hdodenhof.circleimageview.CircleImageView

class PracticeActivity : AppCompatActivity() {
    private lateinit var profile_image : CircleImageView
    private lateinit var camBtn : Button
    private var filepath: Uri?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)
        profile_image=findViewById(R.id.profile_image)
        camBtn=findViewById(R.id.camBtn)
        profile_image.setOnClickListener {
            startFileChooser()
        }
    }
    private fun startFileChooser() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Choose Image"), 111)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 111 && resultCode == Activity.RESULT_OK && data != null) {
            filepath = data.data!!
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, filepath)
            profile_image.setImageBitmap(bitmap)
        }
    }
}
