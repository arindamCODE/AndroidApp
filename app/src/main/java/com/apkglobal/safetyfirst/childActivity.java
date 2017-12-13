package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class childActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_prev,btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        btn_prev=(Button)findViewById(R.id.btn_prev);
        btn_next=(Button)findViewById(R.id.btn_next);

        btn_prev.setOnClickListener(this);
        btn_next.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.btn_next:
                Intent i=new Intent(childActivity.this,Child1Activity.class);
                startActivity(i);
                break;
            case R.id.btn_prev:
                Intent i1=new Intent(childActivity.this,DrownActivity.class);
                startActivity(i1);
                break;
        }

    }
}
