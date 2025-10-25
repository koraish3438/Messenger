package com.example.messenger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.messenger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var hItemList: List<HorizontalModel>
    private lateinit var vItemList: List<VerticalModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hItemList()
        vItemList()

    }
    private fun hItemList() {
        hItemList = listOf(
            HorizontalModel("", "")
        )
    }

    private fun vItemList() {
        vItemList = listOf(
            VerticalModel("", "", "")
        )
    }
}