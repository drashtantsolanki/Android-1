package com.example.menudemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btnhp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu p=new PopupMenu(MainActivity.this,v);
                p.getMenuInflater().inflate(R.menu.mymenu,p.getMenu());
                p.show();

                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.menu1:
                                Toast.makeText(MainActivity.this, "Shyam", Toast.LENGTH_LONG).show();
                                return true;


                            case R.id.menu2:
                                Toast.makeText(MainActivity.this, "Raju", Toast.LENGTH_LONG).show();
                                return true;

                            case R.id.menu3:
                                Toast.makeText(MainActivity.this, "Babubhaiya se direct babu...!!", Toast.LENGTH_LONG).show();
                                return true;
                            default:
                                return false;
                        }

                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
