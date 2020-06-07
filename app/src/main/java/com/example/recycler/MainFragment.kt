package com.example.recycler

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.adapter.TextAdapter
import com.example.recycler.databinding.FragmentMainBinding
import com.example.recycler.viewmodel.MyViewModel

class MainFragment: Fragment() {

    lateinit var myViewModel: MyViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater, container, false)

        myViewModel = ViewModelProvider(this).get(MyViewModel().javaClass)
        //binding.myViewModel = myViewModel
        //binding.lifecycleOwner = this


        val recycler = binding.recycler
        recycler.layoutManager = LinearLayoutManager(inflater.context, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = TextAdapter(myViewModel, this)

        
        return binding.root
    }
}