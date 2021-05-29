package com.ipc;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTvText = findViewById(R.id.tv_txt);
        mTvText.setText("thidr");

        Log.e("AABBC", "Third id=" + MainActivity.SHARE_ID);
    }
}
