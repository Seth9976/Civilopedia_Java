package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzrf implements zzrx, zzry {
    public zzrx i;
    public kb[] j;
    public long k;
    public long l;
    public final zzry zza;

    public zzrf(zzry zzry0, boolean z, long v, long v1) {
        this.zza = zzry0;
        this.j = new kb[0];
        this.k = 0L;
        this.l = v1;
    }

    public final boolean a() {
        return this.k != 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zza(long v, zzjw zzjw0) {
        if(v != 0L) {
            long v1 = zzeg.zzr(zzjw0.zzf, 0L, v);
            long v2 = zzeg.zzr(zzjw0.zzg, 0L, (this.l == 0x8000000000000000L ? 0x7FFFFFFFFFFFFFFFL : this.l - v));
            if(v1 != zzjw0.zzf || v2 != zzjw0.zzg) {
                zzjw0 = new zzjw(v1, v2);
            }
            return this.zza.zza(v, zzjw0);
        }
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzb() {
        long v = this.zza.zzb();
        return v == 0x8000000000000000L || this.l != 0x8000000000000000L && v >= this.l ? 0x8000000000000000L : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzc() {
        long v = this.zza.zzc();
        return v == 0x8000000000000000L || this.l != 0x8000000000000000L && v >= this.l ? 0x8000000000000000L : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        if(this.a()) {
            long v = this.k;
            this.k = 0x8000000000000001L;
            long v1 = this.zzd();
            return v1 == 0x8000000000000001L ? v : v1;
        }
        boolean z = false;
        long v2 = this.zza.zzd();
        if(v2 == 0x8000000000000001L) {
            return 0x8000000000000001L;
        }
        zzcw.zzf(v2 >= 0L);
        if(this.l == 0x8000000000000000L || v2 <= this.l) {
            z = true;
        }
        zzcw.zzf(z);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zze(long v) {
        this.k = 0x8000000000000001L;
        kb[] arr_kb = this.j;
        boolean z = false;
        for(int v1 = 0; v1 < arr_kb.length; ++v1) {
            kb kb0 = arr_kb[v1];
            if(kb0 != null) {
                kb0.b = false;
            }
        }
        long v2 = this.zza.zze(v);
        if(v2 == v || v2 >= 0L && (this.l == 0x8000000000000000L || v2 <= this.l)) {
            z = true;
        }
        zzcw.zzf(z);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] arr_zzvg, boolean[] arr_z, zztq[] arr_zztq, boolean[] arr_z1, long v) {
        this.j = new kb[arr_zztq.length];
        zztq[] arr_zztq1 = new zztq[arr_zztq.length];
        for(int v2 = 0; true; ++v2) {
            zztq zztq0 = null;
            if(v2 >= arr_zztq.length) {
                break;
            }
            kb[] arr_kb = this.j;
            kb kb0 = (kb)arr_zztq[v2];
            arr_kb[v2] = kb0;
            if(kb0 != null) {
                zztq0 = kb0.a;
            }
            arr_zztq1[v2] = zztq0;
        }
        long v3 = this.zza.zzf(arr_zzvg, arr_z, arr_zztq1, arr_z1, v);
        long v4 = !this.a() || v != 0L ? v : 0L;
        this.k = 0x8000000000000001L;
        zzcw.zzf(v3 == v4 || v3 >= 0L && (this.l == 0x8000000000000000L || v3 <= this.l));
        for(int v1 = 0; v1 < arr_zztq.length; ++v1) {
            zztq zztq1 = arr_zztq1[v1];
            if(zztq1 == null) {
                this.j[v1] = null;
            }
            else {
                kb[] arr_kb1 = this.j;
                kb kb1 = arr_kb1[v1];
                if(kb1 == null || kb1.a != zztq1) {
                    arr_kb1[v1] = new kb(this, zztq1);
                }
            }
            arr_zztq[v1] = this.j[v1];
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zztr
    public final void zzg(zzts zzts0) {
        zzry zzry0 = (zzry)zzts0;
        zzrx zzrx0 = this.i;
        zzrx0.getClass();
        zzrx0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzry0) {
        zzrx zzrx0 = this.i;
        zzrx0.getClass();
        zzrx0.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzj(long v, boolean z) {
        this.zza.zzj(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrx0, long v) {
        this.i = zzrx0;
        this.zza.zzl(this, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzm(long v) {
        this.zza.zzm(v);
    }

    public final void zzn(long v, long v1) {
        this.l = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzo(long v) {
        return this.zza.zzo(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzp() {
        return this.zza.zzp();
    }
}

