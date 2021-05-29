package com.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class FolderTextView extends AppCompatTextView {

    private Context mContext;
    private  int TOUCH_SCLOP;

    public FolderTextView(Context context) {
        this(context, null, 0);
    }

    public FolderTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FolderTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        TOUCH_SCLOP = ViewConfiguration.get(mContext).getScaledTouchSlop();
    }

}