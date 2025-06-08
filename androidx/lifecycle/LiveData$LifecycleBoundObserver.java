package androidx.lifecycle;

import com.spears.civilopedia.SettingsActivity;
import f2.J;

class LiveData.LifecycleBoundObserver extends s implements l {
    public final SettingsActivity m;
    public final t n;

    public LiveData.LifecycleBoundObserver(t t0, SettingsActivity settingsActivity0, J j0) {
        this.n = t0;
        super(t0, j0);
        this.m = settingsActivity0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        SettingsActivity settingsActivity0 = this.m;
        p p0 = settingsActivity0.k;
        h h0 = p0.b;
        if(h0 == h.i) {
            this.n.getClass();
            t.a("removeObserver");
            s s0 = (s)this.n.b.h(this.i);
            if(s0 != null) {
                ((LiveData.LifecycleBoundObserver)s0).m.k.b(((LiveData.LifecycleBoundObserver)s0));
                s0.b(false);
            }
            return;
        }
        h h1 = null;
        while(h1 != h0) {
            this.b(settingsActivity0.k.b.compareTo(h.l) >= 0);
            h1 = h0;
            h0 = p0.b;
        }
    }
}

