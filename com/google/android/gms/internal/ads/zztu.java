package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zztu extends zzci {
    public final long a;
    public final long b;
    public final boolean c;
    public final zzbb d;
    public final zzau e;
    public static final Object f;

    static {
        zztu.f = new Object();
        zzah zzah0 = new zzah();
        zzah0.zza("SinglePeriodTimeline");
        zzah0.zzb(Uri.EMPTY);
        zzah0.zzc();
    }

    public zztu(long v, long v1, long v2, long v3, long v4, long v5, long v6, boolean z, boolean z1, boolean z2, Object object0, zzbb zzbb0, zzau zzau0) {
        this.a = v3;
        this.b = v4;
        this.c = z;
        this.d = zzbb0;
        this.e = zzau0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zza(Object object0) {
        return zztu.f.equals(object0) ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int v, zzcf zzcf0, boolean z) {
        zzcw.zza(v, 0, 1);
        zzcf0.zzk(null, (z ? zztu.f : null), 0, this.a, 0L, zzd.zza, false);
        return zzcf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int v, zzch zzch0, long v1) {
        zzcw.zza(v, 0, 1);
        zzch0.zza(zzch.zza, this.d, null, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, this.c, false, this.e, 0L, this.b, 0, 0, 0L);
        return zzch0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int v) {
        zzcw.zza(v, 0, 1);
        return zztu.f;
    }
}

