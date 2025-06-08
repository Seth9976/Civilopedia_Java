package f0;

import Y.m;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

public final class a extends c {
    public static final String i;

    static {
        a.i = "WM-BatteryChrgTracker";
    }

    @Override  // f0.d
    public final Object a() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = this.b.registerReceiver(null, intentFilter0);
        if(intent0 == null) {
            m.d().b("WM-BatteryChrgTracker", "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if(Build.VERSION.SDK_INT >= 23) {
            switch(intent0.getIntExtra("status", -1)) {
                case 2: 
                case 5: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return intent0.getIntExtra("plugged", 0) == 0 ? false : true;
    }

    @Override  // f0.c
    public final IntentFilter f() {
        IntentFilter intentFilter0 = new IntentFilter();
        if(Build.VERSION.SDK_INT >= 23) {
            intentFilter0.addAction("android.os.action.CHARGING");
            intentFilter0.addAction("android.os.action.DISCHARGING");
            return intentFilter0;
        }
        intentFilter0.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter0.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        return intentFilter0;
    }

    @Override  // f0.c
    public final void g(Intent intent0) {
        int v = 0;
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        m.d().a("WM-BatteryChrgTracker", "Received " + s, new Throwable[0]);
        switch(s) {
            case "android.intent.action.ACTION_POWER_CONNECTED": {
                v = 3;
                break;
            }
            case "android.intent.action.ACTION_POWER_DISCONNECTED": {
                break;
            }
            case "android.os.action.CHARGING": {
                v = 2;
                break;
            }
            case "android.os.action.DISCHARGING": {
                v = 1;
                break;
            }
            default: {
                v = -1;
            }
        }
        switch(v) {
            case 0: {
                this.c(Boolean.FALSE);
                return;
            }
            case 1: {
                this.c(Boolean.FALSE);
                return;
            }
            case 2: {
                this.c(Boolean.TRUE);
                return;
            }
            case 3: {
                this.c(Boolean.TRUE);
            }
        }
    }
}

