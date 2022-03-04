package com.bahadiryildiz.snav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bahadiryildiz.snav.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.itemlayout.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var numberlist : ArrayList<List> = arrayListOf()
    private var adapter = Adapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        for (x in 1..100){
            numberlist.add(List(x))
        }


        binding.rvBookList.layoutManager = LinearLayoutManager(this)
        binding.rvBookList.adapter = adapter

        adapter.veriyiGetir(numberlist)

    }

}