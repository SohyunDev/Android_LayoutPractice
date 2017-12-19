package com.example.sohyun_mac.layoutpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    Button btn_linear, btn_relative, btn_grid, btn_frame, btn_scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_linear = (Button)findViewById(R.id.btn_linear);
        btn_linear.setOnClickListener(this);
        btn_relative = (Button)findViewById(R.id.btn_relative);
        btn_relative.setOnClickListener(this);
        btn_grid = (Button)findViewById(R.id.btn_grid);
        btn_grid.setOnClickListener(this);
        btn_frame = (Button)findViewById(R.id.btn_frame);
        btn_frame.setOnClickListener(this);
        btn_scroll = (Button)findViewById(R.id.btn_scroll);
        btn_scroll.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_linear:
                intent = new Intent(MainActivity.this, LinearActivity.class);
                break;
            case R.id.btn_relative:
                intent = new Intent(MainActivity.this, RelativeActivity.class);
                break;
            case R.id.btn_grid:
                intent = new Intent(MainActivity.this, GridActivity.class);
                break;
            case R.id.btn_frame:
                intent = new Intent(MainActivity.this, FrameActivity.class);
                break;
            case R.id.btn_scroll:
                intent = new Intent(MainActivity.this, ScrollActivity.class);
                break;
        }
        startActivity(intent);
    }
}
