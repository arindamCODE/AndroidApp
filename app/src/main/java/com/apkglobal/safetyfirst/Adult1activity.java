package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adult1activity extends AppCompatActivity implements View.OnClickListener {
    Button btn_prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult1activity);

        btn_prev=(Button)findViewById(R.id.btn_prev);


        btn_prev.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {

            case R.id.btn_prev:
                Intent i1=new Intent(Adult1activity.this,adultActivity.class);
                startActivity(i1);
                break;
        }
    }
}
