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
            VerticalModel("https://randomuser.me/api/portraits/men/1.jpg", "Koraish", "01711111111"),
            VerticalModel("https://randomuser.me/api/portraits/men/2.jpg", "Ashraf", "01722222222"),
            VerticalModel("https://randomuser.me/api/portraits/men/3.jpg", "Rohit", "01733333333"),
            VerticalModel("https://randomuser.me/api/portraits/men/4.jpg", "Sami", "01744444444"),
            VerticalModel("https://randomuser.me/api/portraits/men/5.jpg", "Jamil", "01755555555"),
            VerticalModel("https://randomuser.me/api/portraits/women/1.jpg", "Lina", "01766666666"),
            VerticalModel("https://randomuser.me/api/portraits/women/2.jpg", "Mina", "01777777777"),
            VerticalModel("https://randomuser.me/api/portraits/men/6.jpg", "Fahim", "01788888888"),
            VerticalModel("https://randomuser.me/api/portraits/men/7.jpg", "Shakil", "01799999999"),
            VerticalModel("https://randomuser.me/api/portraits/women/3.jpg", "Tania", "01800000000"),
            VerticalModel("https://randomuser.me/api/portraits/men/8.jpg", "Rashed", "01811111111"),
            VerticalModel("https://randomuser.me/api/portraits/women/4.jpg", "Sofia", "01822222222"),
            VerticalModel("https://randomuser.me/api/portraits/men/9.jpg", "Kamal", "01833333333"),
            VerticalModel("https://randomuser.me/api/portraits/men/10.jpg", "Imran", "01844444444"),
            VerticalModel("https://randomuser.me/api/portraits/men/11.jpg", "Shuvo", "01855555555"),
            VerticalModel("https://randomuser.me/api/portraits/men/12.jpg", "Rony", "01866666666"),
            VerticalModel("https://randomuser.me/api/portraits/men/13.jpg", "Sabbir", "01877777777"),
            VerticalModel("https://randomuser.me/api/portraits/men/14.jpg", "Tanvir", "01888888888"),
            VerticalModel("https://randomuser.me/api/portraits/women/5.jpg", "Nabila", "01899999999"),
            VerticalModel("https://randomuser.me/api/portraits/women/6.jpg", "Farah", "01900000001"),
            VerticalModel("https://randomuser.me/api/portraits/men/15.jpg", "Junaid", "01911111111"),
            VerticalModel("https://randomuser.me/api/portraits/men/16.jpg", "Rashid", "01922222222"),
            VerticalModel("https://randomuser.me/api/portraits/women/7.jpg", "Samira", "01933333333"),
            VerticalModel("https://randomuser.me/api/portraits/men/17.jpg", "Fahad", "01944444444"),
            VerticalModel("https://randomuser.me/api/portraits/men/18.jpg", "Tariq", "01955555555"),
            VerticalModel("https://randomuser.me/api/portraits/women/8.jpg", "Sadia", "01966666666"),
            VerticalModel("https://randomuser.me/api/portraits/men/19.jpg", "Arif", "01977777777"),
            VerticalModel("https://randomuser.me/api/portraits/men/20.jpg", "Nayeem", "01988888888"),
            VerticalModel("https://randomuser.me/api/portraits/women/9.jpg", "Rumana", "01999999999"),
            VerticalModel("https://randomuser.me/api/portraits/men/21.jpg", "Hridoy", "01712345678"),
            VerticalModel("https://randomuser.me/api/portraits/men/22.jpg", "Shahin", "01723456789"),
            VerticalModel("https://randomuser.me/api/portraits/women/10.jpg", "Rina", "01734567890"),
            VerticalModel("https://randomuser.me/api/portraits/men/23.jpg", "Bappy", "01745678901")
        )
    }
}