package com.zack.mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zack.mobile.BukuAdapter.BuahAdapter
import com.zack.mobile.model.MockList
import com.zack.mobile.model.ModelBuah

class CustomImage : AppCompatActivity() {

    private lateinit var rv_buah : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_image)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_data)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rv_buah = findViewById(R.id.rv_data)
        rv_buah.layoutManager = GridLayoutManager(this,1,
            GridLayoutManager.VERTICAL,false)

        val adapter = BuahAdapter(MockList.getModel()as ArrayList<ModelBuah>){buah ->
            val intent = Intent(this, DetailBuah::class.java)
            intent.putExtra("namaBuah",buah.nama)
            intent.putExtra("gambarBuah",buah.image)
            startActivity(intent)


        }
        rv_buah.adapter =adapter


    }
}