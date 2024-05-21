package com.example.tutorial04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Find the TextView by its ID
        val txtAnswer = findViewById<TextView>(R.id.txtAnswer)
        // Set the text of the TextView to the answer passed via the Intent
        txtAnswer.text = intent.getDoubleExtra("answer", 0.0).toString()

        // Find the Button by its ID
        val btnBack = findViewById<Button>(R.id.btnBack)
        // Set an OnClickListener on the Button to navigate back to MainActivity
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
