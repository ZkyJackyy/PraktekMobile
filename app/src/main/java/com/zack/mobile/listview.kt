package com.zack.mobile

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class listview : AppCompatActivity() {

    private lateinit var lv_item : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listview)

        lv_item = findViewById(R.id.lsview)

        val namahewan = listOf("harimau","ikan","kuda","gajah","kumbang")

        val gambarhewan = mapOf(
            "harimau" to R.drawable.harimau,
            "ikan" to R.drawable.ikan,
            "kuda" to R.drawable.kuda,
            "gajah" to R.drawable.gajah,
            "kumbang" to R.drawable.kumbang,
        )



        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,namahewan)


        lv_item.setOnItemClickListener(){
            parent,view ,position ,id ->
            val selectedhewan =namahewan[position]
            Toast.makeText(this, "anda memilih : ${namahewan[position]}", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DetailHewan::class.java)
            intent.putExtra("namahewan",selectedhewan)
            intent.putExtra("gambarhewan",gambarhewan[selectedhewan]?:0)
            startActivity(intent)
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_data)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}