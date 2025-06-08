package com.google.gson.internal.bind;

import X1.a;
import Y1.b;
import com.google.gson.h;
import com.google.gson.internal.j;
import com.google.gson.n;
import com.google.gson.o;
import java.util.ArrayList;
import q.e;

public final class ObjectTypeAdapter extends n {
    public final h a;
    public static final o b;

    static {
        ObjectTypeAdapter.b = new o() {
            @Override  // com.google.gson.o
            public final n a(h h0, a a0) {
                return a0.a == Object.class ? new ObjectTypeAdapter(h0) : null;
            }
        };
    }

    public ObjectTypeAdapter(h h0) {
        this.a = h0;
    }

    @Override  // com.google.gson.n
    public final Object b(Y1.a a0) {
        switch(e.c(a0.v())) {
            case 0: {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.i()) {
                    arrayList0.add(this.b(a0));
                }
                a0.e();
                return arrayList0;
            }
            case 2: {
                j j0 = new j();
                a0.b();
                while(a0.i()) {
                    j0.put(a0.p(), this.b(a0));
                }
                a0.f();
                return j0;
            }
            case 5: {
                return a0.t();
            }
            case 6: {
                return a0.m();
            }
            case 7: {
                return Boolean.valueOf(a0.l());
            }
            case 8: {
                a0.r();
                return null;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(object0 == null) {
            b0.j();
            return;
        }
        Class class0 = object0.getClass();
        this.a.getClass();
        a a0 = new a(class0);
        n n0 = this.a.c(a0);
        if(n0 instanceof ObjectTypeAdapter) {
            b0.c();
            b0.f();
            return;
        }
        n0.c(b0, object0);
    }
}

