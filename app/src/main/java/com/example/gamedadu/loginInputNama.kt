package com.example.gamedadu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_input_nama.*

class loginInputNama : AppCompatActivity() {

    private var jumlahPlayerLogin: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_input_nama)


        var jumlahPlayerLogin = intent.extras?.getString("JUMLAH_PLAYER")?.toString()
        if (jumlahPlayerLogin != null) {
            tvJumlahPlayer.text = "Jumlah player yang akan bermain adalah " + jumlahPlayerLogin
        }
        
        btnInputNama.setOnClickListener {

        }

    }
}

