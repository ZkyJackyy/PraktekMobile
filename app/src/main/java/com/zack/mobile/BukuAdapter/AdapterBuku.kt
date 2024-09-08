package com.zack.mobile.BukuAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.WindowInsetsCompat.Type
import androidx.recyclerview.widget.RecyclerView
import com.zack.mobile.R
import com.zack.mobile.RecycleView
import com.zack.mobile.model.ModelBuku

class AdapterBuku (private val buku: List<ModelBuku>) :
    RecyclerView.Adapter<AdapterBuku.BukuAdapterHolder>() {


    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtJudul : TextView = view.findViewById(R.id.txtjdulbuku)
        val txtPenulis : TextView = view.findViewById(R.id.txtpenulis)
    }


    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {

        holder.txtPenulis.text = buku[position].penulis
        holder.txtJudul.text = buku[position].title
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {

        val  view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return  BukuAdapterHolder(view)
    }

    override fun getItemCount(): Int{
        return buku.size
    }

}