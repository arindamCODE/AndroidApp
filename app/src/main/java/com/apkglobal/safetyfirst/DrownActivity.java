package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrownActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1,btn_2,btn_3,btn_4,btn_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drown);

        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
       // btn_4=(Button)findViewById(R.id.btn_4);
        btn_5=(Button)findViewById(R.id.btn_5);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
       // btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.btn_1:
                Intent i = new Intent(DrownActivity.this, assesituActivity.class);
                startActivity(i);
                break;
            case R.id.btn_2:
                Intent i1 = new Intent(DrownActivity.this, adultActivity.class);
                startActivity(i1);
                break;
            case R.id.btn_3:
                Intent i2 = new Intent(DrownActivity.this, childActivity.class);
                startActivity(i2);
                break;
           /* case R.id.btn_4:
                Intent i4 = new Intent(DrownActivity.this, infantActivity.class);
                startActivity(i4);
                break;*/
            case R.id.btn_5:
                Intent i5 = new Intent(DrownActivity.this, EmergencyActivity.class);
                startActivity(i5);
                break;
        }
    }
}
