package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public class zzbjb {
    public final String a;
    public final Object b;
    public final int c;

    public zzbjb(int v, Object object0, String s) {
        this.a = s;
        this.b = object0;
        this.c = v;
    }

    public static zzbjb zza(String s, double f) {
        return new zzbjb(3, f, s);
    }

    public static zzbjb zzb(String s, long v) {
        return new zzbjb(2, v, s);
    }

    public static zzbjb zzc(String s, String s1) {
        return new zzbjb(4, s1, s);
    }

    public static zzbjb zzd(String s, boolean z) {
        return new zzbjb(1, Boolean.valueOf(z), s);
    }

    public final Object zze() {
        zzbke zzbke0 = (zzbke)zzbkg.a.get();
        Object object0 = this.b;
        if(zzbke0 == null) {
            AtomicReference atomicReference0 = zzbkg.b;
            if(((zzbkf)atomicReference0.get()) != null) {
                ((zzbkf)atomicReference0.get()).zza();
            }
            return object0;
        }
        String s = this.a;
        switch(this.c - 1) {
            case 0: {
                return zzbke0.zza(s, ((Boolean)object0).booleanValue());
            }
            case 1: {
                return zzbke0.zzc(s, ((long)(((Long)object0))));
            }
            case 2: {
                return zzbke0.zzb(s, ((double)(((Double)object0))));
            }
            default: {
                return zzbke0.zzd(s, ((String)object0));
            }
        }
    }
}

