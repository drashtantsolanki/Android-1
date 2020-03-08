package com.example.internaldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final Context context = this;

    Button b1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btnSave);
        e1 = (EditText)findViewById(R.id.fnText);
        e2 = (EditText)findViewById(R.id.lnText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.layoutcustom);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button
                TextView text = dialog.findViewById(R.id.dText);
                text.setText("Hello "+e1.getText().toString()+" "+e2.getText().toString());
                dialog.show();
            }
        });
    }
}
