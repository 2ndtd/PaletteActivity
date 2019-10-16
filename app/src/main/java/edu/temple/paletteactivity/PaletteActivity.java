package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.content.Intent;
import android.content.res.Resources;

/**
 * CIS 3515 - Lab 4 Palette Activity
 * Toi Do 10/9/2019
 */
public class PaletteActivity extends AppCompatActivity {
boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Palette Activity");

        final Intent canvasIntent = new Intent(PaletteActivity.this, CanvasActivity.class);
        Spinner spinner;

        spinner = findViewById(R.id.spinner);


        //Array of colors
        //final String[] colors = {"WHITE", "TEAL", "AQUA", "BLUE", "CYAN", "GREEN", "LIME", "YELLOW", "RED", "BLACK"};
        Resources res = getResources();
        final String[] colorsEn = res.getStringArray(R.array.colors_en);
        final String[] colorsEs = res.getStringArray(R.array.colors_es);

        String title = res.getString(R.string.palette_name);
        setTitle(title);

        ColorAdapter adapter = new ColorAdapter(this, colorsEn, colorsEs );
        spinner.setAdapter(adapter);

        //set the entire layout color to change from selected spinner color
        //final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                canvasIntent.putExtra("color", colorsEn[i]);

                if(flag)
                startActivity(canvasIntent);
                else
                    flag = true;
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
