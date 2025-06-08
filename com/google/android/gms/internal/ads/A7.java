package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class a7 extends zzfqy {
    public static final zzfqy a(int v) {
        if(v < 0) {
            return zzfqy.b;
        }
        return v > 0 ? zzfqy.c : zzfqy.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqy
    public final int zza() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzb(int v, int v1) {
        if(v < v1) {
            return a7.a(-1);
        }
        return v <= v1 ? a7.a(0) : a7.a(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzc(Object object0, Object object1, Comparator comparator0) {
        return a7.a(comparator0.compare(object0, object1));
    }

    @Override  // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzd(boolean z, boolean z1) {
        return a7.a(zzftn.zza(z, z1));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zze(boolean z, boolean z1) {
        return a7.a(0);
    }
}

