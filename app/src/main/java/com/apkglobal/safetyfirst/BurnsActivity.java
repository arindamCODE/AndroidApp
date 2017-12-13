package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BurnsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_info,btn_chemical,btn_face,btn_general;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burns);
        btn_chemical=(Button)findViewById(R.id.btn_chemical);
        btn_info=(Button)findViewById(R.id.btn_info);
        btn_face=(Button)findViewById(R.id.btn_face);
        btn_general=(Button)findViewById(R.id.btn_general);
        btn_chemical.setOnClickListener(this);
        btn_face.setOnClickListener(this);
        btn_info.setOnClickListener(this);
        btn_general.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id)
        {
            case R.id.btn_info:
                Intent recognition=new Intent(BurnsActivity.this,InformationActivity.class) ;
                startActivity(recognition);
                break;
            case R.id.btn_general:
                Intent asthma=new Intent(BurnsActivity.this,GeneralActivity.class) ;
                startActivity(asthma);
                break;
            case R.id.btn_chemical:
            Intent chem=new Intent(BurnsActivity.this,ChemicalActivity.class) ;
            startActivity(chem);
            break;
            case R.id.btn_face:
                Intent face=new Intent(BurnsActivity.this,FaceActivity.class) ;
                startActivity(face);
                break;
        }
    }
}
