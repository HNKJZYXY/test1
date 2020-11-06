package com.example.as36;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_a8_1;
    private Button btn_a8_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        initView();
    }

    private void initView() {
        tv_a8_1 = (TextView) findViewById(R.id.tv_a8_1);
        btn_a8_1 = (Button) findViewById(R.id.btn_a8_1);

        btn_a8_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_a8_1:
                tv_a8_1.setText("你还真按呀");
                break;
        }
    }
}
