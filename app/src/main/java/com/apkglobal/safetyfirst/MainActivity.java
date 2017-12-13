package com.apkglobal.safetyfirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_next=(Button)findViewById(R.id.btn_next);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Give your feedback", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent main=new Intent(getApplicationContext(),FormActivity.class);
                startActivity(main);


            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent main = new Intent(getApplicationContext(), EmergencyActivity.class);
                startActivity(main);

            }

        });
    }

}
