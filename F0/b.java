package f0;

import A.f;
import Y.m;
import android.content.Intent;
import android.content.IntentFilter;

public final class b extends c {
    public static final String i;

    static {
        b.i = "WM-BatteryNotLowTracker";
    }

    @Override  // f0.d
    public final Object a() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = this.b.registerReceiver(null, intentFilter0);
        boolean z = false;
        if(intent0 == null) {
            m.d().b("WM-BatteryNotLowTracker", "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if(intent0.getIntExtra("status", -1) == 1 || ((float)intent0.getIntExtra("level", -1)) / ((float)intent0.getIntExtra("scale", -1)) > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override  // f0.c
    public final IntentFilter f() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter0.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter0;
    }

    @Override  // f0.c
    public final void g(Intent intent0) {
        if(intent0.getAction() == null) {
            return;
        }
        m.d().a("WM-BatteryNotLowTracker", f.h("Received ", intent0.getAction()), new Throwable[0]);
        String s = intent0.getAction();
        s.getClass();
        if(s.equals("android.intent.action.BATTERY_OKAY")) {
            this.c(Boolean.TRUE);
        }
        else if(s.equals("android.intent.action.BATTERY_LOW")) {
            this.c(Boolean.FALSE);
        }
    }
}

