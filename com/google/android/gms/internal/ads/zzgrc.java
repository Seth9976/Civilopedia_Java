package com.google.android.gms.internal.ads;

public final class zzgrc {
    public static Object zza(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public static Object zzb(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        return object0;
    }

    public static void zzc(Object object0, Class class0) {
        if(object0 == null) {
            throw new IllegalStateException(class0.getCanonicalName() + " must be set");
        }
    }
}

