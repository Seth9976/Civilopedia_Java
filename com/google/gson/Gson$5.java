package com.google.gson;

import Y1.a;
import Y1.b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

class Gson.5 extends n {
    public final n a;

    public Gson.5(n n0) {
        this.a = n0;
    }

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        ArrayList arrayList0 = new ArrayList();
        a0.a();
        while(a0.i()) {
            arrayList0.add(((Number)this.a.b(a0)).longValue());
        }
        a0.e();
        int v = arrayList0.size();
        AtomicLongArray atomicLongArray0 = new AtomicLongArray(v);
        for(int v1 = 0; v1 < v; ++v1) {
            atomicLongArray0.set(v1, ((long)(((Long)arrayList0.get(v1)))));
        }
        return atomicLongArray0;
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.b();
        int v = ((AtomicLongArray)object0).length();
        for(int v1 = 0; v1 < v; ++v1) {
            Long long0 = ((AtomicLongArray)object0).get(v1);
            this.a.c(b0, long0);
        }
        b0.e();
    }
}

