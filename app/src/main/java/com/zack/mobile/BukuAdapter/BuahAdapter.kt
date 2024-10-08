package com.zack.mobile.BukuAdapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zack.mobile.BuahDetail
import com.zack.mobile.CustomImage
import com.zack.mobile.MainActivity
import com.zack.mobile.R
import com.zack.mobile.model.ModelBuah

class BuahAdapter (val itemList: ArrayList<ModelBuah>,private val getActivity: CustomImage):
      RecyclerView.Adapter<BuahAdapter.ModelViewHolder>(){
    class ModelViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemimage : ImageView
        var itemtext : TextView


        init {
            itemimage = itemView.findViewById(R.id.gambar) as ImageView
            itemtext = itemView.findViewById(R.id.nama) as TextView
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahAdapter.ModelViewHolder {

        val nView =LayoutInflater.from(parent.context)
            .inflate(R.layout.item_customimage, parent ,false)
        return ModelViewHolder(nView)

    }

    override fun getItemCount(): Int {
        return itemList.size

    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {

        holder.itemimage.setImageResource(itemList[position].image)
        holder.itemtext.setText(itemList[position].nama)

        holder.itemView.setOnClickListener(){

            val intent = Intent(getActivity,BuahDetail::class.java)
            intent.putExtra("deskripsi", itemList[position].nama)
            intent.putExtra("image", itemList[position].image)
            getActivity.startActivity(intent)
        }

    }


}