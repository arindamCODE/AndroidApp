package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeadActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_recognition,btn_warning,btn_treatment,btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);

        btn_recognition=(Button)findViewById(R.id.btn_recognition);
        btn_warning=(Button)findViewById(R.id.btn_warning);
        btn_1=(Button)findViewById(R.id.btn_1);
        btn_treatment=(Button)findViewById(R.id.btn_treatment);


        btn_recognition.setOnClickListener(this);
        btn_warning.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_treatment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id)
        {
            case R.id.btn_recognition:
                Intent recognition=new Intent(HeadActivity.this,Recognition1Activity.class) ;
                startActivity(recognition);
                break;
            case R.id.btn_warning:
                Intent asthma=new Intent(HeadActivity.this,Warning1Activity.class) ;
                startActivity(asthma);
                break;
            case R.id.btn_treatment:
                Intent i=new Intent(HeadActivity.this,TreatmentActivity.class) ;
                startActivity(i);
                break;
            case R.id.btn_1:
                Intent treatment=new Intent(HeadActivity.this,EmergencyActivity.class) ;
                startActivity(treatment);
                break;
        }
    }
}
