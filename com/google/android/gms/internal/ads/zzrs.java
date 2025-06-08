package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzrs implements zzrx, zzry {
    public final long i;
    public zzsc j;
    public zzry k;
    public zzrx l;
    public long m;
    public final zzvv n;
    public final zzsa zza;

    public zzrs(zzsa zzsa0, zzvv zzvv0, long v, byte[] arr_b) {
        this.zza = zzsa0;
        this.n = zzvv0;
        this.i = v;
        this.m = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zza(long v, zzjw zzjw0) {
        return this.k.zza(v, zzjw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzb() {
        return this.k.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzc() {
        return this.k.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        return this.k.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zze(long v) {
        return this.k.zze(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] arr_zzvg, boolean[] arr_z, zztq[] arr_zztq, boolean[] arr_z1, long v) {
        long v1 = this.m;
        if(v1 != 0x8000000000000001L && v == this.i) {
            this.m = 0x8000000000000001L;
            return this.k.zzf(arr_zzvg, arr_z, arr_zztq, arr_z1, v1);
        }
        return this.k.zzf(arr_zzvg, arr_z, arr_zztq, arr_z1, v);
    }

    @Override  // com.google.android.gms.internal.ads.zztr
    public final void zzg(zzts zzts0) {
        zzry zzry0 = (zzry)zzts0;
        this.l.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        return this.k.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzry0) {
        this.l.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzj(long v, boolean z) {
        this.k.zzj(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        zzry zzry0 = this.k;
        if(zzry0 != null) {
            zzry0.zzk();
            return;
        }
        zzsc zzsc0 = this.j;
        if(zzsc0 != null) {
            zzsc0.zzw();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrx0, long v) {
        this.l = zzrx0;
        zzry zzry0 = this.k;
        if(zzry0 != null) {
            zzry0.zzl(this, (this.m == 0x8000000000000001L ? this.i : this.m));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzm(long v) {
        this.k.zzm(v);
    }

    public final long zzn() {
        return this.m;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzo(long v) {
        return this.k != null && this.k.zzo(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzp() {
        return this.k != null && this.k.zzp();
    }

    public final long zzq() {
        return this.i;
    }

    public final void zzr(zzsa zzsa0) {
        long v = this.m == 0x8000000000000001L ? this.i : this.m;
        zzsc zzsc0 = this.j;
        zzsc0.getClass();
        zzry zzry0 = zzsc0.zzD(zzsa0, this.n, v);
        this.k = zzry0;
        if(this.l != null) {
            zzry0.zzl(this, v);
        }
    }

    public final void zzs(long v) {
        this.m = v;
    }

    public final void zzt() {
        zzry zzry0 = this.k;
        if(zzry0 != null) {
            zzsc zzsc0 = this.j;
            zzsc0.getClass();
            zzsc0.zzB(zzry0);
        }
    }

    public final void zzu(zzsc zzsc0) {
        zzcw.zzf(this.j == null);
        this.j = zzsc0;
    }
}

