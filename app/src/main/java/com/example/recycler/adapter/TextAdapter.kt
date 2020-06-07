package com.example.recycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.R
import com.example.recycler.databinding.ItemInvitationBinding
//import com.example.recycler.databinding.ItemInvitationBindingImpl
import com.example.recycler.handlres.MyHandlers
import com.example.recycler.viewmodel.MyViewModel


class TextAdapter(
    private val myViewModel: MyViewModel,
    private val parentLifecycleOwner: LifecycleOwner
): RecyclerView.Adapter<TextAdapter.ViewHolder>() {


    class ViewHolder(val binding: ItemInvitationBinding): RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        val binding = ItemInvitationBinding.inflate(inflater, parent, false)
        binding.handlers = MyHandlers()
        binding.myViewModel = myViewModel

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return myViewModel.list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.myViewModel = myViewModel
        holder.binding.position = position
        holder.binding.lifecycleOwner = parentLifecycleOwner
    }

}