package com.google.android.gms.internal.base;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;

public class zau extends Handler {
    public zau() {
        Looper.getMainLooper();
    }

    public zau(Looper looper0) {
        super(looper0);
        Looper.getMainLooper();
    }

    public zau(Looper looper0, Handler.Callback handler$Callback0) {
        super(looper0, handler$Callback0);
        Looper.getMainLooper();
    }
}

