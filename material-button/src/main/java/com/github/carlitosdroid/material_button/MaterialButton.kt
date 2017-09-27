package com.github.carlitosdroid.material_button

import android.content.Context
import android.graphics.Color
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.widget.Button

/**
 * Created by carlosleonardocamilovargashuaman on 9/27/17.
 */
class MaterialButton : Button {

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        setPadding(10, 10, 10, 10)
        setText("I'm a white text")
        setTextColor(Color.WHITE)
        setBackgroundColor(ContextCompat.getColor(context, R.color.red))
    }

    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : super(context, attributeSet, defStyleAttr) {
        setPadding(10, 10, 10, 10)
        setText("I'm a white text")
        setTextColor(Color.WHITE)
        setBackgroundColor(ContextCompat.getColor(context, R.color.red))
    }

}