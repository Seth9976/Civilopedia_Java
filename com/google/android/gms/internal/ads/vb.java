package com.google.android.gms.internal.ads;

public final class vb implements zztq {
    public final int a;
    public final xb b;

    public vb(xb xb0, int v) {
        this.b = xb0;
        this.a = v;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zziz0, zzgb zzgb0, int v) {
        xb xb0 = this.b;
        if(!xb0.j()) {
            int v1 = this.a;
            xb0.f(v1);
            int v2 = xb0.w[v1].zzd(zziz0, zzgb0, v, xb0.O);
            if(v2 == -3) {
                xb0.g(v1);
            }
            return v2;
        }
        return -3;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final int zzb(long v) {
        xb xb0 = this.b;
        if(!xb0.j()) {
            int v1 = this.a;
            xb0.f(v1);
            zztp zztp0 = xb0.w[v1];
            int v2 = zztp0.zzb(v, xb0.O);
            zztp0.zzv(v2);
            if(v2 == 0) {
                xb0.g(v1);
                return 0;
            }
            return v2;
        }
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzd() {
        this.b.w[this.a].zzm();
        this.b.o.zzi(zzvz.zza(this.b.F));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return !this.b.j() && this.b.w[this.a].zzx(this.b.O);
    }
}

