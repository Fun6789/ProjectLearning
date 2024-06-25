package com.example.implictorexplictintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button= findViewById<Button>(R.id.button)
        val webButton= findViewById<CardView>(R.id.website)
        val camera = findViewById<CardView>(R.id.camera)
        button.setOnClickListener {
         intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
        webButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://github.com/Fun6789")
            startActivity(intent)
        }
        camera.setOnClickListener {
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}