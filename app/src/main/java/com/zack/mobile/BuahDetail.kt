package com.zack.mobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BuahDetail : AppCompatActivity() {

    private lateinit var txtDetailBuah : TextView
    private lateinit var imgDetailBuah : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buah_detail)


        txtDetailBuah = findViewById(R.id.txtDetailBuah)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)

        val detailText = intent.getStringExtra("deskripsi")
        val detailImage = intent.getIntExtra("image",0)

        txtDetailBuah.setText(detailText)
        imgDetailBuah.setImageResource(detailImage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}