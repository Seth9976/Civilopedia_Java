package com.google.android.gms.internal.ads;

public final class f0 implements e0 {
    public final zzyu a;
    public final zzzy b;
    public final z c;
    public final zzad d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public f0(zzyu zzyu0, zzzy zzzy0, z z0, String s, int v) {
        this.a = zzyu0;
        this.b = zzzy0;
        this.c = z0;
        int v1 = z0.b;
        int v2 = z0.e * v1 / 8;
        int v3 = z0.d;
        if(v3 != v2) {
            throw zzbp.zza(("Expected block size: " + v2 + "; got: " + v3), null);
        }
        int v4 = z0.c;
        int v5 = v4 * v2;
        int v6 = Math.max(v2, v5 / 10);
        this.e = v6;
        zzab zzab0 = new zzab();
        zzab0.zzS(s);
        zzab0.zzv(v5 * 8);
        zzab0.zzO(v5 * 8);
        zzab0.zzL(v6);
        zzab0.zzw(v1);
        zzab0.zzT(v4);
        zzab0.zzN(v);
        this.d = zzab0.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.e0
    public final boolean a(zzys zzys0, long v) {
        int v1;
        while((v1 = Long.compare(v, 0L)) > 0) {
            int v2 = this.g;
            int v3 = this.e;
            if(v2 >= v3) {
                break;
            }
            int v4 = zzzw.zza(this.b, zzys0, ((int)Math.min(v3 - v2, v)), true);
            if(v4 == -1) {
                v = 0L;
            }
            else {
                this.g += v4;
                v -= (long)v4;
            }
        }
        z z0 = this.c;
        int v5 = z0.d;
        int v6 = this.g / v5;
        if(v6 > 0) {
            long v7 = this.f;
            long v8 = zzeg.zzw(this.h, 1000000L, z0.c);
            int v9 = v6 * v5;
            int v10 = this.g - v9;
            this.b.zzs(v7 + v8, 1, v9, v10, null);
            this.h += (long)v6;
            this.g = v10;
        }
        return v1 <= 0;
    }

    @Override  // com.google.android.gms.internal.ads.e0
    public final void zza(int v, long v1) {
        h0 h00 = new h0(this.c, 1, ((long)v), v1);
        this.a.zzL(h00);
        this.b.zzk(this.d);
    }

    @Override  // com.google.android.gms.internal.ads.e0
    public final void zzb(long v) {
        this.f = v;
        this.g = 0;
        this.h = 0L;
    }
}

