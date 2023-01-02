package com.ranggacikal.daggereample.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ranggacikal.daggereample.R
import com.ranggacikal.daggereample.model.FootbalClub

class FootballAdapter(private val listFootballClub: List<FootbalClub>): RecyclerView.Adapter<FootballAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_football, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FootballAdapter.ViewHolder, position: Int) {
        holder.bind(listFootballClub[position])
    }

    override fun getItemCount() = listFootballClub.size
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(index: FootbalClub) {
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById(R.id.img_football_club))
            itemView.findViewById<TextView>(R.id.tv_name_football).text = index.name
        }
    }
}