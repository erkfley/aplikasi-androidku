package com.example.aplikasiku

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var hitungan = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val teksHitungan: TextView = findViewById(R.id.teksHitungan)
        val tombolTambah: Button = findViewById(R.id.tombolTambah)
        val tombolReset: Button = findViewById(R.id.tombolReset)

        tombolTambah.setOnClickListener {
            hitungan++
            teksHitungan.text = hitungan.toString()
        }

        tombolReset.setOnClickListener {
            hitungan = 0
            teksHitungan.text = "0"
        }
    }
}
