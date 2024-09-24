package com.zack.mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnt :Button
    private lateinit var btnr :Button
    private lateinit var btnbuah : Button
    private lateinit var btnmovie : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnt = findViewById(R.id.btnl)
        btnr = findViewById(R.id.btnRecycle)
        btnbuah = findViewById(R.id.btnbuah)
        btnmovie = findViewById(R.id.btnmovie)

        btnt.setOnClickListener(){
            val intent = Intent(this, listview::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }
        btnr.setOnClickListener(){
            val intent = Intent(this, RecycleView::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }
        btnbuah.setOnClickListener(){
            val intent = Intent(this, CustomImage::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }

        btnmovie.setOnClickListener(){
            val intent = Intent(this, ViewCardMovie::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_data)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}