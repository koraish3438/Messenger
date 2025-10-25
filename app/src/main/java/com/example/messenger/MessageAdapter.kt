package com.example.messenger

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.messenger.databinding.MessageItemBinding

class MessageAdapter(private val messageList: List<Pair<String, Boolean>>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(val binding: MessageItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding = MessageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MessageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val (msg, isUser) = messageList[position]

        with(holder.binding) {
            if (isUser) {
                rightMessage.visibility = View.VISIBLE
                leftMessage.visibility = View.GONE
                rightMessage.text = msg
            } else {
                leftMessage.visibility = View.VISIBLE
                rightMessage.visibility = View.GONE
                leftMessage.text = msg
            }
        }

    }

    override fun getItemCount() = messageList.size
}

