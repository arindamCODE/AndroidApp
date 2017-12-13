package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class AsthmaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_recognition,btn_asthma,btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);

        btn_recognition=(Button)findViewById(R.id.btn_recognition);
        btn_asthma=(Button)findViewById(R.id.btn_asthma);
        btn_1=(Button)findViewById(R.id.btn_1);

        btn_asthma.setOnClickListener(this);
        btn_recognition.setOnClickListener(this);
        btn_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
         switch(id)
        {
            case R.id.btn_recognition:
            Intent recognition=new Intent(AsthmaActivity.this,RecognitionActivity.class) ;
            startActivity(recognition);
                break;
            case R.id.btn_asthma:
                Intent asthma=new Intent(AsthmaActivity.this,Asthma1Activity.class) ;
                startActivity(asthma);
                break;
            case R.id.btn_1:
                Intent i=new Intent(AsthmaActivity.this,EmergencyActivity.class) ;
                startActivity(i);
                break;
        }

    }
}
