package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rolLButton : Button = findViewById(R.id.roll_button)
        rolLButton.setOnClickListener { rollDice() }
        val incrementButton : Button = findViewById(R.id.increment_button)
        incrementButton.setOnClickListener { increment() }
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText : TextView = findViewById(R.id.result_text)
        println(randomInt)
        resultText.text = randomInt.toString()
    }

    private fun increment() {
        val resultText : TextView =  findViewById(R.id.result_text)
        try {
            val textToInt : Int = resultText.text.toString().toInt()
            if(textToInt == 6) return
            resultText.text = (textToInt + 1).toString()
        } catch (e : java.lang.NumberFormatException) {
            resultText.text = (1).toString()
        }
    }
}