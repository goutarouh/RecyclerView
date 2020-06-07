package com.example.recycler.viewmodel

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recycler.data.Invitation

class MyViewModel: ViewModel() {
    val list = mutableListOf<MutableLiveData<Invitation>>()
    init {
        for (i in 0..15) {
            list.add(MutableLiveData<Invitation>().apply { value = Invitation(i, "タイトル${i}", "サブタイトル${i}") })
        }
    }

}