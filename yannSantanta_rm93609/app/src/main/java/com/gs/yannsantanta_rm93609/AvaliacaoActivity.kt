package com.gs.yannsantanta_rm93609

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class AvaliacaoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avaliacao)

        val integrante1Nome = "Yann Santana"
        val integrante1RM = "93609"
        val integrante2Nome = "Daniel Marques"
        val integrante2RM = "95175"
        val integrante3Nome = "Ana Beatriz "
        val integrante3RM = "96229"

        val textViewIntegrante1 = findViewById<TextView>(R.id.textView_integrante1)
        val textViewIntegrante2 = findViewById<TextView>(R.id.textView_integrante2)
        val textViewIntegrante3 = findViewById<TextView>(R.id.textView_integrante3)

        textViewIntegrante1.text = "$integrante1Nome - $integrante1RM"
        textViewIntegrante2.text = "$integrante2Nome - $integrante2RM"
        textViewIntegrante3.text = "$integrante3Nome - $integrante3RM"
    }
}
