package io.github.nunes03.pet_shop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CriarContaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_conta)

        val botaoCadastrar: Button = findViewById(R.id.botaoCadastrarCriarConta);
        val botaoVoltar: Button = findViewById(R.id.botaoVoltarCriarConta);

        botaoCadastrar.setOnClickListener { cadastrar() };
        botaoVoltar.setOnClickListener { voltar() };
    }

    private fun cadastrar() {

    }

    private fun voltar() {
        finish();
    }
}