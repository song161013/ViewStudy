package com.android.accessibility;

import android.app.Application;

public class BaseApplication extends Application {
    private static BaseApplication mInstance;

    public static BaseApplication getmInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
