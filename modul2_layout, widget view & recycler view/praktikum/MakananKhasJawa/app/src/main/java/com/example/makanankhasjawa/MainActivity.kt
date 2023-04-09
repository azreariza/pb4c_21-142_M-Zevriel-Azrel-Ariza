package com.example.makanankhasjawa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makananjawaList = listOf<Makanankhasjawa>(
            Makanankhasjawa(
                R.drawable.gudek,
                "Gudek",
                "Lorem ipsum lorem lorem ipsum"
            ),
            Makanankhasjawa(
                R.drawable.gethuk,
                "Gethuk",
                "lorem lorem ipsum"
            ),
            Makanankhasjawa(
                R.drawable.nasiliwet,
                "Nasi Liwet",
                "Lorem ipsum lorem lorem ipsum"
            ),
            Makanankhasjawa(
                R.drawable.lumpiasemarang,
                "Lumpia Semarang",
                "Lorem ipsum lorem lorem ipsum"
            ),
            Makanankhasjawa(
                R.drawable.osengmercon,
                "Oseng Mercon",
                "Lorem ipsum lorem lorem ipsum"
            ),
            Makanankhasjawa(
                R.drawable.pecelmadiun,
                "Pecel Madiun",
                "Lorem ipsum lorem lorem ipsum"
            ),
            Makanankhasjawa(
                R.drawable.rawon,
                "Rawon",
                "Lorem ipsum lorem lorem ipsum"
            ),
            Makanankhasjawa(
                R.drawable.rujakcingur,
                "Rujak Cingur",
                "Lorem ipsum lorem lorem ipsum"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.daftar_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MakanankhasjawaAdapter(this,makananjawaList){

        }
    }
}