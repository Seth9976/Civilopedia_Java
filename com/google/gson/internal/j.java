package com.google.gson.internal;

import B.d;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

public final class j extends AbstractMap implements Serializable {
    public final Comparator i;
    public i j;
    public int k;
    public int l;
    public final i m;
    public h n;
    public h o;
    public static final d p;

    static {
        j.p = new d(6);
    }

    public j() {
        this.k = 0;
        this.l = 0;
        this.m = new i();
        this.i = j.p;
    }

    public final i b(Object object0, boolean z) {
        i i3;
        int v;
        i i0 = this.j;
        d d0 = j.p;
        Comparator comparator0 = this.i;
        if(i0 == null) {
            v = 0;
        }
        else {
            Comparable comparable0 = comparator0 == d0 ? ((Comparable)object0) : null;
            while(true) {
                v = comparable0 == null ? comparator0.compare(object0, i0.n) : comparable0.compareTo(i0.n);
                if(v == 0) {
                    return i0;
                }
                i i1 = v >= 0 ? i0.k : i0.j;
                if(i1 == null) {
                    break;
                }
                i0 = i1;
            }
        }
        if(!z) {
            return null;
        }
        i i2 = this.m;
        if(i0 == null) {
            if(comparator0 == d0 && !(object0 instanceof Comparable)) {
                throw new ClassCastException(object0.getClass().getName() + " is not Comparable");
            }
            i3 = new i(null, object0, i2, i2.m);
            this.j = i3;
        }
        else {
            i3 = new i(i0, object0, i2, i2.m);
            if(v < 0) {
                i0.j = i3;
            }
            else {
                i0.k = i3;
            }
            this.c(i0, true);
        }
        ++this.k;
        ++this.l;
        return i3;
    }

    public final void c(i i0, boolean z) {
    alab1:
        while(i0 != null) {
            i i1 = i0.j;
            i i2 = i0.k;
            int v = 0;
            int v1 = i1 == null ? 0 : i1.p;
            int v2 = i2 == null ? 0 : i2.p;
            int v3 = v1 - v2;
            if(v3 == -2) {
                i i3 = i2.j;
                int v4 = i2.k == null ? 0 : i2.k.p;
                if(i3 != null) {
                    v = i3.p;
                }
                if(v - v4 != -1 && (v - v4 != 0 || z)) {
                    this.g(i2);
                }
                this.f(i0);
                if(z) {
                    return;
                }
            }
            else {
                switch(v3) {
                    case 0: {
                        i0.p = v1 + 1;
                        if(z) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        i i4 = i1.j;
                        int v5 = i1.k == null ? 0 : i1.k.p;
                        if(i4 != null) {
                            v = i4.p;
                        }
                        if(v - v5 != 1 && (v - v5 != 0 || z)) {
                            this.f(i1);
                        }
                        this.g(i0);
                        if(z) {
                            return;
                        }
                        break;
                    }
                    default: {
                        i0.p = Math.max(v1, v2) + 1;
                        if(!z) {
                            break alab1;
                        }
                    }
                }
            }
            i0 = i0.i;
        }
    }

    @Override
    public final void clear() {
        this.j = null;
        this.k = 0;
        ++this.l;
        this.m.m = this.m;
        this.m.l = this.m;
    }

    @Override
    public final boolean containsKey(Object object0) {
        i i0 = null;
        if(object0 != null) {
            try {
                i0 = this.b(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return i0 != null;
    }

    public final void d(i i0, boolean z) {
        int v1;
        i i8;
        i i5;
        if(z) {
            i0.m.l = i0.l;
            i0.l.m = i0.m;
        }
        i i1 = i0.j;
        i i2 = i0.k;
        i i3 = i0.i;
        int v = 0;
        if(i1 != null && i2 != null) {
            if(i1.p > i2.p) {
                for(i i4 = i1.k; true; i4 = i1.k) {
                    i5 = i1;
                    i1 = i4;
                    if(i1 == null) {
                        break;
                    }
                }
            }
            else {
                for(i i6 = i2.j; true; i6 = i2.j) {
                    i i7 = i2;
                    i2 = i6;
                    i8 = i7;
                    if(i2 == null) {
                        break;
                    }
                }
                i5 = i8;
            }
            this.d(i5, false);
            i i9 = i0.j;
            if(i9 == null) {
                v1 = 0;
            }
            else {
                v1 = i9.p;
                i5.j = i9;
                i9.i = i5;
                i0.j = null;
            }
            i i10 = i0.k;
            if(i10 != null) {
                v = i10.p;
                i5.k = i10;
                i10.i = i5;
                i0.k = null;
            }
            i5.p = Math.max(v1, v) + 1;
            this.e(i0, i5);
            return;
        }
        if(i1 != null) {
            this.e(i0, i1);
            i0.j = null;
        }
        else if(i2 == null) {
            this.e(i0, null);
        }
        else {
            this.e(i0, i2);
            i0.k = null;
        }
        this.c(i3, false);
        --this.k;
        ++this.l;
    }

    public final void e(i i0, i i1) {
        i i2 = i0.i;
        i0.i = null;
        if(i1 != null) {
            i1.i = i2;
        }
        if(i2 != null) {
            if(i2.j == i0) {
                i2.j = i1;
                return;
            }
            i2.k = i1;
            return;
        }
        this.j = i1;
    }

    @Override
    public final Set entrySet() {
        h h0 = this.n;
        if(h0 == null) {
            h0 = new h(this, 0);
            this.n = h0;
        }
        return h0;
    }

    public final void f(i i0) {
        i i1 = i0.j;
        i i2 = i0.k;
        i i3 = i2.j;
        i i4 = i2.k;
        i0.k = i3;
        if(i3 != null) {
            i3.i = i0;
        }
        this.e(i0, i2);
        i2.j = i0;
        i0.i = i2;
        int v = 0;
        int v1 = Math.max((i1 == null ? 0 : i1.p), (i3 == null ? 0 : i3.p));
        i0.p = v1 + 1;
        if(i4 != null) {
            v = i4.p;
        }
        i2.p = Math.max(v1 + 1, v) + 1;
    }

    public final void g(i i0) {
        i i1 = i0.j;
        i i2 = i0.k;
        i i3 = i1.j;
        i i4 = i1.k;
        i0.j = i4;
        if(i4 != null) {
            i4.i = i0;
        }
        this.e(i0, i1);
        i1.k = i0;
        i0.i = i1;
        int v = 0;
        int v1 = Math.max((i2 == null ? 0 : i2.p), (i4 == null ? 0 : i4.p));
        i0.p = v1 + 1;
        if(i3 != null) {
            v = i3.p;
        }
        i1.p = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public final Object get(Object object0) {
        i i0 = null;
        if(object0 != null) {
            try {
                i0 = this.b(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return i0 == null ? null : i0.o;
    }

    @Override
    public final Set keySet() {
        h h0 = this.o;
        if(h0 == null) {
            h0 = new h(this, 1);
            this.o = h0;
        }
        return h0;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        i i0 = this.b(object0, true);
        Object object2 = i0.o;
        i0.o = object1;
        return object2;
    }

    @Override
    public final Object remove(Object object0) {
        i i0 = null;
        if(object0 != null) {
            try {
                i0 = this.b(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        if(i0 != null) {
            this.d(i0, true);
        }
        return i0 == null ? null : i0.o;
    }

    @Override
    public final int size() {
        return this.k;
    }
}

