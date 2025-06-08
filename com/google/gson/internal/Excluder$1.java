package com.google.gson.internal;

import X1.a;
import Y1.b;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import java.util.List;

class Excluder.1 extends n {
    public n a;
    public final boolean b;
    public final boolean c;
    public final h d;
    public final a e;
    public final Excluder f;

    public Excluder.1(Excluder excluder0, boolean z, boolean z1, h h0, a a0) {
        this.f = excluder0;
        this.b = z;
        this.c = z1;
        this.d = h0;
        this.e = a0;
    }

    @Override  // com.google.gson.n
    public final Object b(Y1.a a0) {
        if(this.b) {
            a0.A();
            return null;
        }
        n n0 = this.a;
        if(n0 == null) {
            a a1 = this.e;
            h h0 = this.d;
            List list0 = h0.e;
            Excluder excluder0 = this.f;
            if(!list0.contains(excluder0)) {
                excluder0 = h0.d;
            }
            boolean z = false;
            for(Object object0: list0) {
                o o0 = (o)object0;
                if(!z) {
                    if(o0 != excluder0) {
                        continue;
                    }
                    z = true;
                    continue;
                }
                n n1 = o0.a(h0, a1);
                if(n1 == null) {
                    continue;
                }
                this.a = n1;
                return n1.b(a0);
            }
            throw new IllegalArgumentException("GSON cannot serialize " + a1);
        }
        return n0.b(a0);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(this.c) {
            b0.j();
            return;
        }
        n n0 = this.a;
        if(n0 == null) {
            a a0 = this.e;
            h h0 = this.d;
            List list0 = h0.e;
            Excluder excluder0 = this.f;
            if(!list0.contains(excluder0)) {
                excluder0 = h0.d;
            }
            boolean z = false;
            for(Object object1: list0) {
                o o0 = (o)object1;
                if(!z) {
                    if(o0 != excluder0) {
                        continue;
                    }
                    z = true;
                    continue;
                }
                n n1 = o0.a(h0, a0);
                if(n1 == null) {
                    continue;
                }
                this.a = n1;
                n0 = n1;
                n0.c(b0, object0);
                return;
            }
            throw new IllegalArgumentException("GSON cannot serialize " + a0);
        }
        n0.c(b0, object0);
    }
}

