package com.view.scroll;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.view.R;

public class ScrollViewActivity extends AppCompatActivity {

    Button mBtnScrollView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        mBtnScrollView = findViewById(R.id.btn_scroll_view);

    }
}
