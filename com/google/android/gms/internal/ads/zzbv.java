package com.google.android.gms.internal.ads;

public final class zzbv {
    public final zzw a;

    public zzbv() {
        this.a = new zzw();
    }

    public final zzbv zza(int v) {
        this.a.zza(v);
        return this;
    }

    public final zzbv zzb(zzbx zzbx0) {
        zzy zzy0 = zzbx0.a;
        for(int v = 0; v < zzy0.zzb(); ++v) {
            int v1 = zzy0.zza(v);
            this.a.zza(v1);
        }
        return this;
    }

    public final zzbv zzc(int[] arr_v) {
        for(int v = 0; v < 20; ++v) {
            this.a.zza(arr_v[v]);
        }
        return this;
    }

    public final zzbv zzd(int v, boolean z) {
        if(z) {
            this.a.zza(v);
        }
        return this;
    }

    public final zzbx zze() {
        return new zzbx(this.a.zzb());
    }
}

