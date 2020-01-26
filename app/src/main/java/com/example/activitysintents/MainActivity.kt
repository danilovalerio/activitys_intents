package com.example.activitysintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener { v ->
            val texto = editText.text.toString()
            if (v is Button) {
                Toast.makeText(this, "${v.text} - $texto",
                    Toast.LENGTH_SHORT).show()
            }
        }

        val intent = Intent(this, Tela2Activity::class.java)

        btnTela2.setOnClickListener {

            intent.putExtra("nome", "José")
            intent.putExtra("idade", "33")

            startActivity(intent)
        }

        btnParcel.setOnClickListener {
            //cria o cliente
            val cliente = Cliente(1, "Danilo")
            intent.putExtra("cliente", cliente)

            startActivity(intent)
        }

        btnSerializable.setOnClickListener {
            val pessoa = Pessoa("Maria", 40)
            intent.putExtra("pessoa", pessoa)

            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("NAVEG","Tela1::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NAVEG","Tela1::onResume")
    }
}
