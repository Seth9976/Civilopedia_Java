package androidx.work.impl;

import B1.a;
import E1.d;
import O.e;
import R.c;
import android.content.Context;
import f0.g;
import g1.n;
import java.util.HashMap;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile d l;
    public volatile n m;
    public volatile n n;
    public volatile a o;
    public volatile n p;
    public volatile g q;
    public volatile n r;
    public static final int s;

    @Override  // O.j
    public final e d() {
        return new e(this, new HashMap(0), new HashMap(0), new String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"});
    }

    @Override  // O.j
    public final c e(O.a a0) {
        B.c c0 = new B.c(16, a0, new T1.c(this, 16));
        Context context0 = a0.b;
        if(context0 == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        R.a a1 = new R.a(context0, a0.c, c0, false);
        return a0.a.f(a1);
    }

    @Override  // androidx.work.impl.WorkDatabase
    public final n i() {
        if(this.m != null) {
            return this.m;
        }
        synchronized(this) {
            if(this.m == null) {
                this.m = new n(this, 7);
            }
            return this.m;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public final n j() {
        if(this.r != null) {
            return this.r;
        }
        synchronized(this) {
            if(this.r == null) {
                this.r = new n(this, 8);
            }
            return this.r;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public final a k() {
        if(this.o != null) {
            return this.o;
        }
        synchronized(this) {
            if(this.o == null) {
                this.o = new a(this);
            }
            return this.o;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public final n l() {
        if(this.p != null) {
            return this.p;
        }
        synchronized(this) {
            if(this.p == null) {
                this.p = new n(this, 9);
            }
            return this.p;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public final g m() {
        if(this.q != null) {
            return this.q;
        }
        synchronized(this) {
            if(this.q == null) {
                this.q = new g(this);
            }
            return this.q;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public final d n() {
        if(this.l != null) {
            return this.l;
        }
        synchronized(this) {
            if(this.l == null) {
                this.l = new d(this);
            }
            return this.l;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public final n o() {
        if(this.n != null) {
            return this.n;
        }
        synchronized(this) {
            if(this.n == null) {
                this.n = new n(this, 10);
            }
            return this.n;
        }
    }
}

