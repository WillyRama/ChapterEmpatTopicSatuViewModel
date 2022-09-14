package com.willyramad.chapterempattopicsatuviewmodel.Berita

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.willyramad.chapterempattopicsatuviewmodel.R
import kotlinx.android.synthetic.main.activity_detail_berita.*


class DetailBeritaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)

        var ambildata = intent.getSerializableExtra("detail") as DataBerita
        isiBerita.text = ambildata.isi
        imgdetail.setImageResource((ambildata.img))
        detailnarasumber.text = ambildata.narasumber
        detailwartawan.text = ambildata.wartawan
        detailtanggal.text = ambildata.tanggal
        detailpenulis.text = ambildata.penulis
    }

}