package com.example.itsupport.kotlinexamplecollabwithcloud

import android.app.Activity
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

/**
 * Created by Cloudymous on 13/09/2018.
 */

class ListKaryawanAdapter(context: Activity, words: ArrayList<ListKaryawan>, private val mColorResorceId: Int) : ArrayAdapter<ListKaryawan>(context, 0, words) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                    R.layout.list_item, parent, false)
        }

        val currentPharases = getItem(position)

        val namaKaryawanTv = listItemView.findViewById(R.id.nama_karyawan_text_view) as TextView
        namaKaryawanTv.setText(currentPharases.getNamaKaryawan())

        val nipKaryawanTv = listItemView.findViewById(R.id.nip_karyawan_text_view) as TextView
        nipKaryawanTv.setText(currentPharases.getNIPKaryawan())

        val iconImageView = listItemView.findViewById(R.id.imageIcons) as ImageView

        if (currentPharases.hasImage()) {
            iconImageView.setImageResource(currentPharases.getImageResource())
            iconImageView.visibility = View.VISIBLE
        } else {
            iconImageView.visibility = View.GONE
        }

        val textContainer = listItemView.findViewById(R.id.text_container)
        val color = ContextCompat.getColor(context, mColorResorceId)
        textContainer.setBackgroundColor(color)

        return listItemView
    }

    companion object {

        private val LOG_TAG = ListKaryawanAdapter::class.java.simpleName
    }
}