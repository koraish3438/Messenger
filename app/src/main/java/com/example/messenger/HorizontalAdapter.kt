package com.example.messenger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.messenger.databinding.HorizontalItemBinding

class HorizontalAdapter(private var hData: List<HorizontalModel>,
                        private val onclick: (HorizontalModel) -> Unit
): RecyclerView.Adapter<HorizontalAdapter.HViewAdapter>() {
    class HViewAdapter(val binding: HorizontalItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HViewAdapter {
        val binding = HorizontalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HViewAdapter(binding)
    }

    override fun onBindViewHolder(holder: HViewAdapter, position: Int) {
        val currentItem = hData[position]
        holder.binding.hItemName.text = currentItem.hName

        Glide.with(holder.binding.hItemImage.context)
            .load(currentItem.hImage)
            .into(holder.binding.hItemImage)

        holder.binding.root.setOnClickListener {
            onclick(currentItem)
        }

    }

    override fun getItemCount(): Int {
        return hData.size
    }

}