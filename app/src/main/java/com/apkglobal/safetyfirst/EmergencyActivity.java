package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmergencyActivity extends AppCompatActivity implements View.OnClickListener {
   Button btn_burns,btn_drown,btn_bleed,btn_asthma,btn_head,btn_poison,btn_stroke,btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        btn_asthma=(Button)findViewById(R.id.btn_asthma);
        btn_burns=(Button)findViewById(R.id.btn_burns);
        btn_drown=(Button)findViewById(R.id.btn_drown);
        btn_head=(Button)findViewById(R.id.btn_head);
        btn_bleed=(Button)findViewById(R.id.btn_bleed);
        btn_poison=(Button)findViewById(R.id.btn_poison);
        btn_stroke=(Button)findViewById(R.id.btn_stroke);
        btn_exit=(Button)findViewById( R.id.btn_exit);

        btn_stroke.setOnClickListener(this);
        btn_asthma.setOnClickListener(this);
        btn_burns.setOnClickListener(this);
        btn_drown.setOnClickListener(this);
        btn_bleed.setOnClickListener(this);
        btn_head.setOnClickListener(this);
        btn_poison.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id=v.getId();

        switch (id)
        {
            case R.id.btn_asthma:
                Intent asthma=new Intent(EmergencyActivity.this,AsthmaActivity.class);
                startActivity(asthma);
                break;
            case R.id.btn_burns:
                Intent burns=new Intent(EmergencyActivity.this,BurnsActivity.class);
                startActivity(burns);
                break;
            case R.id.btn_drown:
                Intent drown=new Intent(EmergencyActivity.this,DrownActivity.class);
                startActivity(drown);
                break;
            case R.id.btn_poison:
                Intent poison=new Intent(EmergencyActivity.this,PoisonActivity.class);
                startActivity(poison);
                break;
            case R.id.btn_bleed:
                Intent bleed=new Intent(EmergencyActivity.this,BleedActivity.class);
                startActivity(bleed);
                break;
            case R.id.btn_stroke:
                Intent stroke=new Intent(EmergencyActivity.this,StrokeActivity.class);
                startActivity(stroke);
                break;
            case R.id.btn_head:
                Intent head=new Intent(EmergencyActivity.this,HeadActivity.class);
                startActivity(head);
                break;
            case R.id.btn_exit:
               appexit();
        }
    }

    private void appexit() {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
