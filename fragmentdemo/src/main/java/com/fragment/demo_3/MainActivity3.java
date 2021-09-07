package com.fragment.demo_3;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.fragment.demo.R;
import com.fragment.demo_1.Fragment1;
import com.fragment.demo_1.Fragment2;

/**
 * @Description: 管理fragment
 * @Author: sf
 * @CreateDate: 21-8-30 下午6:34
 * @Version: 1.0.0
 */
public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);

        findViewById(R.id.btn_add_1).setOnClickListener(this);
        findViewById(R.id.btn_add_2).setOnClickListener(this);
        findViewById(R.id.btn_remove_fragment2).setOnClickListener(this);
        findViewById(R.id.btn_replace_fragment1).setOnClickListener(this);

        Toast.makeText(this, "修复bug", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add_1:
                Fragment1 fragment1 = new Fragment1();
                addFragment(fragment1, "fragment_1");
                break;
            case R.id.btn_add_2:
                Fragment2 fragment2 = new Fragment2();
                addFragment(fragment2, "fragment_2");
                break;
            case R.id.btn_remove_fragment2:
                removeFragment("fragment_2");
                break;
            case R.id.btn_replace_fragment1:
                replaceFragment();
                break;
        }
    }

    private void addFragment(Fragment fragment, String tag) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containt, fragment, tag);
        transaction.commit();
    }

    private void removeFragment(String tag) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment tagFragment = manager.findFragmentByTag(tag);
        if (tagFragment != null) {
            transaction.remove(tagFragment);
        }
        transaction.commit();
    }

    private void replaceFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment2 fragment2 = new Fragment2();
        transaction.replace(R.id.containt, fragment2);
    }
}
