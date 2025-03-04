package com.ss.android.ugc.aweme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取 Intent
        Intent intent = getIntent();
        String action = intent.getAction();
        String data = intent.getDataString();

        // 显示 Intent 数据
        TextView textView = findViewById(R.id.textView);
        if (data != null) {
            textView.setText("Intent Data: " + data);
        } else {
            textView.setText("No Intent Data Received");
        }
    }
}