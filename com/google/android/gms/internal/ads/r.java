package com.google.android.gms.internal.ads;

public final class r implements p {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public r(long v, int v1, long v2, long v3, long[] arr_v) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.f = arr_v;
        this.d = v3;
        this.e = v3 == -1L ? -1L : v + v3;
    }

    @Override  // com.google.android.gms.internal.ads.p
    public final long zzb() {
        return this.e;
    }

    @Override  // com.google.android.gms.internal.ads.p
    public final long zzc(long v) {
        long v1 = v - this.a;
        if(this.zzh() && v1 > ((long)this.b)) {
            long[] arr_v = (long[])zzcw.zzb(this.f);
            double f = ((double)v1) * 256.0 / ((double)this.d);
            int v2 = zzeg.zzd(arr_v, ((long)f), true, true);
            long v3 = ((long)v2) * this.c / 100L;
            long v4 = arr_v[v2];
            long v5 = this.c * ((long)(v2 + 1)) / 100L;
            long v6 = v2 == 99 ? 0x100L : arr_v[v2 + 1];
            return v4 == v6 ? Math.round(0.0 * ((double)(v5 - v3))) + v3 : Math.round((f - ((double)v4)) / ((double)(v6 - v4)) * ((double)(v5 - v3))) + v3;
        }
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        int v1 = this.b;
        long v2 = this.a;
        if(!this.zzh()) {
            zzzv zzzv0 = new zzzv(0L, v2 + ((long)v1));
            return new zzzs(zzzv0, zzzv0);
        }
        long v3 = zzeg.zzr(v, 0L, this.c);
        double f = ((double)v3) * 100.0 / ((double)this.c);
        double f1 = 0.0;
        if(f > 0.0) {
            if(f >= 100.0) {
                f1 = 256.0;
            }
            else {
                long[] arr_v = (long[])zzcw.zzb(this.f);
                double f2 = (double)arr_v[((int)f)];
                f1 = ((((int)f) == 99 ? 256.0 : ((double)arr_v[((int)f) + 1])) - f2) * (f - ((double)(((int)f)))) + f2;
            }
        }
        zzzv zzzv1 = new zzzv(v3, v2 + zzeg.zzr(Math.round(f1 / 256.0 * ((double)this.d)), v1, this.d - 1L));
        return new zzzs(zzzv1, zzzv1);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.f != null;
    }
}

