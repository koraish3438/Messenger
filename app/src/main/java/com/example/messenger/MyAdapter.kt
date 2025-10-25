package com.example.messenger

import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private var data: List<String>, private val layout: Int, private val listener: AdapterView.OnItemClickListener): RecyclerView.Adapter<MyAdapter.MyViewAdapter> {
    class MyViewAdapter(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewAdapter {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewAdapter, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}