package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class zzaxu {
    public final zzaxp a;
    public final int[] b;
    public final zzart[] c;
    public int d;

    public zzaxu(zzaxp zzaxp0, int[] arr_v) {
        zzaxp0.getClass();
        this.a = zzaxp0;
        this.c = new zzart[1];
        this.c[0] = zzaxp0.zzb(arr_v[0]);
        s0 s00 = new s0(1);
        Arrays.sort(this.c, s00);
        this.b = new int[1];
        this.b[0] = zzaxp0.zza(this.c[0]);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((zzaxu)object0).a && Arrays.equals(this.b, ((zzaxu)object0).b);
    }

    @Override
    public final int hashCode() {
        int v = this.d;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.b) + System.identityHashCode(this.a) * 0x1F;
            this.d = v1;
            return v1;
        }
        return v;
    }

    public final int zza(int v) {
        return this.b[0];
    }

    public final int zzb() [...] // Inlined contents

    public final zzart zzc(int v) {
        return this.c[v];
    }

    public final zzaxp zzd() {
        return this.a;
    }
}

