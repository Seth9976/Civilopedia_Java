package com.google.android.gms.internal.ads;

public final class n1 implements zzaxl {
    public final int a;
    public final o1 b;

    public n1(o1 o10, int v) {
        this.b = o10;
        this.a = v;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzaxl
    public final int zzb(zzaru zzaru0, zzato zzato0, boolean z) {
        return this.b.B || this.b.c() ? -3 : ((zzaxk)this.b.v.valueAt(this.a)).zzf(zzaru0, zzato0, z, this.b.M, this.b.J);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxl
    public final void zzc() {
        this.b.p.zzg(0x80000000);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxl
    public final void zzd(long v) {
        zzaxk zzaxk0 = (zzaxk)this.b.v.valueAt(this.a);
        if(this.b.M && v > zzaxk0.zzg()) {
            zzaxk0.zzl();
            return;
        }
        zzaxk0.zzn(v, true);
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzaxl
    public final boolean zze() {
        return this.b.M || !this.b.c() && ((zzaxk)this.b.v.valueAt(this.a)).zzm();
    }
}

