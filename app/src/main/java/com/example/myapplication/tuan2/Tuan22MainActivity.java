package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class Tuan22MainActivity extends AppCompatActivity {
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv1.findViewById(R.id.tuan22lv);
        //nguon du lieu
        String[] arr = new String[]{"Tuan1", "Tuan2", "Hieudinh", "Tuan4", "aaaaaa"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lv1.setAdapter(adapter);
    }
}