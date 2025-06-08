package com.google.android.gms.internal.ads;

import android.util.SparseArray;

public final class zzkj {
    public final zzy a;
    public final SparseArray b;

    public zzkj(zzy zzy0, SparseArray sparseArray0) {
        this.a = zzy0;
        SparseArray sparseArray1 = new SparseArray(zzy0.zzb());
        for(int v = 0; v < zzy0.zzb(); ++v) {
            int v1 = zzy0.zza(v);
            zzki zzki0 = (zzki)sparseArray0.get(v1);
            zzki0.getClass();
            sparseArray1.append(v1, zzki0);
        }
        this.b = sparseArray1;
    }

    public final int zza(int v) {
        return this.a.zza(v);
    }

    public final int zzb() {
        return this.a.zzb();
    }

    public final zzki zzc(int v) {
        zzki zzki0 = (zzki)this.b.get(v);
        zzki0.getClass();
        return zzki0;
    }

    public final boolean zzd(int v) {
        return this.a.zzc(v);
    }
}

