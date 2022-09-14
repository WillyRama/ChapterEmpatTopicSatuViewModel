package com.willyramad.chapterempattopicsatuviewmodel.StudentActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.chapterempattopicsatuviewmodel.R

class StudentActivity : AppCompatActivity() {
    lateinit var rvstudent : RecyclerView
    lateinit var adapterStudent  :StudentAdapter
    lateinit var studentVm : StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

    dataStudent()
        studentVm = ViewModelProvider(this).get(StudentViewModel::class.java)
        studentVm.getStudent()
        studentVm.Studentlist.observe(this, Observer {
            adapterStudent.setDataStudent(it as  ArrayList<DataStudent> /* = java.util.ArrayList<com.willyramad.chapterempattopicsatuviewmodel.StudentActivity.DataStudent> */)
        })

    }
    fun dataStudent(){
        rvstudent = findViewById(R.id.rvStudent)
        adapterStudent = StudentAdapter(ArrayList())

        rvstudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvstudent.adapter = adapterStudent

    }
}