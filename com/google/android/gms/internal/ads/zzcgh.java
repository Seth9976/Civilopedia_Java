package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class zzcgh {
    public final zzcga a;
    public final AtomicInteger b;

    public zzcgh() {
        zzcga zzcga0 = new zzcga();
        this.a = zzcga0;
        this.b = new AtomicInteger(0);
        zzfvc.zzr(zzcga0, new E9(this, 14), zzcfv.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.b.get();
    }

    @Deprecated
    public final void zzg() {
        this.a.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object object0) {
        this.a.zzd(object0);
    }

    @Deprecated
    public final void zzi(zzcge zzcge0, zzcgc zzcgc0) {
        Q q0 = new Q(8, zzcge0, zzcgc0);
        zzfvc.zzr(this.a, q0, zzcfv.zzf);
    }
}

