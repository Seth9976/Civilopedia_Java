package androidx.lifecycle;

import B.b;
import J2.j;
import android.os.Looper;
import com.spears.civilopedia.SettingsActivity;
import f2.J;
import f2.L;
import i3.e;
import java.util.Map.Entry;
import m.a;
import n.c;
import n.d;
import n.f;

public abstract class t {
    public final Object a;
    public final f b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final b j;
    public static final Object k;

    static {
        t.k = new Object();
    }

    public t() {
        this.a = new Object();
        this.b = new f();
        this.c = 0;
        this.f = t.k;
        this.j = new b(this, 20);
        this.e = t.k;
        this.g = -1;
    }

    public t(q2.f f0) {
        this.a = new Object();
        this.b = new f();
        this.c = 0;
        this.f = t.k;
        this.j = new b(this, 20);
        this.e = f0;
        this.g = 0;
    }

    public static void a(String s) {
        a.o0().c.getClass();
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(e.f("Cannot invoke ", s, " on a background thread"));
        }
    }

    public final void b(s s0) {
        if(!s0.j) {
            return;
        }
        if(((LiveData.LifecycleBoundObserver)s0).m.k.b.compareTo(h.l) >= 0) {
            int v = this.g;
            if(s0.k >= v) {
                return;
            }
            s0.k = v;
            q2.f f0 = (q2.f)this.e;
            SettingsActivity.o(((SettingsActivity)s0.i.j));
            L l0 = ((SettingsActivity)s0.i.j).D;
            if(l0 != null) {
                l0.notifyDataSetChanged();
                return;
            }
            j.l("adapter");
            throw null;
        }
        s0.b(false);
    }

    public final void c(s s0) {
        if(this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if(s0 == null) {
                this.b.getClass();
                d d0 = new d(this.b);
                this.b.k.put(d0, Boolean.FALSE);
                while(d0.hasNext()) {
                    this.b(((s)((Map.Entry)d0.next()).getValue()));
                    if(this.i) {
                        break;
                    }
                }
            }
            else {
                this.b(s0);
                s0 = null;
            }
        }
        while(this.i);
        this.h = false;
    }

    public final void d(SettingsActivity settingsActivity0, J j0) {
        Object object0;
        t.a("observe");
        p p0 = settingsActivity0.k;
        if(p0.b == h.i) {
            return;
        }
        LiveData.LifecycleBoundObserver liveData$LifecycleBoundObserver0 = new LiveData.LifecycleBoundObserver(this, settingsActivity0, j0);
        f f0 = this.b;
        c c0 = f0.a(j0);
        if(c0 == null) {
            c c1 = new c(j0, liveData$LifecycleBoundObserver0);
            ++f0.l;
            c c2 = f0.j;
            if(c2 == null) {
                f0.i = c1;
            }
            else {
                c2.k = c1;
                c1.l = c2;
            }
            f0.j = c1;
            object0 = null;
        }
        else {
            object0 = c0.j;
        }
        if(((s)object0) != null && ((LiveData.LifecycleBoundObserver)(((s)object0))).m != settingsActivity0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if(((s)object0) != null) {
            return;
        }
        p0.a(liveData$LifecycleBoundObserver0);
    }

    public abstract void e(Object arg1);
}

