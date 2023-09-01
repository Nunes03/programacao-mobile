package io.github.nunes03.pet_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sairBotao: Button = findViewById(R.id.sair);
        val perfilBotao: Button = findViewById(R.id.perfil);

        sairBotao.setOnClickListener { sair() };
        perfilBotao.setOnClickListener { gerenciarPerfil() };
    }

    private fun sair() {
        val loginActivity = Intent(this, LoginActivity::class.java);
        startActivity(loginActivity);
    }

    private fun gerenciarPerfil() {
        val gerenciarPerfilActivity = Intent(this, GerenciarPerfilActivity::class.java);
        startActivity(gerenciarPerfilActivity);
    }
}