package com.willyramad.chapterempattopicsatuviewmodel.Berita

import android.content.Intent
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.willyramad.chapterempattopicsatuviewmodel.R

class BeritaViewModel : ViewModel() {
    val list = arrayListOf(
        DataBerita("Willy", "Dono dan Dini", "Bapak Susilo", "13-09-2022", R.drawable.bali_gapura_candi_bentar, "Gapura  candi bentar Bali"),
        DataBerita("Willy", "Dono dan Dini", "Ibu Siti","13-09-2022", R.drawable.banten_rumah_baduy, "Rumah baduy Banten"),
        DataBerita("Willy", "Dono dan Dini", "Ibu Yuni", "13-09-2022", R.drawable.bengkulu_rumah_bubungan_lima, " Rumah bubungan lima Bengkulu"),
        DataBerita("Willy", "Dono dan Dini", "Ibu Susi", "13-09-2022", R.drawable.diyogyakarta_rumah_joglo,"Rumag Joglo Jogja"),
        DataBerita("Willy", "Dono dan Dini", "Bapak Susilo", "13-09-2022", R.drawable.dki_jakarta_rumah_kebaya,"Rumah kebaya Jakarta"),
        DataBerita("Willy", "Dono dan Dini", "Ibu Putri", "13-09-2022", R.drawable.gorontalo_rumah_dulohupa,"Rumah dulohupa Gorontalo"),
        DataBerita("Willy", "Dono dan Dini", "Bapak Wawan", "13-09-2022", R.drawable.jambi_rumah_panggung, " Rumah panggung Jambi"),
        DataBerita("Willy", "Dono dan Dini", "Bapak Zul", "13-09-2022", R.drawable.jawa_barat_rumah_kasepuhan,"Rumah kasapuhan Jawa Barat"),
        DataBerita("Willy", "Dono dan Dini", "Bapak Darno", "13-09-2022", R.drawable.kalimantan_tengah_rumah_betang, "Rumah betang Kalteng"),
        DataBerita("Willy", "Dono dan Dini", "Ibu Aisyah", "13-09-2022", R.drawable.kalimantan_timur_rumah_lamin, " Rumah lmain Kaltim"),

    )
    val Beritalist : MutableLiveData<List<DataBerita>> = MutableLiveData()

    fun getBerita(){
        var berita = list
        Beritalist.value = berita
    }
}