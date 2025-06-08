package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

class TypeAdapters.10 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        ArrayList arrayList0 = new ArrayList();
        a0.a();
        while(a0.i()) {
            try {
                arrayList0.add(a0.n());
            }
            catch(NumberFormatException numberFormatException0) {
                throw new JsonSyntaxException(numberFormatException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
        }
        a0.e();
        int v = arrayList0.size();
        AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(v);
        for(int v1 = 0; v1 < v; ++v1) {
            atomicIntegerArray0.set(v1, ((int)(((Integer)arrayList0.get(v1)))));
        }
        return atomicIntegerArray0;
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.b();
        int v = ((AtomicIntegerArray)object0).length();
        for(int v1 = 0; v1 < v; ++v1) {
            b0.m(((long)((AtomicIntegerArray)object0).get(v1)));
        }
        b0.e();
    }
}

