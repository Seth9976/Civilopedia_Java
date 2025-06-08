package com.google.android.gms.internal.ads;

public final class sb implements zztq {
    public final zztq a;
    public final long b;

    public sb(zztq zztq0, long v) {
        this.a = zztq0;
        this.b = v;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zziz0, zzgb zzgb0, int v) {
        int v1 = this.a.zza(zziz0, zzgb0, v);
        if(v1 == -4) {
            zzgb0.zzd = Math.max(0L, zzgb0.zzd + this.b);
            return -4;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final int zzb(long v) {
        return this.a.zzb(v - this.b);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzd() {
        this.a.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return this.a.zze();
    }
}

