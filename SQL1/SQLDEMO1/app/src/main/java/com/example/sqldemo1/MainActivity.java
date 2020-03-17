package com.example.sqldemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DBHelper db;
    ListView lv;
    ArrayList<Student> lst;
    MyAdapter adp;
    Button btnAdd;



    private void dislpay() {
        lst = db.getAllStudent();
        adp=new MyAdapter(this,lst);
        lv.setAdapter(adp);
        adp.notifyDataSetChanged();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lstview);
        btnAdd=findViewById(R.id.btnAdd);
        lst=new ArrayList<>();

        db=new DBHelper(this);
        dislpay();
//        Student obj=new Student("LEO","SURAT","leo@gmail.com");
//        db.insertData(obj);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Add Student");
                final View customDialog=getLayoutInflater().inflate(R.layout.customdialoglayout,null);
                builder.setView(customDialog);

                builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        EditText ename=customDialog.findViewById(R.id.id_name);
                        EditText ecity=customDialog.findViewById(R.id.id_city);
                        EditText eemail=customDialog.findViewById(R.id.id_email);
                        Student obj=new Student(ename.getText().toString(),ecity.getText().toString(),eemail.getText().toString());
                        db.insertData(obj);
                        dislpay();
                    }
                });

                AlertDialog dialog=builder.create();
                dialog.show();

            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Modify");
                final View customDialog=getLayoutInflater().inflate(R.layout.updatedeletelayout,null);
                builder.setView(customDialog);
                Student sobj=(Student) lv.getItemAtPosition(position);

                final TextView eid=customDialog.findViewById(R.id.id_sid);
                final EditText ename=customDialog.findViewById(R.id.id_name);
                final EditText ecity=customDialog.findViewById(R.id.id_city);
                final EditText eemail=customDialog.findViewById(R.id.id_email);

                eid.setText(String.valueOf(sobj.getStudentId()));
                ename.setText(sobj.getStudentName());
                ecity.setText(sobj.getStudentCity());
                eemail.setText(sobj.getStudentEmail());

                builder.setPositiveButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Student sobj=new Student();
                        sobj.setStudentName(ename.getText().toString());
                        sobj.setStudentCity(ecity.getText().toString());
                        sobj.setStudentEmail(eemail.getText().toString());
                        sobj.setStudentId(Integer.parseInt(eid.getText().toString()));
                        db.updateStudent(sobj);
                        dislpay();
                    }
                });

                builder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int id=Integer.parseInt(eid.getText().toString());
                        db.deleteStudent(id);
                        dislpay();
                    }
                });

                builder.setNeutralButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });


    }

//    private void dislpay() {
//        lst = db.getAllStudent();
//        adp=new MyAdapter(this,lst);
//        lv.setAdapter(adp);
//        adp.notifyDataSetChanged();
//    }
}
