package com.example.sqldemo1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper
{

    public static final String DB="studentDb";
    public static final String Table="tblStudent";
    public static final String col_1="student_id";
    public static final String col_2="student_name";
    public static final String col_3="student_city";
    public static final String col_4="student_email";

    public DBHelper(@Nullable Context context) {
        super(context, DB, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+Table+"(student_id INTEGER PRIMARY KEY AUTOINCREMENT, student_name TEXT, student_city TEXT, student_email TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Table);
    }

    public boolean insertData(Student student)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col_2,student.getStudentName());
        cv.put(col_3,student.getStudentCity());
        cv.put(col_4,student.getStudentEmail());
        long res=db.insert(Table,null,cv);
        if(res==-1)
        {
            return false;
        }
        else{
            return true;
        }
    }

    public void updateStudent(Student stud)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        String sid=String.valueOf(stud.getStudentId());
        cv.put(col_1,sid);
        cv.put(col_2,stud.getStudentName());
        cv.put(col_3,stud.getStudentCity());
        cv.put(col_4,stud.getStudentEmail());
        db.update(Table,cv,"student_id=?",new String[]{sid});
    }

    public void deleteStudent(int id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String sid=String.valueOf(id);
        db.delete(Table,"student_id=?",new String[] {sid});
    }



    public ArrayList<Student> getAllStudent()
    {
        ArrayList<Student> lst=new ArrayList<>();
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c=db.rawQuery("SELECT * FROM "+Table,null);
        while (c.moveToNext())
        {
            int id=c.getInt(0);
            String name=c.getString(1);
            String city=c.getString(2);
            String email=c.getString(3);
            Student student=new Student(id,name,city,email);
            lst.add(student);
        }
        return lst;
    }

}
