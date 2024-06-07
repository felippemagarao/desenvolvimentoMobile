package com.example.acdevmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pergunta2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pergunta2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botaoTrilha: Button = findViewById(R.id.botao2)
        botaoTrilha.setOnClickListener {
            val intent = Intent(this, Pergunta3 ::class.java)
            intent.putExtra("Answer1", "Trilha")
            startActivity(intent)
        }

        val botaoMuseu: Button = findViewById(R.id.botao3)
        botaoMuseu.setOnClickListener {
            val intent = Intent(this, Pergunta3 ::class.java)
            intent.putExtra("Answer1", "Museu")
            startActivity(intent)
        }

        val botaoPraia: Button = findViewById(R.id.botao4)
        botaoPraia.setOnClickListener {
            val intent = Intent(this, Pergunta3 ::class.java)
            intent.putExtra("Answer1", "Praia")
            startActivity(intent)
        }

        val botaoFesta: Button = findViewById(R.id.botao5)
        botaoFesta.setOnClickListener {
            val intent = Intent(this, Pergunta3 ::class.java)
            intent.putExtra("Answer1", "Festa")
            startActivity(intent)
        }
    }
}