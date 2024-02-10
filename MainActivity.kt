package com.example.equazionidisecondogrado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById

        val a = findViewById<TextView>(R.id.editTextNumberSigned1)
        val b = findViewById<TextView>(R.id.editTextNumberSigned2)
        val c = findViewById<TextView>(R.id.editTextNumberSigned3)

        val Delta = findViewById<TextView>(R.id.textView5)
        val x1 = findViewById<TextView>(R.id.textView7)
        val x2 = findViewById<TextView>(R.id.textView9)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener()
        {
            Delta.text = (b.text.toString().toDouble() * b.text.toString().toDouble() - (4 * a.text.toString().toDouble() * c.text.toString().toDouble() )).toString()

            x1.text = (((-b.text.toString().toDouble() + sqrt(Delta.text.toString().toDouble()))/(a.text.toString().toDouble() * 2))).toString()

            x2.text = (((-b.text.toString().toDouble() - sqrt(Delta.text.toString().toDouble()))/(a.text.toString().toDouble() * 2))).toString()

        }




    }
}
