package com.willyramad.chapterempattopicsatuviewmodel.Berita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.chapterempattopicsatuviewmodel.R

class BeritaAdapter (var listBerita : ArrayList<DataBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {
    var onClick : ((DataBerita) -> Unit)? = null
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val namanarasumber = itemView.findViewById<TextView>(R.id.narasumber)
        val namaPenulis = itemView.findViewById<TextView>(R.id.NamaPenulis)
        val namaWartawan = itemView.findViewById<TextView>(R.id.Namawartawan)
        val tglBerita = itemView.findViewById<TextView>(R.id.tanggal)
        val card = itemView.findViewById<CardView>(R.id.cardBerita)
        val gambarBerita = itemView.findViewById<ImageView>(R.id.imgBerita)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return BeritaAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        holder.namanarasumber.text = listBerita[position].narasumber
        holder.namaPenulis.text = listBerita[position].penulis
        holder.namaWartawan.text = listBerita[position].wartawan
        holder.gambarBerita.setImageResource(listBerita[position].img)
        holder.tglBerita.text = listBerita[position].tanggal
        holder.card.setOnClickListener {
            onClick?.invoke(listBerita[position])
        }
    }

    override fun getItemCount(): Int = listBerita.size

    fun setDataBerita(beritaList : ArrayList<DataBerita>){
        this.listBerita = beritaList
    }
}