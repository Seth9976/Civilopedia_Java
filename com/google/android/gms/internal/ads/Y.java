package com.google.android.gms.internal.ads;

import android.util.Log;

public final class y implements Z0, x {
    public final int a;
    public final int b;
    public final int c;
    public final Object d;

    public y(X0 x00) {
        this.a = 1;
        super();
        this.d = x00.P0;
        x00.P0.zzv(12);
        this.b = x00.P0.zzi();
        this.c = x00.P0.zzi();
    }

    public y(t t0, zzad zzad0) {
        this.a = 0;
        super();
        zzdy zzdy0 = t0.b;
        this.d = zzdy0;
        zzdy0.zzF(12);
        int v = zzdy0.zzn();
        if("audio/raw".equals(zzad0.zzm)) {
            int v1 = zzeg.zzo(zzad0.zzB, zzad0.zzz);
            if(v == 0 || v % v1 != 0) {
                Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + v1 + ", stsz sample size: " + v);
                v = v1;
            }
        }
        if(v == 0) {
            v = -1;
        }
        this.b = v;
        this.c = zzdy0.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.x, com.google.android.gms.internal.ads.Z0
    public final int zza() {
        return this.a == 0 ? this.b : this.c;
    }

    @Override  // com.google.android.gms.internal.ads.x, com.google.android.gms.internal.ads.Z0
    public final int zzb() {
        if(this.a != 0) {
            return this.b == 0 ? ((zzazh)this.d).zzi() : this.b;
        }
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.x
    public int zzc() {
        return this.b == -1 ? ((zzdy)this.d).zzn() : this.b;
    }

    @Override  // com.google.android.gms.internal.ads.Z0
    public boolean zzc() {
        return this.b != 0;
    }
}

