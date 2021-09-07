package com.fragment.demo_3;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @Description: 管理fragment
 * @Author: sf
 * @CreateDate: 21-8-30 下午6:34
 * @Version: 1.0.0
 */
public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "修复bug", Toast.LENGTH_LONG).show();
    }
}
