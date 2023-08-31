package io.github.nunes03.pet_shop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val entrarBotao: Button = findViewById(R.id.botaoEntrarLogin);
        val criarContaBotao: Button = findViewById(R.id.botaoCriarContaLogin);

        entrarBotao.setOnClickListener { entrar() };
        criarContaBotao.setOnClickListener { criarConta() };
    }

    private fun entrar() {
        val homeActivity = Intent(this, HomeActivity::class.java);
        startActivity(homeActivity);
    }

    private fun criarConta() {
        val criarContaActivity = Intent(this, CriarContaActivity::class.java);
        startActivity(criarContaActivity);
    }
}