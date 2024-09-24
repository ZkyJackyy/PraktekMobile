package com.zack.mobile.BukuAdapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.zack.mobile.DetailMovie
import com.zack.mobile.MainActivity
import com.zack.mobile.R
import com.zack.mobile.ViewCardMovie
import com.zack.mobile.model.ModelMovie

class MovieAdapter constructor(
    private val getActivity:ViewCardMovie,
    private val movieList: List<ModelMovie>,
    private val onItemClick :(Int) -> Unit
) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        //ini ketika item di klik
        holder.cardView.setOnClickListener() {
            onItemClick(position)
            Toast.makeText(
                getActivity, movieList[position].title,
                Toast.LENGTH_SHORT
            ).show()
            //val intent = Intent(getActivity,DetailMovie::class.java)
           // intent.putExtra("imageResId",movieList[position].image)
           // intent.putExtra("judul",movieList[position].title)
           // intent.putExtra("tanggal",movieList[position].tanggal)
           // intent.putExtra("sinopsis",movieList[position].sinopsis)
           // getActivity.startActivity(intent)





        }
    }

}