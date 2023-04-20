package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val rollButton: Button = findViewById(R.id.rollButton)
    val resultTextView: TextView = findViewById(R.id.resultTextView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            resultTextView.text = roll().toString()
        }
    }
    
    fun roll(sides: Int = 6): Int {
        return (1..sides).random()
    }

}