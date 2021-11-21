package com.deeplabstudio.deepfinance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    var email: EditText? = null
    var password: EditText? = null
    var loginButton: Button? = null
    var regButton: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        email = findViewById(R.id.editTextLoginEmailAddress)
        password = findViewById(R.id.editTextLoginPassword)
        loginButton = findViewById(R.id.LoginButton)
        regButton = findViewById(R.id.regButton)

        loginButton!!.setOnClickListener{login()}
        regButton!!.setOnClickListener { goToReg() }

    }

    private fun login() {
        var preferences = getSharedPreferences("PREFS", MODE_PRIVATE)
        var prefEmail = preferences.getString("E-mail", "E-mail")
        var prefPW = preferences.getString("Password", "Password")

        if (prefEmail.equals(email!!.text.toString()) && prefPW.equals(password!!.text.toString())) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun goToReg() {
        startActivity(Intent(this,RegisterActivity::class.java))
        finish()
    }

}