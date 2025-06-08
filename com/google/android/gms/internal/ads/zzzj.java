package com.google.android.gms.internal.ads;

public final class zzzj implements zzzu {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public zzzj(long[] arr_v, long[] arr_v1, long v) {
        zzcw.zzd(arr_v.length == arr_v1.length);
        this.d = arr_v1.length > 0;
        if(arr_v1.length <= 0 || arr_v1[0] <= 0L) {
            this.a = arr_v;
            this.b = arr_v1;
        }
        else {
            long[] arr_v2 = new long[arr_v1.length + 1];
            this.a = arr_v2;
            long[] arr_v3 = new long[arr_v1.length + 1];
            this.b = arr_v3;
            System.arraycopy(arr_v, 0, arr_v2, 1, arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v3, 1, arr_v1.length);
        }
        this.c = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        if(!this.d) {
            return new zzzs(zzzv.zza, zzzv.zza);
        }
        int v1 = zzeg.zzd(this.b, v, true, true);
        zzzv zzzv0 = new zzzv(this.b[v1], this.a[v1]);
        return zzzv0.zzb == v || v1 == this.b.length - 1 ? new zzzs(zzzv0, zzzv0) : new zzzs(zzzv0, new zzzv(this.b[v1 + 1], this.a[v1 + 1]));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.d;
    }
}

