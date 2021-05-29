package com.android.accessibility;

import android.content.Context;
import android.content.Intent;

public class Util {
    public static void startApp(Context context, String pkgName) {
        Intent lan = context.getPackageManager().getLaunchIntentForPackage(pkgName);
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setComponent(lan.getComponent());
        context.startActivity(intent);
    }
}
