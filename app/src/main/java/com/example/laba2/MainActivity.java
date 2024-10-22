package com.example.laba2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        button1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Activity2.class)));
        button2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Activity3.class)));
        button3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Activity4.class)));
        button4.setOnClickListener(v -> finish());
    }
}