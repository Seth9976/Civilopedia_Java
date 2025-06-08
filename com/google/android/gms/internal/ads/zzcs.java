package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzcs {
    public final zzck a;
    public final int[] b;
    public final boolean[] c;
    public static final zzl zza;
    public final int zzb;

    static {
        zzcs.zza = zzcr.zza;
    }

    public zzcs(zzck zzck0, boolean z, int[] arr_v, boolean[] arr_z) {
        this.zzb = 1;
        this.a = zzck0;
        this.b = (int[])arr_v.clone();
        this.c = (boolean[])arr_z.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzcs.class == class0 && this.a.equals(((zzcs)object0).a) && Arrays.equals(this.b, ((zzcs)object0).b) && Arrays.equals(this.c, ((zzcs)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + (v + this.a.hashCode() * 961) * 0x1F;
    }

    public final int zza() {
        return this.a.zzd;
    }

    public final zzad zzb(int v) {
        return this.a.zzb(v);
    }

    public final boolean zzc() {
        boolean[] arr_z = this.c;
        for(int v = 0; v < arr_z.length; ++v) {
            if(arr_z[v]) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int v) {
        return this.c[v];
    }
}

