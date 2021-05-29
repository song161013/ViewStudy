package com.android.accessibility;

import android.app.Activity;
import android.app.Application;

import com.hjq.xtoast.XToast;

public class MyXToast extends XToast {
    public MyXToast(Activity activity) {
        super(activity);
    }

    public MyXToast(Application application) {
        super(application);
    }

    @Override
    public XToast setOnTouchListener(OnTouchListener listener) {

        return super.setOnTouchListener(listener);
    }

    @Override
    public XToast setOnTouchListener(int id, OnTouchListener listener) {
        return super.setOnTouchListener(id, listener);
    }
}
