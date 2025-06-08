package f;

import android.view.Window.Callback;
import k.D;
import k.l;
import k.w;
import l.T;

public final class m implements w, T {
    public final t i;

    public m(t t0) {
        this.i = t0;
        super();
    }

    @Override  // k.w
    public void a(l l0, boolean z) {
        s s0;
        l l1 = l0.k();
        boolean z1 = l1 != l0;
        if(z1) {
            l0 = l1;
        }
        t t0 = this.i;
        s[] arr_s = t0.M;
        int v1 = arr_s == null ? 0 : arr_s.length;
        for(int v = 0; true; ++v) {
            s0 = null;
            if(v >= v1) {
                break;
            }
            s s1 = arr_s[v];
            if(s1 != null && s1.h == l0) {
                s0 = s1;
                break;
            }
        }
        if(s0 != null) {
            if(z1) {
                t0.k(s0.a, s0, l1);
                t0.m(s0, true);
                return;
            }
            t0.m(s0, z);
        }
    }

    @Override  // k.w
    public boolean d(D d0) {
        if(d0 == null) {
            t t0 = this.i;
            if(t0.G) {
                Window.Callback window$Callback0 = t0.m.getCallback();
                if(window$Callback0 != null && !t0.R) {
                    window$Callback0.onMenuOpened(108, null);
                }
            }
        }
        return true;
    }
}

