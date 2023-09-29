package com.example.appalarmamedicamentos.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appalarmamedicamentos.MainActivity
import com.example.appalarmamedicamentos.R
import com.example.appalarmamedicamentos.RegisterUserActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login4)

        val botonIngresar = findViewById<Button>(R.id.btnLogin)
        botonIngresar.setOnClickListener{
            onIngresarButtonClicked()
        }

        val botonRegistrar = findViewById<Button>(R.id.btnRegister)
        botonRegistrar.setOnClickListener{
            onRegistrarButtonClicked()
        }

    }

    private fun onIngresarButtonClicked() {
        val intent = Intent(this, MainActivity::class.java)
        // Inicia la SecondActivity
        startActivity(intent)
    }

    private fun onRegistrarButtonClicked() {
        val intent = Intent(this, RegisterUserActivity::class.java)
        // Inicia la SecondActivity
        startActivity(intent)
    }
}