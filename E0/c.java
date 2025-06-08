package e0;

import Y.m;
import android.os.Build.VERSION;
import d0.a;
import h0.i;

public final class c extends b {
    public static final String e;

    static {
        c.e = "WM-NetworkMeteredCtrlr";
    }

    @Override  // e0.b
    public final boolean a(i i0) {
        return i0.j.a == 5;
    }

    @Override  // e0.b
    public final boolean b(Object object0) {
        if(Build.VERSION.SDK_INT < 26) {
            m.d().a("WM-NetworkMeteredCtrlr", "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !((a)object0).a;
        }
        return !((a)object0).a || !((a)object0).c;
    }
}

