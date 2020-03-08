package com.example.openapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPopup,btnCalculator,btnputextra,btnCheckboxCount,btnSharedPref,btnCustom,btntxtchangecolor,btnlstview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntxtchangecolor=findViewById(R.id.btntextcolorchange);
        btnPopup=findViewById(R.id.btnpopup);
        btnCalculator=findViewById(R.id.btncalculator);
        btnputextra=findViewById(R.id.btnputextra);
        btnCheckboxCount=findViewById(R.id.btnCheckbox);
        btnSharedPref=findViewById(R.id.btnSharedPref);
        btnCustom=findViewById(R.id.btnCustomDialog);
        btnlstview=findViewById(R.id.btnListView);


        btntxtchangecolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.changetextviewcolordemo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.menudemo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.calculatordemo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnputextra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.intentextrademo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });


        btnCheckboxCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.checkboxcountdemo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSharedPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.sharedpreferencedemo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.internaldemo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnlstview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.listviewcitydemo");
                if(i!=null)
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
