package com.example.myapplication.tuan42

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import org.w3c.dom.Text

class Tuan413MainActivity : AppCompatActivity() {
    var btn:Button? = null;
    var tvKQ:TextView? = null;
    var context: Context = this;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan413_main)
        btn=findViewById(R.id.tuan413btn);
        tvKQ=findViewById(R.id.tuan413tv);
        val fn=VolleyKotlinFn();
        btn!!.setOnClickListener {
            fn.getJSONArrayObject(context,tvKQ!!)
        }
    }
}