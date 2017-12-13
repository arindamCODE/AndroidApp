package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StrokeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_recog,btn_res,btn_unres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stroke);
        btn_recog=(Button)findViewById(R.id.btn_recog);
        btn_res=(Button)findViewById(R.id.btn_res);
        btn_unres=(Button)findViewById(R.id.btn_unres);
        btn_recog.setOnClickListener(this);
        btn_res.setOnClickListener(this);
        btn_unres.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.btn_recog:
                Intent re=new Intent(StrokeActivity.this,Recognitionstroke.class);
                startActivity(re);
                break;
            case R.id.btn_res:
                Intent res=new Intent(StrokeActivity.this,Responsivestroke.class);
                startActivity(res);
                break;
            case R.id.btn_unres:
                Intent ure=new Intent(StrokeActivity.this,Unresponsive.class);
                startActivity(ure);
                break;
        }

    }
}
