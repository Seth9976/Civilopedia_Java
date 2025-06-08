package com.google.android.gms.internal.ads;

import android.os.Looper;

public final class zzth extends zzrb {
    public final zzbb h;
    public final zzaw i;
    public final zzep j;
    public final zzpi k;
    public final int l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public zzfs q;
    public final zzte r;

    public zzth(zzbb zzbb0, zzep zzep0, zzte zzte0, zzpi zzpi0, zzvz zzvz0, int v) {
        zzbb0.zzd.getClass();
        this.i = zzbb0.zzd;
        this.h = zzbb0;
        this.j = zzep0;
        this.r = zzte0;
        this.k = zzpi0;
        this.l = v;
        this.m = true;
        this.n = 0x8000000000000001L;
    }

    public final void d() {
        new zztu(0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, this.n, this.n, 0L, 0L, this.o, false, false, null, this.h, (this.p ? this.h.zzf : null));
        this.c((this.m ? new yb(null) : null));  // 初始化器: Lcom/google/android/gms/internal/ads/zzro;-><init>(Lcom/google/android/gms/internal/ads/zzci;)V
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzry0) {
        if(((xb)zzry0).z) {
            zztp[] arr_zztp = ((xb)zzry0).w;
            for(int v = 0; v < arr_zztp.length; ++v) {
                arr_zztp[v].zzn();
            }
        }
        ((xb)zzry0).o.zzj(((xb)zzry0));
        ((xb)zzry0).t.removeCallbacksAndMessages(null);
        ((xb)zzry0).u = null;
        ((xb)zzry0).P = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final zzry zzD(zzsa zzsa0, zzvv zzvv0, long v) {
        zzeq zzeq0 = this.j.zza();
        zzfs zzfs0 = this.q;
        if(zzfs0 != null) {
            zzeq0.zzf(zzfs0);
        }
        zzcw.zzb(this.g);
        zzrd zzrd0 = new zzrd(this.r.zza);
        zzpc zzpc0 = this.d.zza(0, zzsa0);
        zzsj zzsj0 = this.c.zza(0, zzsa0, 0L);
        return new xb(this.i.zza, zzeq0, zzrd0, this.k, zzpc0, zzsj0, this, zzvv0, this.l);
    }

    public final void zza(long v, boolean z, boolean z1) {
        if(v == 0x8000000000000001L) {
            v = this.n;
        }
        if(!this.m && this.n == v && this.o == z && this.p == z1) {
            return;
        }
        this.n = v;
        this.o = z;
        this.p = z1;
        this.m = false;
        this.d();
    }

    @Override  // com.google.android.gms.internal.ads.zzrb
    public final void zzn(zzfs zzfs0) {
        this.q = zzfs0;
        Looper.myLooper().getClass();
        zzcw.zzb(this.g);
        this.d();
    }

    @Override  // com.google.android.gms.internal.ads.zzrb
    public final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzw() {
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        return this.h;
    }
}

