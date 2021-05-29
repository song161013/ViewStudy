package com.android.accessibility;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hjq.permissions.OnPermission;
import com.hjq.permissions.XXPermissions;
import com.hjq.xtoast.XToast;
import com.hjq.xtoast.draggable.MovingDraggable;
import com.hjq.xtoast.draggable.SpringDraggable;
import com.view.R;

import java.util.List;

public class AccessibilityActivity extends AppCompatActivity {


    private XToast toast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessibility);
    }

    public void StartExec(final View v) {
        test();
        if (true) return;
        if (toast != null && toast.isShow()) return;
        if (toast != null) toast.cancel();
        toast = new XToast(this);
        toast.setView(R.layout.toast_hint)
                .setAnimStyle(android.R.style.Animation_Translucent)
                .setImageDrawable(android.R.id.icon, R.drawable.vector_start)
//                .setText(android.R.id.message, "点我消失")
                // 设置成可拖拽的
                .setDraggable(new MovingDraggable())
                .setOnClickListener(R.id.ll_all, new XToast.OnClickListener<LinearLayout>() {

                    @Override
                    public void onClick(XToast toast, LinearLayout view) {
                    }
                })
                .show();
    }

    private void test() {
        final AppCompatActivity activity = AccessibilityActivity.this;

        if (!ExecAccessibilityService.isAccessibilitySettingsOn(activity.getApplicationContext())) {
            ToastUtils.show("请打开辅助功能");
            try {
                activity.startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
            } catch (Exception e) {
                activity.startActivity(new Intent(Settings.ACTION_SETTINGS));
                e.printStackTrace();
            }
            return;
        }
//
//        if (!OpenAccessibilitySettingHelper.isAccessibilitySettingsOn(AccessibilityActivity.this,
//                ExecAccessibilityService.class.getName())) {// 判断服务是否开启
//            OpenAccessibilitySettingHelper.jumpToSettingPage(AccessibilityActivity.this);// 跳转到开启页面
//            return;
//        } else {
//            Toast.makeText(AccessibilityActivity.this, "服务已开启", Toast.LENGTH_SHORT).show();
//        }


        XXPermissions.with(activity)
                .permission(com.hjq.permissions.Permission.SYSTEM_ALERT_WINDOW)
                .request(new OnPermission() {
                    @Override
                    public void hasPermission(List<String> granted, boolean isAll) {

//                        Util.startApp(activity.getApplicationContext(), "com.kuaishou.nebula");

//                        if (!OpenAccessibilitySettingHelper.isAccessibilitySettingsOn(AccessibilityActivity.this,
//                                ExecAccessibilityService.class.getName())) {// 判断服务是否开启
//                            OpenAccessibilitySettingHelper.jumpToSettingPage(AccessibilityActivity.this);// 跳转到开启页面
//                        } else {
//                            Toast.makeText(AccessibilityActivity.this, "服务已开启", Toast.LENGTH_SHORT).show();
//                        }

                        showFloatView(activity);
                    }

                    @Override
                    public void noPermission(List<String> denied, boolean quick) {
                        ToastUtils.show("请打开悬浮窗权限");
                    }

                });
    }

    private void showFloatView(AppCompatActivity activity) {
        XToast floatView = new XToast(activity.getApplication())
                .setView(R.layout.toast_hint)
                .setGravity(Gravity.START | Gravity.BOTTOM)
                .setXOffset(0)
                .setYOffset(500)
                // 设置指定的拖拽规则
                .setDraggable(new SpringDraggable())
                .setOnClickListener(R.id.ll_all, new XToast.OnClickListener<LinearLayout>() {

                    @Override
                    public void onClick(XToast<?> toast, LinearLayout view) {

                    }
                })
                .show();
        ExecAccessibilityService.mService.setFloatView(floatView);
    }
}

