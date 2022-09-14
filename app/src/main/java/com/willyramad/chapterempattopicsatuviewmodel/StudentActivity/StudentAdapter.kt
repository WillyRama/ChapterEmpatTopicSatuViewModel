package com.willyramad.chapterempattopicsatuviewmodel.StudentActivity

import android.telephony.CarrierConfigManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.chapterempattopicsatuviewmodel.R

class StudentAdapter(var listStudent : ArrayList<DataStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nama = itemView.findViewById<TextView>(R.id.NamaStudent)
        var nim = itemView.findViewById<TextView>(R.id.NimStudent)
        var img = itemView.findViewById<ImageView>(R.id.imgStudent)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
    holder.nama.text = listStudent[position].nama
    holder.nim.text = listStudent[position].nim.toString()
        holder.img.setImageResource(listStudent[position].img)
    }

    override fun getItemCount(): Int = listStudent.size

    fun setDataStudent(studentList : ArrayList<DataStudent>){
        this.listStudent = studentList
    }

}