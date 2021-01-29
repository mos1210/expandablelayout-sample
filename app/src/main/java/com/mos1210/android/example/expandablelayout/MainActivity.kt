package com.mos1210.android.example.expandablelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: MutableList<MyItem> = mutableListOf()
        for (i in 0..50) {
            list.add(MyItem(i, "title $i", "detail $i"))
        }
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val myAdapter = MyAdapter()
        recyclerView.adapter = myAdapter

        myAdapter.submitList(list)
    }

}