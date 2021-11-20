package com.luzmag.proycortinas

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //carga el diseño

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onLogin(view: View) {
        if (edtUsername.text.toString() == "lmgr@gmail.com" && edtPassword.text.toString() == "1234"){
            val intento = Intent(this, DrawerActivity::class.java)
//            intento.putExtra("username", edtUsername.text.toString())
            startActivity(intento)
        }
    }

    fun onRegister(view: View) {
            val intento = Intent(this, SellerRegister::class.java)
            startActivity(intento)
    }
}