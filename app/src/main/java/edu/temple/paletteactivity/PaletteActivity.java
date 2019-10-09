package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.content.Intent;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent canvasIntent = new Intent(getApplicationContext(), CanvasActivity.class);
        Spinner spinner;

        spinner = findViewById(R.id.spinner);

        //Array of colors
        final String[] colors = {"WHITE", "TEAL", "AQUA", "BLUE", "CYAN", "GREEN", "LIME", "YELLOW", "RED", "BLACK"};

        ColorAdapter adapter = new ColorAdapter(this, colors);
        spinner.setAdapter(adapter);

        //set the entire layout color to change from selected spinner color
        //final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                canvasIntent.putExtra("color", colors[i]);
                startActivity(canvasIntent);
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
