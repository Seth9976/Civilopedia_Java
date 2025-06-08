package f0;

import F0.g;
import Y.m;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.internal.ads.B0;
import k0.a;

public final class e extends d {
    public final ConnectivityManager g;
    public final B0 h;
    public final g i;
    public static final String j;

    static {
        e.j = "WM-NetworkStateTracker";
    }

    public e(Context context0, a a0) {
        super(context0, a0);
        this.g = (ConnectivityManager)this.b.getSystemService("connectivity");
        if(Build.VERSION.SDK_INT >= 24) {
            this.h = new B0(this, 2);
            return;
        }
        this.i = new g(this, 9);
    }

    @Override  // f0.d
    public final Object a() {
        return this.f();
    }

    @Override  // f0.d
    public final void d() {
        if(Build.VERSION.SDK_INT >= 24) {
            try {
                m.d().a("WM-NetworkStateTracker", "Registering network callback", new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.h);
            }
            catch(IllegalArgumentException | SecurityException illegalArgumentException0) {
                m.d().b("WM-NetworkStateTracker", "Received exception while registering network callback", new Throwable[]{illegalArgumentException0});
            }
            return;
        }
        m.d().a("WM-NetworkStateTracker", "Registering broadcast receiver", new Throwable[0]);
        IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.b.registerReceiver(this.i, intentFilter0);
    }

    @Override  // f0.d
    public final void e() {
        if(Build.VERSION.SDK_INT >= 24) {
            try {
                m.d().a("WM-NetworkStateTracker", "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
            }
            catch(IllegalArgumentException | SecurityException illegalArgumentException0) {
                m.d().b("WM-NetworkStateTracker", "Received exception while unregistering network callback", new Throwable[]{illegalArgumentException0});
            }
            return;
        }
        m.d().a("WM-NetworkStateTracker", "Unregistering broadcast receiver", new Throwable[0]);
        this.b.unregisterReceiver(this.i);
    }

    public final d0.a f() {
        boolean z2;
        ConnectivityManager connectivityManager0 = this.g;
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        boolean z = false;
        boolean z1 = networkInfo0 != null && networkInfo0.isConnected();
        if(Build.VERSION.SDK_INT >= 23) {
            try {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
                if(networkCapabilities0 == null || !networkCapabilities0.hasCapability(16)) {
                    goto label_14;
                }
                else {
                    goto label_12;
                }
            }
            catch(SecurityException securityException0) {
                m.d().b("WM-NetworkStateTracker", "Unable to validate active network", new Throwable[]{securityException0});
                z2 = false;
            }
            goto label_17;
        label_12:
            z2 = true;
        }
        else {
        label_14:
            z2 = false;
        }
    label_17:
        boolean z3 = connectivityManager0.isActiveNetworkMetered();
        if(networkInfo0 != null && !networkInfo0.isRoaming()) {
            z = true;
        }
        d0.a a0 = new d0.a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.a = z1;
        a0.b = z2;
        a0.c = z3;
        a0.d = z;
        return a0;
    }
}

