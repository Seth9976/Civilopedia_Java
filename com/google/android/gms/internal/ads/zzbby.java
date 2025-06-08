package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzbby implements Comparator {
    public zzbby(zzbbz zzbbz0) {
    }

    @Override
    public final int compare(Object object0, Object object1) {
        float f = ((zzbbn)object0).b;
        float f1 = ((zzbbn)object1).b;
        if(f >= f1) {
            if(f > f1) {
                return 1;
            }
            float f2 = ((zzbbn)object0).a;
            float f3 = ((zzbbn)object1).a;
            if(f2 >= f3) {
                if(f2 > f3) {
                    return 1;
                }
                float f4 = (((zzbbn)object0).c - f2) * (((zzbbn)object0).d - f);
                float f5 = (((zzbbn)object1).c - f3) * (((zzbbn)object1).d - f1);
                if(f4 <= f5) {
                    return f4 < f5 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}

