package com.example.messenger

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.messenger.databinding.VerticalItemBinding

class VerticalAdapter(private var vData: List<VerticalModel>,
                      private val onClick: (VerticalModel) -> Unit
): RecyclerView.Adapter<VerticalAdapter.VViewHolder>(){
    class VViewHolder(val binding: VerticalItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VViewHolder {
        val binding = VerticalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VViewHolder, position: Int) {
        val currentItem = vData[position]
        holder.binding.VItemName.text = currentItem.vName
        holder.binding.VItemSubtitle.text = currentItem.vSubtitle
        Glide.with(holder.binding.VItemImage.context)
            .load(currentItem.vImage)
            .into(holder.binding.VItemImage)

        holder.binding.root.setOnClickListener {
            onClick(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return vData.size
    }
}