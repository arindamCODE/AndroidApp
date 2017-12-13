package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoisonActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1,btn_2,btn_3,btn_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poison);

        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
        btn_main=(Button)findViewById(R.id.btn_main);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_main.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id=v.getId();

        switch (id)
        {
            case R.id.btn_1:
                Intent i1=new Intent(PoisonActivity.this,swalloActivity.class);
                startActivity(i1);
                break;
            case R.id.btn_2:
                Intent i2=new Intent(PoisonActivity.this,skinActivity.class);
                startActivity(i2);
                break;
            case R.id.btn_3:
                Intent i3=new Intent(PoisonActivity.this,drugsActivity.class);
                startActivity(i3);
                break;
            case R.id.btn_main:
                Intent main=new Intent(PoisonActivity.this,EmergencyActivity.class);
                startActivity(main);
                break;
        }
    }
}
