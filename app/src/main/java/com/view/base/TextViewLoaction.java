package com.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

import androidx.appcompat.widget.AppCompatTextView;

/**
 * view的位置参数
 */
public class TextViewLoaction extends AppCompatTextView {
    public TextViewLoaction(Context context) {
        super(context);
    }

    public TextViewLoaction(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewLoaction(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int touchSlop = viewConfiguration.getScaledTouchSlop();

    }




}
