package com.example.acdevmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pergunta3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pergunta3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val answer1 = intent.getStringExtra("Answer1")

        val botaoInverno: Button = findViewById(R.id.botao2)
        botaoInverno.setOnClickListener {
            navigateToFinalActivity(answer1, "Inverno")
        }

        val botaoOutono: Button = findViewById(R.id.botao3)
        botaoOutono.setOnClickListener {
            navigateToFinalActivity(answer1, "Outono")
        }

        val botaoPrimavera: Button = findViewById(R.id.botao4)
        botaoPrimavera.setOnClickListener {
            navigateToFinalActivity(answer1, "Primavera")
        }

        val botaoVerao: Button = findViewById(R.id.botao5)
        botaoVerao.setOnClickListener {
            navigateToFinalActivity(answer1, "Verao")
        }
    }

    private fun navigateToFinalActivity(answer1: String?, answer2: String) {
        val finalActivityClass = when {
           //trilha
            answer1 == "Trilha" && answer2 == "Inverno" -> Resposta4::class.java
            answer1 == "Trilha" && answer2 == "Verao" -> Resposta1::class.java
            answer1 == "Trilha" && answer2 == "Outono" -> Resposta4::class.java
            answer1 == "Trilha" && answer2 == "Primavera" -> Resposta4::class.java
            //museu
            answer1 == "Museu" && answer2 == "Inverno" -> Resposta2::class.java
            answer1 == "Museu" && answer2 == "Verao" -> Resposta2::class.java
            answer1 == "Museu" && answer2 == "Outono" -> Resposta2::class.java
            answer1 == "Museu" && answer2 == "Primavera" -> Resposta4::class.java
            //praia
            answer1 == "Praia" && answer2 == "Inverno" -> Resposta4::class.java
            answer1 == "Praia" && answer2 == "Verao" -> Resposta1::class.java
            answer1 == "Praia" && answer2 == "Outono" -> Resposta1::class.java
            answer1 == "Praia" && answer2 == "Primavera" -> Resposta1::class.java
            //festa
            answer1 == "Festa" && answer2 == "Inverno" -> Resposta3::class.java
            answer1 == "Festa" && answer2 == "Verao" -> Resposta3::class.java
            answer1 == "Festa" && answer2 == "Outono" -> Resposta3::class.java
            answer1 == "Festa" && answer2 == "Primavera" -> Resposta3::class.java

            else -> Resposta4::class.java
        }

        val intent = Intent(this, finalActivityClass)
        startActivity(intent)

    }
}