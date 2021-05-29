package com.ipc;

import android.app.Application;
import android.util.Log;

import com.ipc.utils.MyUtils;

public class BaseApplication extends Application {

    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        int pid = android.os.Process.myPid();
        String processName = MyUtils.getProcessName(getApplicationContext(),
                pid);
        Log.d(TAG, "application start, process name:" + processName);
    }
}
