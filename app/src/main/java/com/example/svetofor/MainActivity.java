package com.example.svetofor;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
    }

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.rootLayout);


        Button redButton = findViewById(R.id.redButton);
        Button greenButton = findViewById(R.id.GreenButton);
        Button yellowButton = findViewById(R.id.YellowButton);

        onClick(redButton, R.color.red);
        onClick(greenButton, R.color.lightGreen);
        onClick(yellowButton, R.color.Yellow);
    }

    public void onClick(Button button, final int color) {
        button.setOnClickListener(view -> layout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, color)));
    }
}