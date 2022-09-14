package com.willyramad.chapterempattopicsatuviewmodel.Berita

import java.io.Serializable

data class DataBerita(val penulis : String, val wartawan : String, val narasumber : String, val tanggal : String, val img : Int, val isi : String) : Serializable
