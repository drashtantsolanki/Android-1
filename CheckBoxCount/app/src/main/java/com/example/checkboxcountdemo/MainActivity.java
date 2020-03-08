package com.example.checkboxcountdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkIronman,chkCaptain,chkThor;
    Button b1;
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkIronman=findViewById(R.id.chkIronman);
        chkCaptain=findViewById(R.id.chkCaptain);
        chkThor=findViewById(R.id.chkThor);
        b1=findViewById(R.id.btnok);

        chkIronman.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(MainActivity.this,"Ironman Checked",Toast.LENGTH_SHORT).show();
                    cnt++;

                }
                else {
                    Toast.makeText(MainActivity.this,"Ironman UnChecked",Toast.LENGTH_SHORT).show();
                    if(cnt>0)
                        cnt--;
                    else
                        cnt=0;

                }
            }
        });


        chkCaptain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(MainActivity.this,"Captain Checked",Toast.LENGTH_SHORT).show();
                    cnt++;

                }
                else {
                    Toast.makeText(MainActivity.this,"Captain UnChecked",Toast.LENGTH_SHORT).show();
                    if(cnt>0)
                        cnt--;
                    else
                        cnt=0;

                }
            }
        });


        chkThor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(MainActivity.this,"Thor Checked",Toast.LENGTH_SHORT).show();
                    cnt++;

                }
                else {
                    Toast.makeText(MainActivity.this,"Thor UnChecked",Toast.LENGTH_SHORT).show();
                    if(cnt>0)
                        cnt--;
                    else
                        cnt=0;

                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String fcnt=String.valueOf(cnt);
            Toast.makeText(MainActivity.this,fcnt,Toast.LENGTH_LONG).show();
            }
        });
    }




}
