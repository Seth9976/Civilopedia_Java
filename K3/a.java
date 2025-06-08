package k3;

import A3.h;
import I2.b;
import J2.j;
import J2.l;
import X3.f;
import d3.A;
import d3.o;
import d3.u;
import d3.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import x2.i;
import x2.k;
import x2.r;
import x2.w;

public final class a implements c {
    public final o a;
    public final l b;
    public final h c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public a(o o0, b b0) {
        j.f(o0, "jClass");
        super();
        this.a = o0;
        this.b = (l)b0;
        h h0 = new h(this, 18);
        this.c = h0;
        f f0 = new f(i.L(o0.d()), true, h0);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        S3.b b1 = new S3.b(f0);
        while(b1.hasNext()) {
            Object object0 = b1.next();
            v3.f f1 = ((x)object0).c();
            ArrayList arrayList0 = linkedHashMap0.get(f1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(f1, arrayList0);
            }
            arrayList0.add(object0);
        }
        this.d = linkedHashMap0;
        f f2 = new f(i.L(this.a.b()), true, ((b)this.b));
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        S3.b b2 = new S3.b(f2);
        while(b2.hasNext()) {
            Object object1 = b2.next();
            linkedHashMap1.put(((u)object1).c(), object1);
        }
        this.e = linkedHashMap1;
        ArrayList arrayList1 = this.a.f();
        l l0 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: arrayList1) {
            if(((Boolean)((b)l0).b(object2)).booleanValue()) {
                arrayList2.add(object2);
            }
        }
        int v = w.q(k.E(arrayList2));
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v);
        for(Object object3: arrayList2) {
            linkedHashMap2.put(((A)object3).c(), object3);
        }
        this.f = linkedHashMap2;
    }

    @Override  // k3.c
    public final Collection a(v3.f f0) {
        j.f(f0, "name");
        List list0 = (List)this.d.get(f0);
        return list0 != null ? list0 : r.i;
    }

    @Override  // k3.c
    public final Set b() {
        f f0 = new f(i.L(this.a.d()), true, this.c);
        Set set0 = new LinkedHashSet();
        S3.b b0 = new S3.b(f0);
        while(b0.hasNext()) {
            set0.add(((x)b0.next()).c());
        }
        return set0;
    }

    @Override  // k3.c
    public final A c(v3.f f0) {
        j.f(f0, "name");
        return (A)this.f.get(f0);
    }

    @Override  // k3.c
    public final u d(v3.f f0) {
        j.f(f0, "name");
        return (u)this.e.get(f0);
    }

    @Override  // k3.c
    public final Set e() {
        return this.f.keySet();
    }

    @Override  // k3.c
    public final Set f() {
        f f0 = new f(i.L(this.a.b()), true, ((b)this.b));
        Set set0 = new LinkedHashSet();
        S3.b b0 = new S3.b(f0);
        while(b0.hasNext()) {
            set0.add(((u)b0.next()).c());
        }
        return set0;
    }
}

