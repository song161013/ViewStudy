package com.fang360.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.view.R;

public class Fang360FloatWindowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fang_360_float_window);
        Button btn = findViewById(R.id.start_float_window);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fang360FloatWindowActivity.this, Fang360FloatWindowService.class);
                startService(intent);
                finish();
            }
        });
    }


}
