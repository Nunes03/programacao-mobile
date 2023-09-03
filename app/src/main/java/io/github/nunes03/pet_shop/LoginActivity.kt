package io.github.nunes03.pet_shop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.botaoEntrarLogin);
        val createAccountButton: Button = findViewById(R.id.botaoCriarContaLogin);

        loginButton.setOnClickListener { login() };
        createAccountButton.setOnClickListener { createAccount() };
    }

    private fun login() {
        val homeActivity = Intent(this, HomeActivity::class.java);
        startActivity(homeActivity);
    }

    private fun createAccount() {
        val createAccountActivity = Intent(this, CreateAccountActivity::class.java);
        startActivity(createAccountActivity);
    }
}