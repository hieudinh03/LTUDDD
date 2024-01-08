package com.example.myapplication.tuan42

import android.content.Context
import android.widget.AutoCompleteTextView
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyKotlinFn {
    var strJSON="";
    fun getJSONArrayObject(context: Context,textView: TextView)
    {
        val queue= Volley.newRequestQueue(context);
        val url="https://batdongsanabc.000webhostapp.com/thanglong/array_json_new.json";
        val request=JsonArrayRequest(url,
            Response.Listener{
            response ->
                  for(i in 0 until response.length()){
                      val person=response.getJSONObject(i);
                      val id=person.getString("id");
                      val name=person.getString("name");
                      val email=person.getString("email");
                      strJSON += "id: $id\n";
                      strJSON += "name: $name\n";
                      strJSON += "email: $email\n";

                  }
                textView.text=strJSON;
        }, Response.ErrorListener {
            error -> textView.text=error.message
        });
        queue.add(request);
    }
}