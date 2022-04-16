package com.example.riyac.jsonarrayparsingex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView;
        textView=(TextView)findViewById(R.id.textView);
        String string="";
        String str="{\"Student\":[{\"name\":\"Riya\", \"id\":\"01\"}, {\"name\":\"Aditi\", \"id\":\"02\"}]}";
        try
        {
            JSONObject jsonObject=new JSONObject(str);
            JSONArray jsonArray=jsonObject.getJSONArray("Student");
            for (int i=0; i<jsonArray.length(); i++)
            {
                jsonObject=jsonArray.getJSONObject(i);
                String str1=jsonObject.getString("name");
                String str2=jsonObject.getString("id");
                string+=str1+" "+str2;
                textView.setText(string);
            }
            textView.setText(string);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

    }
}
