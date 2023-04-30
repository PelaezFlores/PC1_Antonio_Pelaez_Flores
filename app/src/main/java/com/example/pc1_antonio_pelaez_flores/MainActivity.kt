package com.example.pc1_antonio_pelaez_flores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNum1: EditText = findViewById(R.id.etNumero1)
        val etNum2: EditText = findViewById(R.id.etNumero2)
        val btnEnviar: Button = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("num1", num1)
            intent.putExtra("num2", num2)
            startActivity(intent)

        }
    }
}