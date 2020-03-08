package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bmulti,bdiv,bminus,beq,bclear;
    boolean plusFlag,minusFlag,multiFlag,divFlag=false;
    int temp1,temp2;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        tv=findViewById(R.id.txtview);
        b1=findViewById(R.id.btnone);
        b2=findViewById(R.id.btntwo);
        b3=findViewById(R.id.btnthree);
        b4=findViewById(R.id.btnfour);
        b5=findViewById(R.id.btnfive);
        b6=findViewById(R.id.btnsix);
        b7=findViewById(R.id.btnseven);
        b8=findViewById(R.id.btneight);
        b9=findViewById(R.id.btnnine);
        b0=findViewById(R.id.btnzero);
        bplus=findViewById(R.id.btnplus);
        bminus=findViewById(R.id.btnminus);
        bmulti=findViewById(R.id.btnmulti);
        bdiv=findViewById(R.id.btndiv);
        beq=findViewById(R.id.btneq);
        bclear=findViewById(R.id.btnclear);


        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp2=Integer.parseInt(tv.getText().toString());
                if(plusFlag)
                {
                    result=String.valueOf(temp1+temp2);
                    Toast.makeText(MainActivity.this,"Addition is "+result,Toast.LENGTH_LONG).show();
                    tv.setText(result);
                    plusFlag=false;
                }


                else if(minusFlag)
                {
                    result=String.valueOf(temp1-temp2);
                    Toast.makeText(MainActivity.this,"Substraction is "+result,Toast.LENGTH_LONG).show();
                    tv.setText(result);
                    minusFlag=false;
                }

                else if(multiFlag)
                {
                    result=String.valueOf(temp1*temp2);
                    Toast.makeText(MainActivity.this,"Multiplication is "+result,Toast.LENGTH_LONG).show();
                    tv.setText(result);
                    multiFlag=false;
                }


                else if(divFlag)
                {

                    if(temp2==0)
                    {
                        Toast.makeText(MainActivity.this,"Divide by Zero Not allowed",Toast.LENGTH_LONG).show();
                        tv.setText("");
                        return;
                    }
                    else {
                        result=String.valueOf(temp1/temp2);
                        Toast.makeText(MainActivity.this, "Division is " + result, Toast.LENGTH_LONG).show();
                        tv.setText(result);
                        divFlag = false;
                    }
                }

            }
        });


        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1=Integer.parseInt(tv.getText().toString());
                tv.setText("");
                plusFlag=true;
            }
        });


        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1=Integer.parseInt(tv.getText().toString());
                tv.setText("");
                minusFlag=true;
            }
        });

        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1=Integer.parseInt(tv.getText().toString());
                tv.setText("");
                multiFlag=true;
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1=Integer.parseInt(tv.getText().toString());
                tv.setText("");
                divFlag=true;
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("1");
                }
                else{
                    tv.setText(tv.getText()+"1");
                }
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("2");
                }
                else{
                    tv.setText(tv.getText()+"2");
                }
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("3");
                }
                else{
                    tv.setText(tv.getText()+"3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("4");
                }
                else{
                    tv.setText(tv.getText()+"4");
                }
            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("5");
                }
                else{
                    tv.setText(tv.getText()+"5");
                }
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("6");
                }
                else{
                    tv.setText(tv.getText()+"6");
                }
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("7");
                }
                else{
                    tv.setText(tv.getText()+"7");
                }
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("8");
                }
                else{
                    tv.setText(tv.getText()+"8");
                }
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("9");
                }
                else{
                    tv.setText(tv.getText()+"9");
                }
            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="")
                {
                    tv.setText("");
                }
                else{
                    tv.setText(tv.getText()+"0");
                }
            }
        });
    }
}
