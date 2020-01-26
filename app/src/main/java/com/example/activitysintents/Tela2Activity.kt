package com.example.activitysintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val name = intent.getStringExtra("nome")
        //recebe o extra da idade ou -1 caso não seja informado
        val age = intent.getIntExtra("idade", -1)
        textMensagem.text = getString(R.string.texto_nome_idade, name, age)

        val cliente = intent.getParcelableExtra<Cliente>("cliente")
        textMensagem.text = if (cliente != null) {
            getString(R.string.texto_cliente_codigo, cliente.nome, cliente.codigo)
        } else {
            getString(R.string.texto_nome_idade, name, age)
        }

        //faz a conversão para pessoa podendo ser nulo nesse caso
        val pessoa = intent.getParcelableExtra<Pessoa>("pessoa")

        if (pessoa != null) {
            textMensagem.text = getString(R.string.texto_nome_idade, pessoa.nome, pessoa.idade)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("NAVEG","Tela2::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NAVEG","Tela2::onResume")
    }
}
