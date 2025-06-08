package com.google.android.gms.internal.ads;

public final class f extends zzzf {
    public final long b;

    public f(zzys zzys0, long v) {
        super(zzys0);
        zzcw.zzd(zzys0.zzf() >= v);
        this.b = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzzf
    public final long zzd() {
        return super.zzd() - this.b;
    }

    @Override  // com.google.android.gms.internal.ads.zzzf
    public final long zze() {
        return super.zze() - this.b;
    }

    @Override  // com.google.android.gms.internal.ads.zzzf
    public final long zzf() {
        return super.zzf() - this.b;
    }
}

