package br.unipar.atividade_2_calculadora_simples

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val numero1 = findViewById<TextView>(R.id.txtNum1)
        val numero2 = findViewById<TextView>(R.id.txtNum2)
        val btnSomar = findViewById<Button>(R.id.btnSomar)
        val btnSubtrair = findViewById<Button>(R.id.btnSubtrair)
        val resultado = findViewById<TextView>(R.id.txtResultado)


        btnSomar.setOnClickListener {

            val numero1Informado = numero1.text.toString()
            val numero2Informado = numero2.text.toString()

            if (numero1Informado.isNotEmpty() && numero2Informado.isNotEmpty()) {

                val num1 = numero1Informado.toInt()
                val num2 = numero2Informado.toInt()

                var result = num1 + num2

                resultado.setText("Resultado: $result")

            }else{
                resultado.setText("Insira os dois Numeros")
            }
        }

        btnSubtrair.setOnClickListener {

            val numero1Informado = numero1.text.toString()
            val numero2Informado = numero2.text.toString()

            if (numero1Informado.isNotEmpty() && numero2Informado.isNotEmpty()) {

                val num1 = numero1Informado.toInt()
                val num2 = numero2Informado.toInt()

                var result = num1 - num2

                resultado.setText("Resultado: $result")

            }else{
                resultado.setText("Insira os dois Numeros")
            }
        }

    }

    fun limparValores(view: View){
        val numero1 = findViewById<TextView>(R.id.txtNum1)
        val numero2 = findViewById<TextView>(R.id.txtNum2)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        numero1.setText("")
        numero2.setText("")
        resultado.setText("")

    }

}