package com.zack.mobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovie : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)



        val detailText = intent.getStringExtra("judul")

        val imageResId = intent.getIntExtra("imageResId",-1)

        val tanggal =  intent.getStringExtra("tanggal")

        val sinopsis = intent.getStringExtra("sinopsis")


        if(imageResId != -1){
            val imageView = findViewById<ImageView>(R.id.ivDetail)
            imageView.setImageResource(imageResId)
            val tvdetail = findViewById<TextView>(R.id.tvDetail)
            val tanggalr = findViewById<TextView>(R.id.DetailRelease)
            val sinopsisd = findViewById<TextView>(R.id.DetailSinopsis)
            tvdetail.text = detailText
            tanggalr.text =tanggal
            sinopsisd.text = sinopsis


        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}