package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzazk implements zzazd {
    public boolean a;
    public long b;
    public long c;
    public zzarx d;

    public zzazk() {
        this.d = zzarx.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final long zzI() {
        long v = this.b;
        if(this.a) {
            long v1 = SystemClock.elapsedRealtime() - this.c;
            return this.d.zzb == 1.0f ? v + zzare.zza(v1) : v + this.d.zza(v1);
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzJ() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzK(zzarx zzarx0) {
        if(this.a) {
            this.zza(this.zzI());
        }
        this.d = zzarx0;
        return zzarx0;
    }

    public final void zza(long v) {
        this.b = v;
        if(this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if(!this.a) {
            this.c = SystemClock.elapsedRealtime();
            this.a = true;
        }
    }

    public final void zzc() {
        if(this.a) {
            this.zza(this.zzI());
            this.a = false;
        }
    }

    public final void zzd(zzazd zzazd0) {
        this.zza(zzazd0.zzI());
        this.d = zzazd0.zzJ();
    }
}

