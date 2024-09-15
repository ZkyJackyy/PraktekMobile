package com.zack.mobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        val NmBuah = intent.getStringExtra("namaBuah")
        val gmbrBuah = intent.getIntExtra("gambarBuah",0)

        val tvNmBuah = findViewById<TextView>(R.id.tvNmBuah)
        val ivGmbrBuah = findViewById<ImageView>(R.id.ivGmbrBuah)

        tvNmBuah.text =NmBuah
        ivGmbrBuah.setImageResource(gmbrBuah)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}