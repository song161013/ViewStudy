package com.android.accessibility;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

import com.hjq.xtoast.XToast;

import java.util.List;

public class ExecAccessibilityService extends AccessibilityService {

    public static volatile ExecAccessibilityService mService;
    private XToast floatView;


    /**
     * 发生用户界面事件回调此事件
     *
     * @param event
     */
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        String packageName = event.getPackageName().toString();
        int eventType = event.getEventType();
        Log.i("AABBB", "packageName = " + packageName + " eventType = " + eventType);
    }

    /**
     * 中断可访问性反馈
     */
    @Override
    public void onInterrupt() {

    }
    public XToast getFloatView() {
        return floatView;
    }

    public void setFloatView(XToast floatView) {
        this.floatView = floatView;
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        mService = this;
    }

    public static boolean isAccessibilitySettingsOn(Context mContext) {
        AccessibilityManager am = (AccessibilityManager) mContext.getSystemService(Context.ACCESSIBILITY_SERVICE);
        if (am == null) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledServices = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK);
        for (AccessibilityServiceInfo enabledService : enabledServices) {
            ServiceInfo enabledServiceInfo = enabledService.getResolveInfo().serviceInfo;
            if (enabledServiceInfo.packageName.equals(mContext.getPackageName()) && enabledServiceInfo.name.equals(ExecAccessibilityService.class.getName()))
                return true;
        }

        return false;
    }
}
