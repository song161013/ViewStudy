package com.fragment.demo_2;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.fragment.demo.R;
import com.fragment.demo_1.Fragment1;
import com.fragment.demo_1.Fragment2;

/**
 * @Description: 添加动态的gragment
 * @Author: sf
 * @CreateDate: 21-8-30 下午5:30
 * @Version: 1.0.0
 */
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        findViewById(R.id.btn_fagment1).setOnClickListener(this);
        findViewById(R.id.btn_fagment2).setOnClickListener(this);
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransction = mFragmentManager.beginTransaction();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_fagment1:
//                Fragment1 fragment1 = new Fragment1();
//                mFragmentTransction.add(R.id.containt, fragment1);
//                mFragmentTransction.commit();
                FragmentManager manager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                Fragment1 fragment1 = new Fragment1();
                transaction1.add(R.id.containt, fragment1);
                transaction1.commit();

                break;
            case R.id.btn_fagment2:
//                Fragment2 fragment2 = new Fragment2();
//                mFragmentTransction.add(R.id.containt, fragment2);
//                mFragmentTransction.commit();

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                transaction.add(R.id.containt, fragment2);
                transaction.commit();

                break;
        }
    }
}
