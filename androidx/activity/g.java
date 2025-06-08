package androidx.activity;

import B.b;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class g {
    public final b a;
    public final ArrayDeque b;

    public g(b b0) {
        this.b = new ArrayDeque();
        this.a = b0;
    }

    public final void a(n n0, m m0) {
        i i0 = n0.getLifecycle();
        if(((p)i0).b == h.i) {
            return;
        }
        OnBackPressedDispatcher.LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable0 = new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(this, i0, m0);
        m0.b.add(onBackPressedDispatcher$LifecycleOnBackPressedCancellable0);
    }

    public final void b() {
        Iterator iterator0 = this.b.descendingIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            m m0 = (m)object0;
            if(m0.a) {
                v v0 = m0.c;
                v0.J();
                if(v0.s.a) {
                    v0.a();
                    return;
                }
                v0.r.b();
                return;
            }
            if(false) {
                break;
            }
        }
        b b0 = this.a;
        if(b0 != null) {
            b0.run();
        }
    }
}

