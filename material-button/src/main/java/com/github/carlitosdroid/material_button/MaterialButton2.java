package com.github.carlitosdroid.material_button;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;


/**
 * Created by carlosleonardocamilovargashuaman on 9/27/17.
 */

public class MaterialButton2 extends AppCompatButton {
    public MaterialButton2(Context context) {
        super(context);
    }

    public MaterialButton2(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPadding(10, 10, 10, 10);
        setText("I'm a white text");
        setTextColor(Color.WHITE);
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.red));
    }

    public MaterialButton2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setPadding(10, 10, 10, 10);
        setText("I'm a white text");
        setTextColor(Color.WHITE);
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.red));
    }
}
