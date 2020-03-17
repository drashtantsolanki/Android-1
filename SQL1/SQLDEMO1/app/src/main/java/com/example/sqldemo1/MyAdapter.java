package com.example.sqldemo1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<Student> arrayList;

    public MyAdapter(Activity context, ArrayList<Student> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return this.arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.mycustomlistview,null);
        TextView txt_id=convertView.findViewById(R.id.txt_id);
        TextView txt_name=convertView.findViewById(R.id.txt_name);
        TextView txt_city=convertView.findViewById(R.id.txt_city);
        TextView txt_email=convertView.findViewById(R.id.txt_email);

        Student stud=arrayList.get(position);

        txt_id.setText(String.valueOf(stud.getStudentId()));
        txt_name.setText(stud.getStudentName());
        txt_city.setText(stud.getStudentCity());
        txt_email.setText(stud.getStudentEmail());

        return convertView;
    }
}
