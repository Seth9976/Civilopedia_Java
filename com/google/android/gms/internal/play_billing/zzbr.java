package com.google.android.gms.internal.play_billing;

import java.util.function.BinaryOperator;

public final class zzbr implements BinaryOperator {
    @Override
    public final Object apply(Object object0, Object object1) {
        Object[] arr_object = ((zzcu)object1).a;
        int v = ((zzcu)object1).b;
        for(int v1 = 0; v1 < v; ++v1) {
            ((zzcu)object0).getClass();
            if(arr_object[v1] == null) {
                throw new NullPointerException("at index " + v1);
            }
        }
        ((zzcu)object0).b(v);
        System.arraycopy(arr_object, 0, ((zzcu)object0).a, ((zzcu)object0).b, v);
        ((zzcu)object0).b += v;
        return (zzcu)object0;
    }
}

