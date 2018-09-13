package com.example.itsupport.kotlinexamplecollabwithcloud

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.ArrayList

class KaryawanClass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val karyawan = ArrayList<ListKaryawan>()

        karyawan.add(ListKaryawan("Direktur", 12345))
        karyawan.add(ListKaryawan("Anak Buah", 54321))
    }

}