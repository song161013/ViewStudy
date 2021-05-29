package com.ipc;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.db.ProvinceDao;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private TextView mTvText;
    public static int SHARE_ID = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvText = findViewById(R.id.tv_txt);
        mTvText.setText("Main");

        SHARE_ID = 2;
        Log.e("AABBC", "Main id=" + SHARE_ID);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mTvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        ProvinceDao dao=new ProvinceDao(this);
        dao.getProvinceList();
    }
}
