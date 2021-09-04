package com.fragment.demo_1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fragment.demo.R;

/**
 * @Description: 添加静态的fragmetn
 * @Author: sf
 * @CreateDate: 21-8-27 下午9:02
 * @Version: 1.0.0
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
