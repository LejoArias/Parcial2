package com.example.parcial2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var texto = findViewById<TextView>(R.id.name_txt);
        var enviar = findViewById<Button>(R.id.enviar_btn);


        enviar.setOnClickListener {

            val intent = Intent(this, result::class.java)
            intent.putExtra("Nombre", texto.text.toString())
            startActivity(intent);

        }
    }
}