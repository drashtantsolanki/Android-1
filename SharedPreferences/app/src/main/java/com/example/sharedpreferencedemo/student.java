package com.example.sharedpreferencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class student extends AppCompatActivity {

    TextView tname,tgen,tadd,tcity,tphno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        tname=findViewById(R.id.sname);
        tgen=findViewById(R.id.sgender);
        tadd=findViewById(R.id.saddress);
        tcity=findViewById(R.id.scity);
        tphno=findViewById(R.id.sphno);

        SharedPreferences sharedPref=getSharedPreferences("mySp",MODE_PRIVATE);
//        String Sname=sharedPref.getString("studentName","");
        tname.setText(sharedPref.getString("studentName",""));
        tgen.setText(sharedPref.getString("studentGender",""));
        tadd.setText(sharedPref.getString("studentAddress",""));
        tcity.setText(sharedPref.getString("studentCity",""));
        tphno.setText(sharedPref.getString("studentPhno",""));
    }
}
