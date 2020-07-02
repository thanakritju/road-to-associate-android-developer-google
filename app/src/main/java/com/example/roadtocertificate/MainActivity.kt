package com.example.roadtocertificate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.count_up_button)

        rollButton.setOnClickListener {
            rollDice()
        }
        countUpButton.setOnClickListener {
            countUp()
        }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        var number  = try {
            resultText.text.toString().toInt()
        } catch (e: NumberFormatException) {
            0
        }

        if (number < 6) {
            number += 1
        }

        resultText.text = number.toString()
    }
}