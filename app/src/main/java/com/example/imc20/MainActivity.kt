package com.example.imc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/*import android.widget.Button
import android.widget.EditText
import android.widget.Toast
*/

//Essa classe herda tudo o que tem da outra classe
class MainActivity : AppCompatActivity() {
    //Override - sobescrever
    override fun onCreate(savedInstanceState: Bundle?) {
        //Super - em cima
        super.onCreate(savedInstanceState)
        //Qual desenho vamos renderizar
        setContentView(R.layout.activity_main)
        /*
        //variavel nome igual (Está em recursos com o id chamado exemple_ex)
        val editPeso = findViewById<EditText>(R.id.edit_peso)
        val editAltura = findViewById<EditText>(R.id.edit_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener {
            Toast.makeText(this, editPeso.text.toString(), Toast.LENGTH_SHORT).show()
        }
        */
        //Val - cria uma constante, sempre que for instanciar uma constante
        //Var - cria uma variável
        //findView - encontrar uma view pelo id, dentro do menor e maior tem que colocar o tipo de dado

        //Criação de instancias para as Views
        //Para serem manipuladas no Kotlin
        val editTextPeso = findViewById<EditText>(R.id.edit_peso)
        val editTextAltura = findViewById<EditText>(R.id.edit_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val textViewResultado = findViewById<TextView>(R.id.text_view_resultado)

        //Adicionar um ouvinte ao button
        buttonCalcular.setOnClickListener {
            if (editTextPeso.text.isEmpty()){
                editTextPeso.error = "Peso é obrigatório!"
            }
            else if(editTextAltura.text.isEmpty()){
                editTextAltura.error = "Altura é obrigatório!"
            }
            else {
                //Cria a variavel peso da view e pega o que tem dentro, transforma em string, e após transforma no tipo int
                var peso = editTextPeso.text.toString().toInt()
                var altura = editTextAltura.text.toString().toDouble()

                val imc = peso / (altura * altura)
                //textViewResultado.text = "$imc"
                //Para imprimir o valor da variavel imc - coloca o sifrão
                //Quando sem o sifrão para dizer que é a String


                //textViewResultado.text = imc.toString()

                //% representa qualquer valor apos o ponto irá aparecer 1 casa decimal, numeros após o ponto se chama flutuantes
                textViewResultado.text = String.format("%.1f", imc)
            }

        }


    }
}