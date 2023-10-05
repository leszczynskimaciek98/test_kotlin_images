package com.example.test_kotlin_images

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageButton = findViewById<ImageButton>(R.id.message_button)
        messageButton.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, messages_activity::class.java)
            startActivity(intent)
        })

    }
}