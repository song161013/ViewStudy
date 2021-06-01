package com.event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class LinearlayoutEvent extends LinearLayout implements View.OnClickListener {

    public LinearlayoutEvent(Context context) {
        super(context);
    }

    public LinearlayoutEvent(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearlayoutEvent(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LinearlayoutEvent(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("AABBC", "viewGroup dispatchTouchEvent");

        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("AABBC", "viewGroup onTouchEvent");

        return true;

    }

    @Override
    public void onClick(View v) {

    }
}
