package com.example.as36;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class mytextview extends AppCompatTextView {
    public mytextview(Context context) {
        super(context);
    }

    public mytextview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public mytextview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
