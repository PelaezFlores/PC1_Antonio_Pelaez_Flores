package com.example.pc1_antonio_pelaez_flores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val num1 = intent.getIntExtra("num1", 0)
        val num2 = intent.getIntExtra("num2", 0)

        val suma = num1 + num2
        val resta = num1 - num2
        val multiplicacion = num1 * num2
        val division = num1 / num2.toDouble()

        val tvSum: TextView = findViewById(R.id.tvSum)
        val tvRest: TextView = findViewById(R.id.tvRest)
        val tvMult: TextView = findViewById(R.id.tvMult)
        val tvDiv: TextView = findViewById(R.id.tvDiv)

        tvSum.text = "$suma"
        tvRest.text = "$resta"
        tvMult.text = "$multiplicacion"
        tvDiv.text = "$division"
    }

    }
