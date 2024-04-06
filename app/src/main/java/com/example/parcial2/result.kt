package com.example.parcial2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var result = findViewById<TextView>(R.id.resultado_txt);

        val nombre = intent.getStringExtra("Nombre")

        result.setText("Nombre: $nombre")
    }
}