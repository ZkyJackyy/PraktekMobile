package com.zack.mobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zack.mobile.BukuAdapter.AdapterBuku
import com.zack.mobile.model.ModelBuku

class RecycleView : AppCompatActivity() {


    private lateinit var rv_buku :RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)

        rv_buku= findViewById(R.id.rv_buku)

        val listbuku = listOf(
            ModelBuku(title = "Buku Android Kotlin 2024", penulis = "Muhammad zacky"),
            ModelBuku(title = "Buku Android Kotlin2 2024", penulis = "Muhammad zacky"),
            ModelBuku(title = "Buku Android Kotlin3 2024", penulis = "Muhammad zacky"),
            ModelBuku(title = "Buku Android Kotlin4 2024", penulis = "Muhammad zacky"),
            ModelBuku(title = "Buku Android Kotlin5 2024", penulis = "Muhammad zacky"),
        )
        val nBukuAdapter = AdapterBuku(listbuku)
            rv_buku.apply {
            layoutManager = LinearLayoutManager(this@RecycleView)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}