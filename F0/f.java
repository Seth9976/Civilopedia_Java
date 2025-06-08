package f0;

import Y.m;
import android.content.Intent;
import android.content.IntentFilter;

public final class f extends c {
    public static final String i;

    static {
        f.i = "WM-StorageNotLowTracker";
    }

    @Override  // f0.d
    public final Object a() {
        IntentFilter intentFilter0 = this.f();
        Intent intent0 = this.b.registerReceiver(null, intentFilter0);
        if(intent0 != null && intent0.getAction() != null) {
            String s = intent0.getAction();
            s.getClass();
            if(!s.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return s.equals("android.intent.action.DEVICE_STORAGE_OK") ? true : null;
            }
            return false;
        }
        return true;
    }

    @Override  // f0.c
    public final IntentFilter f() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter0;
    }

    @Override  // f0.c
    public final void g(Intent intent0) {
        if(intent0.getAction() == null) {
            return;
        }
        m.d().a("WM-StorageNotLowTracker", A.f.h("Received ", intent0.getAction()), new Throwable[0]);
        String s = intent0.getAction();
        s.getClass();
        if(s.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            this.c(Boolean.FALSE);
        }
        else if(s.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            this.c(Boolean.TRUE);
        }
    }
}

