package com.willyramad.chapterempattopicsatuviewmodel.Berita

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.chapterempattopicsatuviewmodel.R

class BeritaActivity : AppCompatActivity() {
    lateinit var rvBerita : RecyclerView
    lateinit var adapterBerita  : BeritaAdapter
    lateinit var BeritaVm : BeritaViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        dataBerita()
        BeritaVm = ViewModelProvider(this).get(BeritaViewModel::class.java)

        BeritaVm.getBerita()
        BeritaVm.Beritalist.observe(this, Observer {
            adapterBerita.setDataBerita(it as  ArrayList<DataBerita> )
        })
        adapterBerita.onClick = {
            val pindah = Intent(this,DetailBeritaActivity::class.java)
            pindah.putExtra("detail",it)
            startActivity(pindah)
        }
    }
    fun dataBerita() {
        rvBerita = findViewById(R.id.rvBerita)
        adapterBerita = BeritaAdapter(ArrayList())

        rvBerita.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvBerita.adapter = adapterBerita

    }
}