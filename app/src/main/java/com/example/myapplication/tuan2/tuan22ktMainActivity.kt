package com.example.myapplication.tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class tuan22ktMainActivity : AppCompatActivity() {
    var lv:ListView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22kt_main)
        lv=findViewById(R.id.ktlv);
        val arr= arrayOf("item1","item3","item4","item8","item11");

        val ad=ArrayAdapter(this,
            android.R.layout.simple_list_item_1,arr);
        lv!!.adapter=ad

    }
}