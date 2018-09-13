package com.example.itsupport.kotlinexamplecollabwithcloud

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val proses = (findViewById(R.id.Proses)) as Button
        val karyawanMenu = (findViewById(R.id.Karyawan)) as Button

        proses.setOnClickListener {
            val valJumlahPesanan = (findViewById(R.id.JumlahPesanan)) as EditText
            val jumlahPesananEt = Integer.parseInt(valJumlahPesanan.text.toString())
            val valHargaPesanan = (findViewById(R.id.HargaPesanan)) as EditText
            val hargaPesananEt = Integer.parseInt(valHargaPesanan.text.toString())

            val hasilnya =  hitungPesanan(jumlahPesananEt, hargaPesananEt)
            val tampilHasil = (findViewById(R.id.Pembayaran)) as TextView
            tampilHasil.setText(getString(R.string.hasil) + " " + hasilnya )
        }

        karyawanMenu.setOnClickListener{
            val intentKaryawan = Intent(this, KaryawanClass::class.java)

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
