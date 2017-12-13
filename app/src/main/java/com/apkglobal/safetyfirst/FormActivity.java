package com.apkglobal.safetyfirst;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity  {
    SQLiteDatabase sd;
    String sname,scontact,soapp,semail;
    TextView tname,toapp,temail,tmobile;
    Button btn_submit;
    EditText et_name,et_contact,et_email,et_oapp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        et_email=(EditText)findViewById(R.id.et_email);
        et_name=(EditText)findViewById(R.id.et_name);
        et_contact=(EditText)findViewById(R.id.et_contact);

        tname=(TextView)findViewById(R.id.tname);
        tmobile=(TextView)findViewById(R.id.tmobile);
        temail=(TextView)findViewById(R.id.temail);
        toapp=(TextView)findViewById(R.id.toapp);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        createtable();
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertintotable();

            }
        });

    }

    private void insertintotable() {
        sname=et_name.getText().toString();
        scontact=et_contact.getText().toString();
        semail=et_email.getText().toString();
        soapp=et_oapp.getText().toString();
        sd.execSQL("insert into form(name,mobile,email,oapp) values"+"('"+sname+"','"+scontact+"','"+semail+"','"+soapp+"');");
        Toast.makeText(getApplicationContext(),"Thank you for your feedback",Toast.LENGTH_LONG).show();

    }

    private void createtable() {
        sd=openOrCreateDatabase("dbname1", Context.MODE_PRIVATE,null);//"dbname is name of database Context is a class where mode is private and initially data is null
        // to create new table in database
        sd.execSQL("create table if not exists form"+"(name varchar(100),"+"contact varchar(100),"+"email varchar(100),"+"aboutapp varchar(1000));");
    }
}