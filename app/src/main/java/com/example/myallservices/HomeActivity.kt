package com.example.myallservices

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class HomeActivity : AppCompatActivity() {
    lateinit var gmail:EditText
    lateinit var name:EditText
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val userEmail=intent.getStringExtra("userEmail")
        val displayName = intent.getStringExtra("displayName")
        val profilePictureUri = intent.getStringExtra("profilePictureUri")

        gmail = findViewById(R.id.Gmail)
        name = findViewById(R.id.name)
        imageView=findViewById(R.id.imageView)

        gmail.setText(userEmail)
        name.setText(displayName)
        Glide.with(this)
            .load(profilePictureUri)
            .into(imageView);
    }
}