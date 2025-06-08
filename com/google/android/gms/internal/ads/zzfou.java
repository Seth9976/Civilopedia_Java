package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

public final class zzfou {
    public static String a(int v, int v1, String s) {
        if(v < 0) {
            return zzfpi.zzb("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return zzfpi.zzb("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
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
            s1 = zzfpi.zzb("%s (%s) must be less than size (%s)", new Object[]{"index", v, v1});
        }
        else {
            s1 = zzfpi.zzb("%s (%s) must not be negative", new Object[]{"index", v});
        }
        throw new IndexOutOfBoundsException(s1);
    }

    public static int zzb(int v, int v1, String s) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(zzfou.a(v, v1, "index"));
        }
        return v;
    }

    public static Object zzc(@CheckForNull Object object0, @CheckForNull Object object1) {
        if(object0 == null) {
            throw new NullPointerException(((String)object1));
        }
        return object0;
    }

    public static Object zzd(@CheckForNull Object object0, String s, @CheckForNull Object object1) {
        if(object0 == null) {
            throw new NullPointerException(zzfpi.zzb(s, new Object[]{object1}));
        }
        return object0;
    }

    public static void zze(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, @CheckForNull Object object0) {
        if(!z) {
            throw new IllegalArgumentException(((String)object0));
        }
    }

    public static void zzg(int v, int v1, int v2) {
        String s;
        if(v >= 0 && v1 >= v && v1 <= v2) {
            return;
        }
        if(v < 0 || v > v2) {
            s = zzfou.a(v, v2, "start index");
        }
        else if(v1 >= 0 && v1 <= v2) {
            s = zzfpi.zzb("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        else {
            s = zzfou.a(v1, v2, "end index");
        }
        throw new IndexOutOfBoundsException(s);
    }

    public static void zzh(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z, @CheckForNull Object object0) {
        if(!z) {
            throw new IllegalStateException(((String)object0));
        }
    }
}

