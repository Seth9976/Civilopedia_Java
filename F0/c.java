package f0;

import F0.g;
import Y.m;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import k0.a;

public abstract class c extends d {
    public final g g;
    public static final String h;

    static {
        c.h = "WM-BrdcstRcvrCnstrntTrc";
    }

    public c(Context context0, a a0) {
        super(context0, a0);
        this.g = new g(this, 8);
    }

    @Override  // f0.d
    public final void d() {
        m m0 = m.d();
        String s = this.getClass().getSimpleName() + ": registering receiver";
        m0.a(c.h, s, new Throwable[0]);
        IntentFilter intentFilter0 = this.f();
        this.b.registerReceiver(this.g, intentFilter0);
    }

    @Override  // f0.d
    public final void e() {
        m m0 = m.d();
        String s = this.getClass().getSimpleName() + ": unregistering receiver";
        m0.a(c.h, s, new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent arg1);
}

