package com.zack.mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginPage : AppCompatActivity() {

    private lateinit var User :EditText
    private lateinit var password :EditText
    private lateinit var btnlogin :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        User = findViewById(R.id.etuser)
        password =findViewById(R.id.etPass)
        btnlogin =findViewById(R.id.btn)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnlogin.setOnClickListener(){
            val intent = Intent(this@loginPage, welcomePage::class.java)
            val nusername = User.text.toString()
            val npassword = password.text.toString()

            intent.putExtra("username", nusername)
            intent.putExtra("Password", npassword)
            startActivity(intent)

        }

    }
}