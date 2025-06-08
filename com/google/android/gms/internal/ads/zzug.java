package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class zzug implements zzvg {
    public final zzck a;
    public final int b;
    public final int[] c;
    public final zzad[] d;
    public int e;

    public zzug(zzck zzck0, int[] arr_v, int v) {
        zzcw.zzf(arr_v.length > 0);
        zzck0.getClass();
        this.a = zzck0;
        this.b = arr_v.length;
        this.d = new zzad[arr_v.length];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            this.d[v2] = zzck0.zzb(arr_v[v2]);
        }
        Arrays.sort(this.d, zzuf.zza);
        this.c = new int[this.b];
        for(int v1 = 0; v1 < this.b; ++v1) {
            this.c[v1] = zzck0.zza(this.d[v1]);
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((zzug)object0).a && Arrays.equals(this.c, ((zzug)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = this.e;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.c) + System.identityHashCode(this.a) * 0x1F;
            this.e = v1;
            return v1;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final int zza(int v) {
        return this.c[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final int zzb(int v) {
        for(int v1 = 0; v1 < this.b; ++v1) {
            if(this.c[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final int zzc() {
        return this.c.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final zzad zzd(int v) {
        return this.d[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final zzck zze() {
        return this.a;
    }
}

