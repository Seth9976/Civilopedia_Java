package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.internal.g;
import com.google.gson.internal.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import java.io.Serializable;
import java.util.Iterator;
import q.e;

class TypeAdapters.29 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        return TypeAdapters.29.d(a0);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        TypeAdapters.29.e(b0, ((j)object0));
    }

    public static j d(a a0) {
        switch(e.c(a0.v())) {
            case 0: {
                j j2 = new i();
                a0.a();
                while(a0.i()) {
                    j j3 = TypeAdapters.29.d(a0);
                    j2.i.add(j3);
                }
                a0.e();
                return j2;
            }
            case 2: {
                j j0 = new l();
                a0.b();
                while(a0.i()) {
                    String s = a0.p();
                    j j1 = TypeAdapters.29.d(a0);
                    j0.i.put(s, j1);
                }
                a0.f();
                return j0;
            }
            case 5: {
                return new m(a0.t());
            }
            case 6: {
                return new m(new f(a0.t()));
            }
            case 7: {
                return new m(Boolean.valueOf(a0.l()));
            }
            case 8: {
                a0.r();
                return k.i;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void e(b b0, j j0) {
        if(j0 != null && !(j0 instanceof k)) {
            if(j0 instanceof m) {
                Serializable serializable0 = ((m)j0).i;
                if(serializable0 instanceof Number) {
                    b0.n(((m)j0).a());
                    return;
                }
                if(serializable0 instanceof Boolean) {
                    b0.p(((Boolean)serializable0).booleanValue());
                    return;
                }
                b0.o(((m)j0).h());
                return;
            }
            if(j0 instanceof i) {
                b0.b();
                if(!(j0 instanceof i)) {
                    throw new IllegalStateException("Not a JSON Array: " + j0);
                }
                for(Object object0: ((i)j0).i) {
                    TypeAdapters.29.e(b0, ((j)object0));
                }
                b0.e();
                return;
            }
            if(!(j0 instanceof l)) {
                throw new IllegalArgumentException("Couldn\'t write " + j0.getClass());
            }
            b0.c();
            if(!(j0 instanceof l)) {
                throw new IllegalStateException("Not a JSON Object: " + j0);
            }
            Iterator iterator1 = ((h)((l)j0).i.entrySet()).iterator();
            while(((g)iterator1).hasNext()) {
                com.google.gson.internal.i i0 = ((g)iterator1).b();
                b0.g(((String)i0.getKey()));
                TypeAdapters.29.e(b0, ((j)i0.getValue()));
            }
            b0.f();
            return;
        }
        b0.j();
    }
}

