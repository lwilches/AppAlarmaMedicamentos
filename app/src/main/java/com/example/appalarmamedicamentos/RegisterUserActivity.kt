package com.example.appalarmamedicamentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appalarmamedicamentos.ui.login.LoginActivity

class RegisterUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        val botonRegistrar = findViewById<Button>(R.id.btnRegistrar)
        botonRegistrar.setOnClickListener{
            onRegisterButtonClicked()
        }
    }

    private fun onRegisterButtonClicked() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}