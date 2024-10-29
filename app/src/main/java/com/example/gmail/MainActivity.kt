package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dữ liệu mẫu
        val emailList = listOf(
            Email("Edurila.com", "12:34 PM", "$19 Only (First 10 spots)", "Are you looking to learn Web Designing...", "E"),
            Email("Chris Abad", "11:22 AM", "Help make Campaign Monitor better", "Let us know your thoughts!", "C"),
            Email("Tuto.com", "11:04 AM", "8h de formation gratuite", "Photoshop, SEO, Blender, CSS, WordPress...", "T"),
            Email("support", "10:26 AM", "Suivi de vos services", "SAS OVH - http://www.ovh.com", "S"),
            Email("Matt from Ionic", "9:46 AM", "The New Ionic Creator Is Here!", "Announcing the all-new Creator...", "M")
        )

        // Cài đặt RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}
