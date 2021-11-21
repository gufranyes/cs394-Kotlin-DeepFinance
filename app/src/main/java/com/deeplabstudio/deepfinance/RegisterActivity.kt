package com.deeplabstudio.deepfinance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    var email: EditText? = null
    var password: EditText? = null
    var registerButton: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_register)

        email = findViewById(R.id.editTextTextEmailAddress)
        password = findViewById(R.id.editTextTextPassword)
        registerButton = findViewById(R.id.button)

        registerButton!!.setOnClickListener {register()}

    }

    private fun register() {
        var preferences = getSharedPreferences("PREFS", MODE_PRIVATE)
        var newEmail = email!!.text.toString()
        var newPassword = password!!.text.toString()

        var editor = preferences.edit()

        editor.putString("E-mail", newEmail)
        editor.putString("Password", newPassword)
        editor.commit()

        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}