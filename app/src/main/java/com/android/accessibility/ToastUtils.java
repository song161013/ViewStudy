package com.android.accessibility;

import android.widget.Toast;

public class ToastUtils {
    public static void show(String msg) {
        Toast.makeText(BaseApplication.getmInstance(), msg, Toast.LENGTH_SHORT).show();
    }
}
