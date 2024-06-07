package com.example.acdevmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pergunta4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pergunta4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextNome: EditText = findViewById(R.id.caixaTexto)
        val buttonEnviarNome: Button = findViewById(R.id.botao14)
        val textViewSaudacao: TextView = findViewById(R.id.texto5)
        val buttonIniciarPerguntas: Button = findViewById(R.id.buttonIniciarPerguntas)

        buttonEnviarNome.setOnClickListener {
            val nome = editTextNome.text.toString()
            val saudacao = "Olá, $nome! \n Bem-vindo ao nosso aplicativo."
            textViewSaudacao.text = saudacao
            buttonIniciarPerguntas.visibility = Button.VISIBLE
        }

        buttonIniciarPerguntas.setOnClickListener {
            val intent = Intent(this, Pergunta2::class.java)
            startActivity(intent)
        }

    }
}