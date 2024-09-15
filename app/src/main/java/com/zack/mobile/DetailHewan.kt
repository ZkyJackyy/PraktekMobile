package com.zack.mobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailHewan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_hewan)

        val namahewan = intent.getStringExtra("namahewan")
        val gambarhewan = intent.getIntExtra("gambarhewan",0)

        val tvnamahewan = findViewById<TextView>(R.id.tvNamaHewan)
        tvnamahewan.text =namahewan

        val ivgambarhewan = findViewById<ImageView>(R.id.ivGambarHewan)
        ivgambarhewan.setImageResource(gambarhewan)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}