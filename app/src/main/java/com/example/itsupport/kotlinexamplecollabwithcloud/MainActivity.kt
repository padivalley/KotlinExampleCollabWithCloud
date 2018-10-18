package com.example.itsupport.kotlinexamplecollabwithcloud

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Proses.setOnClickListener {
            val jumlahPesananEt = Integer.parseInt(JumlahPesanan.text.toString())
            val hargaPesananEt = Integer.parseInt(HargaPesanan.text.toString())

            val hasilnya =  hitungPesanan(jumlahPesananEt, hargaPesananEt)
            Pembayaran.setText(hasilnya)
        }

        Karyawan.setOnClickListener{
            val intentKaryawan = Intent(this, TampilanMenu::class.java)

            if (intentKaryawan.resolveActivity(packageManager) != null) {
                startActivity(intentKaryawan)
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!")
            }
        }
    }

    fun hitungPesanan(jumlahPesanan: Int, harga: Int): Int {
        val hasil = jumlahPesanan * harga
        return hasil
    }
}
