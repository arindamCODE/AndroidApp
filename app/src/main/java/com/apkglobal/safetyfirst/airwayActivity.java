package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class airwayActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_next,btn_prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airway);

        btn_next=(Button)findViewById(R.id.btn_next);
        btn_prev=(Button)findViewById(R.id.btn_prev);

        btn_next.setOnClickListener(this);
        btn_prev.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.btn_next:
                Intent i=new Intent(airwayActivity.this,circulationActivity.class);
                startActivity(i);
                break;
            case R.id.btn_prev:
                Intent i1=new Intent(airwayActivity.this,responseActivity.class);
                startActivity(i1);
                break;
        }
    }
}
