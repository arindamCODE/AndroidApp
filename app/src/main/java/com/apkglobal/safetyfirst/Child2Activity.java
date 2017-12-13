package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Child2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn_prev,btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2);

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
                Intent i=new Intent(Child2Activity.this,Child3Activity.class);
                startActivity(i);
                break;
            case R.id.btn_prev:
                Intent i1=new Intent(Child2Activity.this,Child1Activity.class);
                startActivity(i1);
                break;
        }

    }
}
