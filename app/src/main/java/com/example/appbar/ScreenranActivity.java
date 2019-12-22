package com.example.appbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        int a = 0;
        int b = 100;
        int random_number = a + (int) (Math.random() * b);
        String str = "http://myfile.org/" + String.valueOf(random_number);
        TextView txt1 = findViewById(R.id.textView2);
        txt1.setText(str);

    }

    private void Init() {
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenranActivity.this, ScreenranActivity.class);
                startActivity(intent);

            }
        });
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                finish();
            }
        });

    }

}