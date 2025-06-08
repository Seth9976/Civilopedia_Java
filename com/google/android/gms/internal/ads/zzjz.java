package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzjz implements zzjb {
    public final zzcx i;
    public boolean j;
    public long k;
    public long l;
    public zzbt m;

    public zzjz(zzcx zzcx0) {
        this.i = zzcx0;
        this.m = zzbt.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        long v = this.k;
        if(this.j) {
            long v1 = SystemClock.elapsedRealtime() - this.l;
            return this.m.zzc == 1.0f ? v + zzeg.zzv(v1) : v + this.m.zza(v1);
        }
        return v;
    }

    public final void zzb(long v) {
        this.k = v;
        if(this.j) {
            this.l = SystemClock.elapsedRealtime();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final zzbt zzc() {
        return this.m;
    }

    public final void zzd() {
        if(!this.j) {
            this.l = SystemClock.elapsedRealtime();
            this.j = true;
        }
    }

    public final void zze() {
        if(this.j) {
            this.zzb(this.zza());
            this.j = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final void zzg(zzbt zzbt0) {
        if(this.j) {
            this.zzb(this.zza());
        }
        this.m = zzbt0;
    }
}

