package edu.temple.paletteactivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * CIS 3515 - Lab 4 Palette Activity
 * Toi Do 10/9/2019
 */
public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colors_en;
    String[] colors_es;

    public ColorAdapter(Context context, String[] colors, String[]colors_es){
        this.colors_en = colors;
        this.context = context;
        this.colors_es = colors_es;

    }

    @Override
    public int getCount() {
        return colors_en.length;
    }
    @Override
    public Object getItem(int i) {
        return colors_en[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        String colorValueEn = colors_en[position];
        String colorValueEs = colors_es[position];

        if (view == null) {
            textView = new TextView(context);
        } else {
            textView = (TextView) view;
        }

        textView.setText(colorValueEs); //display color name in its position
        textView.setBackgroundColor(Color.parseColor(colorValueEn)); //set the back ground color according to color position
        return textView;
    }

}

