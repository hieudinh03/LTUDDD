package com.example.myapplication.tuan4;

import android.content.Context;
import android.view.PixelCopy;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tuan41VolleyFn {
    String strJSON="";
    public void getJsonArrayOfObject(Context context, TextView textview){
        RequestQueue queue = Volley.newRequestQueue(context);
        String url="https://batdongsanabc.000webhostapp.com/thanglong/array_json_new.json";
        //goi request
        JsonArrayRequest request=new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for(int i=0;i<response.length();i++){
                            try {
                                JSONObject person=response.getJSONObject(i);
                                String id=person.getString("id");
                                String name=person.getString("name");
                                String email=person.getString("email");
                                strJSON +="Id: "+id+"\n";
                                strJSON +="name: "+name+"\n";
                                strJSON +="email: "+email+"\n";

                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            textview.setText(strJSON);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textview.setText(error.getMessage());
            }
        });
        //thuc thi request
        queue.add(request);

    }
}
