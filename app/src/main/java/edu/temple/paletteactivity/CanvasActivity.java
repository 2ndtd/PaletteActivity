package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);


        int backColor = getIntent().getExtras().getInt("color");

        ConstraintLayout layout = findViewById(R.id.layout);
        layout.setBackgroundColor(backColor);
    }
}
