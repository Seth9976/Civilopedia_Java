package androidx.lifecycle;

import android.os.Looper;
import com.spears.civilopedia.MyApplication_LifecycleAdapter;
import i3.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import n.a;
import n.b;
import n.c;
import n.d;

public final class p extends i {
    public final a a;
    public h b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final boolean h;

    public p(n n0) {
        new AtomicReference();
        a a0 = new a();  // 初始化器: Ln/f;-><init>()V
        a0.m = new HashMap();
        this.a = a0;
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = new ArrayList();
        this.c = new WeakReference(n0);
        this.b = h.j;
        this.h = true;
    }

    @Override  // androidx.lifecycle.i
    public final void a(m m0) {
        g g0;
        Object object0;
        l l0;
        ArrayList arrayList0 = this.g;
        this.d("addObserver");
        h h0 = this.b == h.i ? h.i : h.j;
        o o0 = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        boolean z = false;
        if(m0 instanceof l) {
            l0 = (l)m0;
        }
        else {
            Class class0 = m0.getClass();
            if(r.c(class0) == 2) {
                List list0 = (List)r.b.get(class0);
                if(list0.size() == 1) {
                    l0 = new SingleGeneratedAdapterObserver(r.a(((Constructor)list0.get(0)), m0));
                }
                else {
                    MyApplication_LifecycleAdapter[] arr_myApplication_LifecycleAdapter = new MyApplication_LifecycleAdapter[list0.size()];
                    for(int v = 0; v < list0.size(); ++v) {
                        arr_myApplication_LifecycleAdapter[v] = r.a(((Constructor)list0.get(v)), m0);
                    }
                    l0 = new CompositeGeneratedAdaptersObserver(arr_myApplication_LifecycleAdapter);
                }
            }
            else {
                l0 = new ReflectiveGenericLifecycleObserver(m0);
            }
        }
        o0.b = l0;
        o0.a = h0;
        a a0 = this.a;
        c c0 = a0.a(m0);
        if(c0 == null) {
            HashMap hashMap0 = a0.m;
            c c1 = new c(m0, o0);
            ++a0.l;
            c c2 = a0.j;
            if(c2 == null) {
                a0.i = c1;
            }
            else {
                c2.k = c1;
                c1.l = c2;
            }
            a0.j = c1;
            hashMap0.put(m0, c1);
            object0 = null;
        }
        else {
            object0 = c0.j;
        }
        if(((o)object0) != null) {
            return;
        }
        n n0 = (n)this.c.get();
        if(n0 == null) {
            return;
        }
        if(this.d != 0 || this.e) {
            z = true;
        }
        h h1 = this.c(m0);
        ++this.d;
        while(o0.a.compareTo(h1) < 0 && a0.m.containsKey(m0)) {
            arrayList0.add(o0.a);
            int v1 = o0.a.ordinal();
            switch(v1) {
                case 1: {
                    g0 = g.ON_CREATE;
                    break;
                }
                case 2: {
                    g0 = g.ON_START;
                    break;
                }
                default: {
                    g0 = v1 == 3 ? g.ON_RESUME : null;
                }
            }
            if(g0 == null) {
                throw new IllegalStateException("no event up from " + o0.a);
            }
            o0.a(n0, g0);
            arrayList0.remove(arrayList0.size() - 1);
            h1 = this.c(m0);
        }
        if(!z) {
            this.g();
        }
        --this.d;
    }

    @Override  // androidx.lifecycle.i
    public final void b(l l0) {
        this.d("removeObserver");
        this.a.h(l0);
    }

    public final h c(m m0) {
        HashMap hashMap0 = this.a.m;
        h h0 = null;
        c c0 = hashMap0.containsKey(m0) ? ((c)hashMap0.get(m0)).l : null;
        h h1 = c0 == null ? null : ((o)c0.j).a;
        ArrayList arrayList0 = this.g;
        if(!arrayList0.isEmpty()) {
            h0 = (h)arrayList0.get(arrayList0.size() - 1);
        }
        h h2 = this.b;
        if(h1 == null || h1.compareTo(h2) >= 0) {
            h1 = h2;
        }
        return h0 != null && h0.compareTo(h1) < 0 ? h0 : h1;
    }

    public final void d(String s) {
        if(this.h) {
            m.a.o0().c.getClass();
            if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(e.f("Method ", s, " must be called on the main thread"));
            }
        }
    }

    public final void e(g g0) {
        this.d("handleLifecycleEvent");
        this.f(g0.a());
    }

    public final void f(h h0) {
        if(this.b == h0) {
            return;
        }
        this.b = h0;
        if(!this.e && this.d == 0) {
            this.e = true;
            this.g();
            this.e = false;
            return;
        }
        this.f = true;
    }

    public final void g() {
        g g1;
        d d0;
        g g0;
        n n0 = (n)this.c.get();
        if(n0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    alab1:
        while(true) {
            while(true) {
                a a0 = this.a;
                if(a0.l == 0) {
                    break alab1;
                }
                h h0 = ((o)a0.i.j).a;
                h h1 = ((o)a0.j.j).a;
                if(h0 == h1 && this.b == h1) {
                    break alab1;
                }
                this.f = false;
                if(this.b.compareTo(h0) < 0) {
                    b b0 = new b(a0.j, a0.i, 1);
                    a0.k.put(b0, Boolean.FALSE);
                label_11:
                    while(b0.hasNext() && !this.f) {
                        Map.Entry map$Entry0 = (Map.Entry)b0.next();
                        o o0 = (o)map$Entry0.getValue();
                        while(o0.a.compareTo(this.b) > 0 && !this.f) {
                            Object object0 = map$Entry0.getKey();
                            if(a0.m.containsKey(object0)) {
                                int v = o0.a.ordinal();
                                switch(v) {
                                    case 2: {
                                        g0 = g.ON_DESTROY;
                                        break;
                                    }
                                    case 3: {
                                        g0 = g.ON_STOP;
                                        break;
                                    }
                                    default: {
                                        g0 = v == 4 ? g.ON_PAUSE : null;
                                    }
                                }
                                if(g0 == null) {
                                    throw new IllegalStateException("no event down from " + o0.a);
                                }
                                h h2 = g0.a();
                                this.g.add(h2);
                                o0.a(n0, g0);
                                this.g.remove(this.g.size() - 1);
                                continue;
                            }
                            continue label_11;
                        }
                    }
                }
                if(!this.f && a0.j != null && this.b.compareTo(((o)a0.j.j).a) > 0) {
                    d0 = new d(a0);
                    a0.k.put(d0, Boolean.FALSE);
                label_40:
                    if(!d0.hasNext() || this.f) {
                        continue;
                    }
                    break;
                }
            }
            Map.Entry map$Entry1 = (Map.Entry)d0.next();
            o o1 = (o)map$Entry1.getValue();
            while(true) {
                if(o1.a.compareTo(this.b) >= 0 || this.f) {
                    goto label_40;
                }
                Object object1 = map$Entry1.getKey();
                if(!a0.m.containsKey(object1)) {
                    goto label_40;
                }
                this.g.add(o1.a);
                switch(o1.a.ordinal()) {
                    case 1: {
                        g1 = g.ON_CREATE;
                        break;
                    }
                    case 2: {
                        g1 = g.ON_START;
                        break;
                    }
                    case 3: {
                        g1 = g.ON_RESUME;
                        break;
                    }
                    default: {
                        g1 = null;
                    }
                }
                if(g1 == null) {
                    break;
                }
                o1.a(n0, g1);
                this.g.remove(this.g.size() - 1);
            }
            throw new IllegalStateException("no event up from " + o1.a);
        }
        this.f = false;
    }
}

