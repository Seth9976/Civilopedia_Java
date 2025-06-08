package com.google.android.gms.internal.ads;

public final class rb implements zzrx, zzry {
    public final zzry i;
    public final long j;
    public zzrx k;

    public rb(zzry zzry0, long v) {
        this.i = zzry0;
        this.j = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zza(long v, zzjw zzjw0) {
        return this.i.zza(v - this.j, zzjw0) + this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzb() {
        long v = this.i.zzb();
        return v == 0x8000000000000000L ? 0x8000000000000000L : v + this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzc() {
        long v = this.i.zzc();
        return v == 0x8000000000000000L ? 0x8000000000000000L : v + this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        long v = this.i.zzd();
        return v == 0x8000000000000001L ? 0x8000000000000001L : v + this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zze(long v) {
        return this.i.zze(v - this.j) + this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] arr_zzvg, boolean[] arr_z, zztq[] arr_zztq, boolean[] arr_z1, long v) {
        zztq[] arr_zztq1 = new zztq[arr_zztq.length];
        for(int v2 = 0; true; ++v2) {
            zztq zztq0 = null;
            if(v2 >= arr_zztq.length) {
                break;
            }
            sb sb0 = (sb)arr_zztq[v2];
            if(sb0 != null) {
                zztq0 = sb0.a;
            }
            arr_zztq1[v2] = zztq0;
        }
        long v3 = this.j;
        long v4 = this.i.zzf(arr_zzvg, arr_z, arr_zztq1, arr_z1, v - v3);
        for(int v1 = 0; v1 < arr_zztq.length; ++v1) {
            zztq zztq1 = arr_zztq1[v1];
            if(zztq1 == null) {
                arr_zztq[v1] = null;
            }
            else {
                zztq zztq2 = arr_zztq[v1];
                if(zztq2 == null || ((sb)zztq2).a != zztq1) {
                    arr_zztq[v1] = new sb(zztq1, v3);
                }
            }
        }
        return v4 + v3;
    }

    @Override  // com.google.android.gms.internal.ads.zztr
    public final void zzg(zzts zzts0) {
        zzry zzry0 = (zzry)zzts0;
        zzrx zzrx0 = this.k;
        zzrx0.getClass();
        zzrx0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        return this.i.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzry0) {
        zzrx zzrx0 = this.k;
        zzrx0.getClass();
        zzrx0.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzj(long v, boolean z) {
        this.i.zzj(v - this.j, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzk() {
        this.i.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrx0, long v) {
        this.k = zzrx0;
        this.i.zzl(this, v - this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzm(long v) {
        this.i.zzm(v - this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzo(long v) {
        return this.i.zzo(v - this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzp() {
        return this.i.zzp();
    }
}

