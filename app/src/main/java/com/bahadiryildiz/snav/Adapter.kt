package com.bahadiryildiz.snav

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bahadiryildiz.snav.Adapter.ListHolder
import com.bahadiryildiz.snav.databinding.ItemlayoutBinding

class Adapter() : RecyclerView.Adapter<ListHolder>() {

    var numberlist : ArrayList<List> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val binding = ItemlayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListHolder(binding)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(numberlist[position])
    }

    override fun getItemCount(): Int {
        return numberlist.size
    }
    inner class ListHolder (private val binding: ItemlayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(list: List){
            binding.apply {
                tvNumber.text  = list.numberlistname.toString()
                if (list.numberlistname %2 == 1){
                    tvNumber.setBackgroundColor(Color.BLUE)
                }
                else if(list.numberlistname %2 == 0){
                    tvNumber.setBackgroundColor(Color.RED)
            }
            }
        }

    }

    fun veriyiGetir(booklistData : ArrayList<List>){
        numberlist.clear()
        numberlist.addAll(booklistData)
        notifyDataSetChanged()
    }


}
