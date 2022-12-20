package com.goha.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Button).setOnClickListener{
            var a = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()
            var b = 2
            val wynik = mutableListOf<String>()

            while ( a > 1 )
            {  while ( a % b == 0 )
            {
                val k2 = b.toString()
                wynik += k2
                a /= b
            }
                b += 1
            }
            findViewById<TextView>(R.id.text1).text = wynik.toString()
        }
    }
}