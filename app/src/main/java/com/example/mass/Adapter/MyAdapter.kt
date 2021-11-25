package com.example.mass.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mass.College
import com.example.mass.R

class MyAdapter(private val data : List<College>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.textName.text = data[position].title
        holder.textCollege.text = data[position].description
    }

    override fun getItemCount(): Int {
        return data.size
    }
    class MyViewHolder(itemView: View):  RecyclerView.ViewHolder(itemView){
        val textName = itemView.findViewById<TextView>(R.id.textName)
        val textCollege = itemView.findViewById<TextView>(R.id.textCollege)

    }


}

