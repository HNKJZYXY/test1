package com.example.as36;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_a7_1;
    private TextView tv_a7_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        initView();
    }

    private void initView() {
        btn_a7_1 = (Button) findViewById(R.id.btn_a7_1);

        btn_a7_1.setOnClickListener(this);
        tv_a7_1 = (TextView) findViewById(R.id.tv_a7_1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_a7_1:
                tv_a7_1.setText("傻逼，你还真的按？");
                break;
        }
    }
}
