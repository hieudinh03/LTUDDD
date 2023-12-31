package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan11MainActivity extends AppCompatActivity {
    //khai bao
    EditText txt1,txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main2);
        //anhxa
        txt1=findViewById(R.id.tuan1txt1);
        txt2=findViewById(R.id.tuan1txt2);
        btn1=findViewById(R.id.tuan1btn1);
        tv1=findViewById(R.id.tuan1tv1);
        //xu ly su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            TinhTong();
        });
    }
    //dinh nghia ham tinh tong
    private void TinhTong() {
        //Lay du lieu nhap vao tu edittxt1
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1); //chuuyen du lieu sang so
        //lay du lieu nhap vao tu edittxt2
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        //tinh tong
        float tong=so1+so2;
        //print
        tv1.setText(String.valueOf(tong));
    }
}