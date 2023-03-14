package com.example.appimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEndereco: EditText = findViewById(R.id.edtEndereco)
        val edtBairro: EditText = findViewById(R.id.edtBairro)
        val edtCep: EditText = findViewById(R.id.edtCep)
        val edCidade: EditText = findViewById(R.id.edtCidade)
        val edtEstado: EditText = findViewById(R.id.edtEstado)
        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{
            val toast = Toast.makeText(this, edtNome.text.toString(), Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}