package com.example.sharedpreferencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtname,txtphno,txtadd;
    RadioButton rdomale,rdofemale;
    String txtgen,txtcity;
    Button btnsubmit;
    Spinner citySpin;

//    String name,phno,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] cities=getResources().getStringArray(R.array.cities);
        txtname=findViewById(R.id.txtname);
        txtadd=findViewById(R.id.txtadd);
        txtphno=findViewById(R.id.txtphno);
        citySpin=findViewById(R.id.txtcity);
        rdomale=findViewById(R.id.rdomale);
        rdofemale=findViewById(R.id.rdofemale);
        btnsubmit=findViewById(R.id.btnSubmit);

        ArrayAdapter adp=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,cities);
        citySpin.setAdapter(adp);

        citySpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtcity=cities[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtcity="";
            }
        });

        rdomale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    txtgen="male";
                }
                else{
                    txtgen="";
                }
            }
        });

        rdofemale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    txtgen="female";
                }
                else{
                    txtgen="";
                }
            }
        });

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"name="+txtname+" gender="+txtgen+" city="+txtcity+" add="+txtadd+" phno="+txtphno,Toast.LENGTH_LONG).show();
                SharedPreferences sharedPref=getSharedPreferences("mySp",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPref.edit();
                editor.putString("studentName",txtname.getText().toString());
                editor.putString("studentGender",txtgen);
                editor.putString("studentAddress",txtadd.getText().toString());
                editor.putString("studentCity",txtcity);
                editor.putString("studentPhno",txtphno.getText().toString());
                editor.commit();

                Intent i=new Intent(MainActivity.this,student.class);
                startActivity(i);
            }
        });


    }
}
