package com.example.messenger

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.messenger.databinding.ActivityMainBinding
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var hItemList: List<HorizontalModel>
    private lateinit var vItemList: List<VerticalModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hItemLoad()
        vItemLoad()

        val hAdapter = HorizontalAdapter(hItemList) {selectedH ->
            val intent = Intent(this, ShowActivity::class.java)
            intent.putExtra("name", selectedH.hName)
            intent.putExtra("image", selectedH.hImage)
            startActivity(intent)
        }
        binding.horizontalView.adapter = hAdapter
        binding.horizontalView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val vAdapter = VerticalAdapter(vItemList) { selectedV ->
            val intent = Intent(this, ShowActivity::class.java)
            intent.putExtra("name", selectedV.vName)
            intent.putExtra("image", selectedV.vImage)
            startActivity(intent)
        }
        binding.verticalView.adapter = vAdapter
        binding.verticalView.layoutManager = LinearLayoutManager(this)


    }
    private fun hItemLoad() {
        hItemList = listOf(
            HorizontalModel("https://randomuser.me/api/portraits/men/1.jpg", "Koraish"),
            HorizontalModel("https://randomuser.me/api/portraits/men/2.jpg", "Ashraf"),
            HorizontalModel("https://randomuser.me/api/portraits/men/3.jpg", "Rohit"),
            HorizontalModel("https://randomuser.me/api/portraits/men/4.jpg", "Sami"),
            HorizontalModel("https://randomuser.me/api/portraits/men/5.jpg", "Jamil"),
            HorizontalModel("https://randomuser.me/api/portraits/men/6.jpg", "Hasib"),
            HorizontalModel("https://randomuser.me/api/portraits/men/7.jpg", "Rafi"),
            HorizontalModel("https://randomuser.me/api/portraits/men/8.jpg", "Arif"),
            HorizontalModel("https://randomuser.me/api/portraits/men/9.jpg", "Rakib"),
            HorizontalModel("https://randomuser.me/api/portraits/men/10.jpg", "Sabbir"),
            HorizontalModel("https://randomuser.me/api/portraits/men/11.jpg", "Imran"),
            HorizontalModel("https://randomuser.me/api/portraits/men/12.jpg", "Tanvir"),
            HorizontalModel("https://randomuser.me/api/portraits/men/13.jpg", "Mehedi"),
            HorizontalModel("https://randomuser.me/api/portraits/men/14.jpg", "Fahim"),
            HorizontalModel("https://randomuser.me/api/portraits/men/15.jpg", "Rasel"),
            HorizontalModel("https://randomuser.me/api/portraits/men/16.jpg", "Ayon"),
            HorizontalModel("https://randomuser.me/api/portraits/men/17.jpg", "Momin"),
            HorizontalModel("https://randomuser.me/api/portraits/men/18.jpg", "Sakib"),
            HorizontalModel("https://randomuser.me/api/portraits/men/19.jpg", "Naim"),
            HorizontalModel("https://randomuser.me/api/portraits/men/20.jpg", "Anik")
        )
    }

    private fun vItemLoad() {
        vItemList = listOf(
            VerticalModel("https://randomuser.me/api/portraits/men/31.jpg", "Araf", "01511111111"),
            VerticalModel("https://randomuser.me/api/portraits/men/32.jpg", "Nishat", "01522222222"),
            VerticalModel("https://randomuser.me/api/portraits/women/21.jpg", "Raisa", "01533333333"),
            VerticalModel("https://randomuser.me/api/portraits/men/33.jpg", "Sakib", "01544444444"),
            VerticalModel("https://randomuser.me/api/portraits/men/34.jpg", "Mahin", "01555555555"),
            VerticalModel("https://randomuser.me/api/portraits/women/22.jpg", "Rima", "01566666666"),
            VerticalModel("https://randomuser.me/api/portraits/men/35.jpg", "Tamim", "01577777777"),
            VerticalModel("https://randomuser.me/api/portraits/men/36.jpg", "Hasib", "01588888888"),
            VerticalModel("https://randomuser.me/api/portraits/women/23.jpg", "Nusrat", "01599999999"),
            VerticalModel("https://randomuser.me/api/portraits/men/37.jpg", "Mehedi", "01611111111"),
            VerticalModel("https://randomuser.me/api/portraits/men/38.jpg", "Rafi", "01622222222"),
            VerticalModel("https://randomuser.me/api/portraits/women/24.jpg", "Tumpa", "01633333333"),
            VerticalModel("https://randomuser.me/api/portraits/men/39.jpg", "Rakib", "01644444444"),
            VerticalModel("https://randomuser.me/api/portraits/men/40.jpg", "Zahid", "01655555555"),
            VerticalModel("https://randomuser.me/api/portraits/women/25.jpg", "Arpa", "01666666666"),
            VerticalModel("https://randomuser.me/api/portraits/men/41.jpg", "Munna", "01677777777"),
            VerticalModel("https://randomuser.me/api/portraits/men/42.jpg", "Nahid", "01688888888"),
            VerticalModel("https://randomuser.me/api/portraits/women/26.jpg", "Sumaiya", "01699999999"),
            VerticalModel("https://randomuser.me/api/portraits/men/43.jpg", "Sabbir", "01711111111"),
            VerticalModel("https://randomuser.me/api/portraits/men/44.jpg", "Nayeem", "01722222222"),
            VerticalModel("https://randomuser.me/api/portraits/women/27.jpg", "Joya", "01733333333"),
            VerticalModel("https://randomuser.me/api/portraits/men/45.jpg", "Emon", "01744444444"),
            VerticalModel("https://randomuser.me/api/portraits/men/46.jpg", "Faisal", "01755555555"),
            VerticalModel("https://randomuser.me/api/portraits/women/28.jpg", "Anika", "01766666666"),
            VerticalModel("https://randomuser.me/api/portraits/men/47.jpg", "Tanvir", "01777777777"),
            VerticalModel("https://randomuser.me/api/portraits/men/48.jpg", "Rahat", "01788888888"),
            VerticalModel("https://randomuser.me/api/portraits/women/29.jpg", "Sanji", "01799999999"),
            VerticalModel("https://randomuser.me/api/portraits/men/49.jpg", "Rony", "01811111111"),
            VerticalModel("https://randomuser.me/api/portraits/women/30.jpg", "Mahiya", "01822222222"),
            VerticalModel("https://randomuser.me/api/portraits/men/50.jpg", "Siam", "01833333333")
        )
    }
}