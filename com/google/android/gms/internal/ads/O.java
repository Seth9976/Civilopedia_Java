package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class o implements p {
    public final long[] a;
    public final long[] b;
    public final long c;

    public o(long[] arr_v, long[] arr_v1, long v) {
        this.a = arr_v;
        this.b = arr_v1;
        if(v == 0x8000000000000001L) {
            v = zzeg.zzv(arr_v1[arr_v1.length - 1]);
        }
        this.c = v;
    }

    public static Pair a(long[] arr_v, long[] arr_v1, long v) {
        int v1 = zzeg.zzd(arr_v, v, true, true);
        long v2 = arr_v[v1];
        long v3 = arr_v1[v1];
        if(v1 + 1 == arr_v.length) {
            return Pair.create(v2, v3);
        }
        long v4 = arr_v[v1 + 1];
        long v5 = arr_v1[v1 + 1];
        return v4 == v2 ? Pair.create(v, ((long)(((long)(0.0 * ((double)(v5 - v3)))) + v3))) : Pair.create(v, ((long)(((long)((((double)v) - ((double)v2)) / ((double)(v4 - v2)) * ((double)(v5 - v3)))) + v3)));
    }

    @Override  // com.google.android.gms.internal.ads.p
    public final long zzb() {
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.p
    public final long zzc(long v) {
        return zzeg.zzv(((long)(((Long)o.a(this.a, this.b, v).second))));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        long v1 = zzeg.zzz(zzeg.zzr(v, 0L, this.c));
        Pair pair0 = o.a(this.b, this.a, v1);
        zzzv zzzv0 = new zzzv(zzeg.zzv(((long)(((Long)pair0.first)))), ((long)(((Long)pair0.second))));
        return new zzzs(zzzv0, zzzv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}

