package com.example.gamedadu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//TODO input masing masing nama dari playernya
//TODO generate dadu dan poin dari masing masing player ?
//TODO dadi ganjil +5, dadu genap -3 ?
//TODO display score dari masing masing player, dan player dengan score tertinggi menang

class MainActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnInput.setOnClickListener {

            val jumlahPlayer : String = etJumlahPlayer.text.toString()

            val intent = Intent(this, loginInputNama::class.java)
            val extras = Bundle()
            extras.putString("JUMLAH_PLAYER", jumlahPlayer)
            intent.putExtras(extras)
            startActivity(intent)
        }


    }
}