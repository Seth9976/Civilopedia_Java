package f;

import B1.a;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import x2.w;

public final class p extends q {
    public final int c;
    public final t d;
    public final Object e;

    public p(t t0, a a0) {
        this.c = 1;
        this.d = t0;
        super(t0);
        this.e = a0;
    }

    public p(t t0, Context context0) {
        this.c = 0;
        this.d = t0;
        super(t0);
        this.e = (PowerManager)context0.getSystemService("power");
    }

    @Override  // f.q
    public final IntentFilter d() {
        if(this.c != 0) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.TIME_SET");
            intentFilter0.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter0.addAction("android.intent.action.TIME_TICK");
            return intentFilter0;
        }
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter1;
    }

    @Override  // f.q
    public final int e() {
        long v5;
        Location location2;
        Location location1;
        if(this.c != 0) {
            a a0 = (a)this.e;
            x x0 = (x)a0.l;
            if(x0.b > System.currentTimeMillis()) {
                return x0.a ? 2 : 1;
            }
            Context context0 = (Context)a0.j;
            int v = w.a(context0, "android.permission.ACCESS_COARSE_LOCATION");
            Location location0 = null;
            LocationManager locationManager0 = (LocationManager)a0.k;
            if(v == 0) {
                try {
                    if(locationManager0.isProviderEnabled("network")) {
                        location1 = locationManager0.getLastKnownLocation("network");
                    }
                    else {
                        goto label_17;
                    }
                }
                catch(Exception exception0) {
                    Log.d("TwilightManager", "Failed to get last known location", exception0);
                    location1 = null;
                }
                goto label_18;
            label_17:
                location1 = null;
            label_18:
                location2 = location1;
            }
            else {
                location2 = null;
            }
            if(w.a(context0, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                try {
                    if(locationManager0.isProviderEnabled("gps")) {
                        location0 = locationManager0.getLastKnownLocation("gps");
                    }
                }
                catch(Exception exception1) {
                    Log.d("TwilightManager", "Failed to get last known location", exception1);
                }
            }
            if(location0 == null || location2 == null) {
                if(location0 != null) {
                    location2 = location0;
                }
            }
            else if(location0.getTime() > location2.getTime()) {
                location2 = location0;
            }
            boolean z = false;
            if(location2 != null) {
                long v1 = System.currentTimeMillis();
                if(f.w.d == null) {
                    f.w.d = new f.w();  // 初始化器: Ljava/lang/Object;-><init>()V
                }
                f.w w0 = f.w.d;
                w0.a(v1 - 86400000L, location2.getLatitude(), location2.getLongitude());
                w0.a(v1, location2.getLatitude(), location2.getLongitude());
                if(w0.c == 1) {
                    z = true;
                }
                long v2 = w0.b;
                long v3 = w0.a;
                w0.a(v1 + 86400000L, location2.getLatitude(), location2.getLongitude());
                long v4 = w0.b;
                if(v2 == -1L || v3 == -1L) {
                    v5 = v1 + 43200000L;
                }
                else {
                    if(v1 <= v3) {
                        v4 = v1 <= v2 ? v2 : v3;
                    }
                    v5 = v4 + 60000L;
                }
                x0.a = z;
                x0.b = v5;
                return z ? 2 : 1;
            }
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int v6 = Calendar.getInstance().get(11);
            if(v6 < 6 || v6 >= 22) {
                z = true;
            }
            return z ? 2 : 1;
        }
        return ((PowerManager)this.e).isPowerSaveMode() ? 2 : 1;
    }

    @Override  // f.q
    public final void g() {
        if(this.c != 0) {
            this.d.i(true);
            return;
        }
        this.d.i(true);
    }
}

