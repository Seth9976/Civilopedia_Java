package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcyr implements zzo {
    public final zzdda i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;

    public zzcyr(zzdda zzdda0) {
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.i = zzdda0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.i.zzc();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        AtomicBoolean atomicBoolean0 = this.k;
        if(!atomicBoolean0.get()) {
            atomicBoolean0.set(true);
            this.i.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        this.j.set(true);
        AtomicBoolean atomicBoolean0 = this.k;
        if(!atomicBoolean0.get()) {
            atomicBoolean0.set(true);
            this.i.zza();
        }
    }

    public final boolean zzg() {
        return this.j.get();
    }
}

