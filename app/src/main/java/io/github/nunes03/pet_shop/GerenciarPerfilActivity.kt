package io.github.nunes03.pet_shop

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.google.android.material.snackbar.Snackbar


class GerenciarPerfilActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerenciar_perfil)

        val alterarBotao: Button = findViewById(R.id.alterar);
        val voltarBotao: Button = findViewById(R.id.voltar);

        alterarBotao.setOnClickListener { mensagem() }
        voltarBotao.setOnClickListener { voltar() }

    }

    private fun visualisarBotaoAlteracao(mostrar: Boolean) {
        val alterarBotao: Button = findViewById(R.id.alterar);
        alterarBotao.isVisible = mostrar;
    }

    private fun mensagem() {
        var coordinatorLayout: LinearLayout = findViewById(R.id.gerenciar_perfil);

        val snackbar = Snackbar
            .make(coordinatorLayout, "Alterado com sucesso!", Snackbar.LENGTH_LONG)
        snackbar.show()

    }

    private fun voltar() {
        val homeActivity = Intent(this, HomeActivity::class.java);
        startActivity(homeActivity);
    }


}