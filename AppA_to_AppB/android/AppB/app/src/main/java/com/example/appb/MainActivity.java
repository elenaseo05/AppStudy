package com.example.appb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView receiveVal = findViewById(R.id.receiveVal);

        // 전달 받은 데이터 파싱 해서 사용 

    }
}