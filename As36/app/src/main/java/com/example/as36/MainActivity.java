package com.example.as36;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_a1;
    private Button btn_a2;
    private Button btn_a3;
    private Button btn_a4;
    private Button btn_a5;
    private Button btn_a6;
    private Button btn_a7;
    private Button btn_a8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_a1 = (Button) findViewById(R.id.btn_a1);
        btn_a2 = (Button) findViewById(R.id.btn_a2);
        btn_a3 = (Button) findViewById(R.id.btn_a3);
        btn_a4 = (Button) findViewById(R.id.btn_a4);
        btn_a5 = (Button) findViewById(R.id.btn_a5);
        btn_a6 = (Button) findViewById(R.id.btn_a6);
        btn_a7 = (Button) findViewById(R.id.btn_a7);
        btn_a8 = (Button) findViewById(R.id.btn_a8);

        btn_a1.setOnClickListener(this);
        btn_a2.setOnClickListener(this);
        btn_a3.setOnClickListener(this);
        btn_a4.setOnClickListener(this);
        btn_a5.setOnClickListener(this);
        btn_a6.setOnClickListener(this);
        btn_a7.setOnClickListener(this);
        btn_a8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()) {
            case R.id.btn_a1:
                intent=new Intent(MainActivity.this,Main1Activity.class);
                break;
            case R.id.btn_a2:
                intent=new Intent(MainActivity.this,Main2Activity.class);
                break;
            case R.id.btn_a3:
                intent=new Intent(MainActivity.this,Main3Activity.class);
                break;
            case R.id.btn_a4:
                intent=new Intent(MainActivity.this,Main4Activity.class);
                break;
            case R.id.btn_a5:
                intent=new Intent(MainActivity.this,Main5Activity.class);
                break;
            case R.id.btn_a6:
                intent=new Intent(MainActivity.this,Main6Activity.class);
                break;
            case R.id.btn_a7:
                intent=new Intent(MainActivity.this,Main7Activity.class);
                break;
            case R.id.btn_a8:
                intent=new Intent(MainActivity.this,Main8Activity.class);
                break;
        }
        startActivity(intent);
    }
}
