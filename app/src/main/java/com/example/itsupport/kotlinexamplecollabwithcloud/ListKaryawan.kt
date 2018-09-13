package com.example.itsupport.kotlinexamplecollabwithcloud

/**
 * Created by Cloudymous on 13/09/2018.
 */

class ListKaryawan {
    private var mNamaKaryawan: String? = null
    private var mNIPKaryawan: Int? = null
    private var mImageResource = NO_IMAGE_PROVIDED
    private val NO_IMAGE_PROVIDED = -1

    fun ListKaryawan(namaKaryawan: String, NIPKaryawan: Int) {
        mNamaKaryawan = namaKaryawan
        mNIPKaryawan = NIPKaryawan
    }

    fun ListKaryawan(namaKaryawan: String, NIPKaryawan: Int, imageResource: Int): ??? {
        mNamaKaryawan = namaKaryawan
        mNIPKaryawan = NIPKaryawan
        mImageResource = imageResource
    }

    fun setNamaKaryawan(namaKaryawan: String) {
        mNamaKaryawan = namaKaryawan
    }

    fun setNIPKaryawan(NIPKaryawan: Int){
        mNIPKaryawan = NIPKaryawan
    }

    fun setFotoKaryawan(imageResource: Int){
        mImageResource = imageResource
    }

    fun setImageResource(imageResource: Int) {
        mImageResource = imageResource
    }

    fun getNamaKaryawan(): String {
        return mNamaKaryawan
    }

    fun getNIPKaryawan(): Int {
        return mNIPKaryawan
    }

    fun getImageResource(): Int {
        return mImageResource
    }

    fun hasImage(): Boolean {
        return mImageResource != NO_IMAGE_PROVIDED
    }

}