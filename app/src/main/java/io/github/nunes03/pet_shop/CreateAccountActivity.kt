package io.github.nunes03.pet_shop

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.github.nunes03.pet_shop.datas.entities.UserEntity
import io.github.nunes03.pet_shop.datas.existByEmail
import io.github.nunes03.pet_shop.datas.saveUser

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val saveButton: Button = findViewById(R.id.botaoCadastrarCriarConta);
        val backButton: Button = findViewById(R.id.botaoVoltarCriarConta);

        saveButton.setOnClickListener { save() };
        backButton.setOnClickListener { backToLogin() };
    }

    private fun save() {
        if (isValid()) {
            val newUser = buildUser()
            saveUser(newUser)

            getTextValidate().text = ""
        }
    }

    private fun backToLogin() {
        finish();
    }

    private fun isValid(): Boolean {
        return isEmailValid() && isPasswordValid();
    }

    private fun isEmailValid(): Boolean {
        val email = getTextEmail().text.toString()
        return existByEmail(email)
    }

    private fun isPasswordValid(): Boolean {
        val password: String = getTextPassword().text.toString()
        val confirmPassword: String = getTextConfirmPassword().text.toString()

        return password == confirmPassword;
    }

    private fun buildUser(): UserEntity {
        val email = getTextEmail().text.toString();
        val password = getTextConfirmPassword().text.toString();

        return UserEntity(email, password);
    }

    private fun getTextEmail(): TextView = findViewById(R.id.textEmailLogin)

    private fun getTextPassword(): TextView = findViewById(R.id.textSenhaCriarConta)

    private fun getTextConfirmPassword(): TextView = findViewById(R.id.textConfirmarSenhaCriarConta)

    private fun getTextValidate(): TextView = findViewById(R.id.textValidateCreateAccount)
}