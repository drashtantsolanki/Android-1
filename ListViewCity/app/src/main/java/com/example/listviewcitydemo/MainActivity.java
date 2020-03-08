package com.example.listviewcitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] city={"Wakanda","Newyok","Sokovia","Siberia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lst);
        ArrayAdapter<String> adp=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,city);
        lv.setAdapter(adp);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object obj=lv.getItemAtPosition(position);
                String str=(String)obj;
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
