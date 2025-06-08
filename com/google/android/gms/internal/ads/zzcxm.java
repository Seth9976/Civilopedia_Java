package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcxm implements zzban, zzddh {
    public final zzfbl i;
    public final zzdcl j;
    public final zzddq k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;

    public zzcxm(zzfbl zzfbl0, zzdcl zzdcl0, zzddq zzddq0) {
        this.l = new AtomicBoolean();
        this.m = new AtomicBoolean();
        this.i = zzfbl0;
        this.j = zzdcl0;
        this.k = zzddq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        if(this.i.zzf == 1 && zzbam0.zzj && this.l.compareAndSet(false, true)) {
            this.j.zza();
        }
        if(zzbam0.zzj && this.m.compareAndSet(false, true)) {
            this.k.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        synchronized(this) {
            if(this.i.zzf != 1 && this.l.compareAndSet(false, true)) {
                this.j.zza();
            }
        }
    }
}

