package com.example.messenger

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.messenger.databinding.ActivityShowBinding

class ShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backIcon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val name = intent.getStringExtra("name")
        val image = intent.getStringExtra("image")

        binding.selectedUserName.text = name
        Glide.with(this).load(image).into(binding.selectedUserImage)

        // Demo messages
        val messages = listOf(
            "Hi there!" to false,
            "Hello! How are you?" to true,
            "I'm good, thanks!" to false,
            "Nice! Let's catch up soon." to true,
            "What are you doing today?" to false,
            "Just working on my Android project." to true,
            "Sounds cool! Need any help?" to false,
            "Maybe later, thanks!" to true,
            "Do you want to grab coffee?" to false,
            "Sure, let's go at 4 PM." to true,
            "Perfect, see you then!" to false,
            "Don't be late 😄" to true,
            "Haha, won't be late!" to false,
            "Have you finished the homework?" to true,
            "Not yet, planning to do it tonight." to false,
            "Alright, good luck!" to true,
            "Thanks! You too." to false,
            "Did you watch the latest movie?" to true,
            "Yes! It was amazing!" to false,
            "I need to watch it this weekend." to true,
            "Let’s plan a movie night." to false,
            "Great idea! Count me in." to true,
            "See you Friday?" to false,
            "Absolutely!" to true,
            "Bring snacks 😋" to false,
            "Of course!" to true
        )

        // RecyclerView setup
        val layoutManager = LinearLayoutManager(this)
        layoutManager.stackFromEnd = true
        binding.messageRecyclerView.layoutManager = layoutManager
        binding.messageRecyclerView.adapter = MessageAdapter(messages)


    }
}