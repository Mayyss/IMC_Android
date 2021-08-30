package com.example.imc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variavel nome igual (Está em recursos com o id chamado exemple_ex)
        val editPeso = findViewById<EditText>(R.id.edit_peso)
        val editAltura = findViewById<EditText>(R.id.edit_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener {
            Toast.makeText(this, editPeso.text.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}