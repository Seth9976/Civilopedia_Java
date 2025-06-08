package com.google.android.gms.internal.ads;

import A.f;
import java.util.Arrays;

public final class zzck {
    public final zzad[] a;
    public int b;
    public static final zzl zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    static {
        zzck.zza = zzcj.zza;
    }

    public zzck(String s, zzad[] arr_zzad) {
        this.zzc = s;
        this.a = arr_zzad;
        this.zzb = 1;
        int v = zzbo.zzb(arr_zzad[0].zzm);
        if(v == -1) {
            v = zzbo.zzb(arr_zzad[0].zzl);
        }
        this.zzd = v;
        String s1 = arr_zzad[0].zzd;
        if(s1 != null) {
            s1.equals("und");
        }
        zzad zzad0 = arr_zzad[0];
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzck.class == class0 && this.zzc.equals(((zzck)object0).zzc) && Arrays.equals(this.a, ((zzck)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.a) + f.b(0x20F, 0x1F, this.zzc);
            this.b = v1;
            return v1;
        }
        return v;
    }

    public final int zza(zzad zzad0) {
        for(int v = 0; v <= 0; ++v) {
            if(zzad0 == this.a[v]) {
                return v;
            }
        }
        return -1;
    }

    public final zzad zzb(int v) {
        return this.a[v];
    }

    public final zzck zzc(String s) {
        return new zzck(s, this.a);
    }
}

