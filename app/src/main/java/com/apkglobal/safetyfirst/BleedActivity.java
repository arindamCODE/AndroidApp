package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BleedActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_warning, btn_sbleed, btn_mbleed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleed);
        btn_mbleed = (Button) findViewById(R.id.btn_mbleed);
        btn_sbleed = (Button) findViewById(R.id.btn_sbleed);
        btn_warning = (Button) findViewById(R.id.btn_warning);
        btn_mbleed.setOnClickListener(this);
        btn_sbleed.setOnClickListener(this);
        btn_warning.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_mbleed:
                Intent mbleed = new Intent(BleedActivity.this, MinorbleedActivity.class);
                startActivity(mbleed);
                break;
            case R.id.btn_sbleed:
                Intent sbleed = new Intent(BleedActivity.this, SeverebleedActivity.class);
                startActivity(sbleed);
                break;
            case R.id.btn_warning:
                Intent warning = new Intent(BleedActivity.this, WarningActivity.class);
                startActivity(warning);
                break;

        }
    }
}
