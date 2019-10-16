package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;

/**
 * CIS 3515 - Lab 4 Palette Activity
 * Toi Do 10/9/2019
 */
public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Resources res = getResources();
        String title = res.getString(R.string.canvas_name);
        setTitle(title);
        String backColor = getIntent().getStringExtra("color");

        ConstraintLayout layout = findViewById(R.id.layout);
        layout.setBackgroundColor(Color.parseColor(backColor));
    }
}
