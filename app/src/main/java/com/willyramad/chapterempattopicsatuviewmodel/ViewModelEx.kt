package com.willyramad.chapterempattopicsatuviewmodel

import androidx.lifecycle.ViewModel

class ViewModelEx : ViewModel(){

    var hasil = 0
    fun hitungData (panjang :  Int, lebar : Int, tinggi : Int){
        hasil = panjang * lebar * tinggi
    }
}