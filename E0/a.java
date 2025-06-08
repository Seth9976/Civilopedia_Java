package e0;

import android.os.Build.VERSION;
import f0.d;
import h0.i;

public final class a extends b {
    public final int e;

    public a(d d0, int v) {
        this.e = v;
        super(d0);
    }

    @Override  // e0.b
    public final boolean a(i i0) {
        switch(this.e) {
            case 0: {
                return i0.j.b;
            }
            case 1: {
                return i0.j.d;
            }
            case 2: {
                return i0.j.a == 2;
            }
            case 3: {
                int v = i0.j.a;
                return v == 3 || Build.VERSION.SDK_INT >= 30 && v == 6;
            }
            default: {
                return i0.j.e;
            }
        }
    }

    @Override  // e0.b
    public final boolean b(Object object0) {
        switch(this.e) {
            case 0: {
                return !((Boolean)object0).booleanValue();
            }
            case 1: {
                return !((Boolean)object0).booleanValue();
            }
            case 2: {
                return Build.VERSION.SDK_INT >= 26 ? !((d0.a)object0).a || !((d0.a)object0).b : true ^ ((d0.a)object0).a;
            }
            case 3: {
                return !((d0.a)object0).a || ((d0.a)object0).c;
            }
            default: {
                return !((Boolean)object0).booleanValue();
            }
        }
    }
}

