package com.teamflybd.nougatbatchgithub;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.EditText;

public class DynamicView {
    Context ctx;

    public DynamicView(Context ctx) {
        this.ctx = ctx;
    }

    public EditText dEditText (Context context) {
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        final EditText editText = new EditText(context);
       // int id = 0;
       // editText.setId(id);
        editText.setTextColor(Color.rgb(100, 255, 132));
        editText.setMinEms(0); //It is the width of the letter M in a given English font size.
                                //So 2em is twice the width of the letter M in this given font.

        return editText;
    }
}
