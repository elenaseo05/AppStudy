package com.example.appa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendBtn = findViewById(R.id.sendBtn); // 버튼
        EditText sendVal = findViewById(R.id.sendVal); // 전달할 텍스트

        // 이동할 앱의 scheme://host

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, sendVal.getText(), Toast.LENGTH_SHORT).show();

                String sc = "appb://appb_host?senddata"+ sendVal.getText(); // 이동할 앱의 scheme://host 앱스토어에 등록 되어 있는.

                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(sc));
                    Log.d(">>>>", "sendData" + sc);
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Exception", Toast.LENGTH_SHORT).show();
                    Log.d("startActivity", e + "");

                }

            }
        });



    }
}