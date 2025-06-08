package com.google.android.gms.internal.play_billing;

import java.util.function.BinaryOperator;

public final class zzbn implements BinaryOperator {
    @Override
    public final Object apply(Object object0, Object object1) {
        Object[] arr_object = ((zzck)object1).a;
        int v = ((zzck)object1).b;
        for(int v1 = 0; v1 < v; ++v1) {
            ((zzck)object0).getClass();
            if(arr_object[v1] == null) {
                throw new NullPointerException("at index " + v1);
            }
        }
        ((zzck)object0).b(v);
        System.arraycopy(arr_object, 0, ((zzck)object0).a, ((zzck)object0).b, v);
        ((zzck)object0).b += v;
        return (zzck)object0;
    }
}

