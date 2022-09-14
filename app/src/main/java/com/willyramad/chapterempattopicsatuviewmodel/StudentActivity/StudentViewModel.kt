package com.willyramad.chapterempattopicsatuviewmodel.StudentActivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.willyramad.chapterempattopicsatuviewmodel.R

class StudentViewModel : ViewModel() {

    val list = arrayListOf(
        DataStudent("agus", 1234567, R.drawable.dua),
        DataStudent("wwsw", 1234567, R.drawable.dua),
        DataStudent("wsa", 1234567, R.drawable.dua),
        DataStudent("cscc", 1234567, R.drawable.dua),
        DataStudent("csdc", 1234567, R.drawable.dua),
        DataStudent("cnsc", 1234567, R.drawable.dua),
        DataStudent("cm,x", 1234567, R.drawable.dua),
    )
    val Studentlist : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudent(){
        var murid = list
        Studentlist.value = murid
    }
}