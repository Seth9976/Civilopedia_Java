package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzayz {
    public static int zza(int v, int v1, int v2) {
        if(v < 0 || v >= v2) {
            throw new IndexOutOfBoundsException();
        }
        return 0;
    }

    public static String zzb(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    public static void zzc(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(((String)object0));
        }
    }

    public static void zze(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzf(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(((String)object0));
        }
    }
}

