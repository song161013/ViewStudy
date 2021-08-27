package com.view.base;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.view.R;

public class ViewBaseActivity extends AppCompatActivity {
    private TextView mTv;
    private final String TAG = "ViewBaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_base);

        mTv = findViewById(R.id.tv_text);
    }

    public void BtnStart(View view) {
        getXY();

        TranslateAnimation animation = new TranslateAnimation(Animation.ABSOLUTE, 10,
                Animation.ABSOLUTE, 500, Animation.ABSOLUTE, 0, Animation.ABSOLUTE,
                -80);
        animation.setDuration(1000);
        animation.setFillAfter(true);
        mTv.startAnimation(animation);

    }

    public void BtnStart1(View view) {
        getXY();
    }

    private void getXY() {
        int left = mTv.getLeft();
        int top = mTv.getTop();
        int right = mTv.getRight();
        int bottom = mTv.getBottom();

        Log.e(TAG, "left=" + left + ", Top=" + top + ", right=" + right + ",bottom=" + bottom);

        int x = (int) mTv.getX();
        int y = (int) mTv.getY();
        int tX = (int) mTv.getTranslationX();
        int tY = (int) mTv.getTranslationY();
        Log.e(TAG, "x=" + x + ", y=" + y + ", tX=" + tX + ",tY=" + tY);

    }
}
