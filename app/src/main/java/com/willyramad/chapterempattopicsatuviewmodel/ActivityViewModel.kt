package com.willyramad.chapterempattopicsatuviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class ActivityViewModel : AppCompatActivity() {
    lateinit var edpanjang : EditText
    lateinit var edlebar : EditText
    lateinit var edtinggi : EditText
    lateinit var btnHitung : Button
    lateinit var texthasil : TextView
    lateinit var viewmodel : ViewModelEx
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        edpanjang = findViewById(R.id.inputpanjang)
        edlebar = findViewById(R.id.inputlebar)
        edtinggi = findViewById(R.id.inputtinggi)
        btnHitung = findViewById(R.id.btnhitung)
        texthasil = findViewById(R.id.texthasil)

        viewmodel = ViewModelProvider(this).get(ViewModelEx::class.java)

        btnHitung.setOnClickListener {
            var pj = edpanjang.text.toString().toInt()
            var lb = edlebar.text.toString().toInt()
            var tg = edtinggi.text.toString().toInt()
            viewmodel.hitungData(pj,lb,tg)
            texthasil.text = viewmodel.hasil.toString()
            //hasildata
        }
    }
}