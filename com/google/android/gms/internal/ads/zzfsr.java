package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class zzfsr implements Comparator {
    @Override
    public abstract int compare(Object arg1, Object arg2);

    public zzfsr zza() {
        return new B7(this);
    }

    public static zzfsr zzb(Comparator comparator0) {
        return comparator0 instanceof zzfsr ? ((zzfsr)comparator0) : new Z6(comparator0);
    }

    public static zzfsr zzc() {
        return s7.i;
    }
}

