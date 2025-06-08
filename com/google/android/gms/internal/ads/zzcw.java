package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

public final class zzcw {
    @Pure
    public static int zza(int v, int v1, int v2) {
        if(v < 0 || v >= v2) {
            throw new IndexOutOfBoundsException();
        }
        return v;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static Object zzb(Object object0) {
        if(object0 == null) {
            throw new IllegalStateException();
        }
        return object0;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String zzc(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    @Pure
    public static void zzd(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void zze(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(((String)object0));
        }
    }

    @Pure
    public static void zzf(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }
}

