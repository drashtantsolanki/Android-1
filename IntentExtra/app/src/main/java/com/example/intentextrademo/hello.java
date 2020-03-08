package com.example.intentextrademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class hello extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        tv=findViewById(R.id.fullname);
        Intent i=getIntent();
        String fname=i.getStringExtra("fname");
        String lname=i.getStringExtra("lname");
        Toast.makeText(this,fname,Toast.LENGTH_LONG).show();
        if(fname!="" && lname!="")
        {
            tv.setText(fname+" "+lname);
        }
    }
}
