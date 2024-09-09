package com.sena.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java )
            startActivity(intent)
        }

        val View=findViewById<TextView>(R.id.textView6)

        View.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java )
            startActivity(intent)
        }

        val Viewr=findViewById<TextView>(R.id.textView2)

        Viewr.setOnClickListener {
            val intent = Intent(this, RecuperarActivity::class.java )
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}