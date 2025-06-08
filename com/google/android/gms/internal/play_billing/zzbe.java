package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

public final class zzbe {
    public static String a(int v, int v1, String s) {
        if(v < 0) {
            return zzbf.zza("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return zzbf.zza("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
    }

    public static int zza(int v, int v1, String s) {
        String s1;
        if(v >= 0 && v < v1) {
            return v;
        }
        if(v >= 0) {
            if(v1 < 0) {
                throw new IllegalArgumentException("negative size: " + v1);
            }
            s1 = zzbf.zza("%s (%s) must be less than size (%s)", new Object[]{"index", v, v1});
        }
        else {
            s1 = zzbf.zza("%s (%s) must not be negative", new Object[]{"index", v});
        }
        throw new IndexOutOfBoundsException(s1);
    }

    public static int zzb(int v, int v1, String s) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(zzbe.a(v, v1, "index"));
        }
        return v;
    }

    public static Object zzc(@CheckForNull Object object0, @CheckForNull Object object1) {
        if(object0 == null) {
            throw new NullPointerException(((String)object1));
        }
        return object0;
    }

    public static void zzd(boolean z, @CheckForNull String s, @CheckForNull Object object0, @CheckForNull Object object1) {
        if(!z) {
            throw new IllegalArgumentException(zzbf.zza(s, new Object[]{object0, object1}));
        }
    }

    public static void zze(int v, int v1, int v2) {
        String s;
        if(v >= 0 && v1 >= v && v1 <= v2) {
            return;
        }
        if(v < 0 || v > v2) {
            s = zzbe.a(v, v2, "start index");
        }
        else if(v1 >= 0 && v1 <= v2) {
            s = zzbf.zza("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        else {
            s = zzbe.a(v1, v2, "end index");
        }
        throw new IndexOutOfBoundsException(s);
    }
}

