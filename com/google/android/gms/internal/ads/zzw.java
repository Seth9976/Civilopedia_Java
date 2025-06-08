package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzw {
    public final SparseBooleanArray a;
    public boolean b;

    public zzw() {
        this.a = new SparseBooleanArray();
    }

    public final zzw zza(int v) {
        zzcw.zzf(!this.b);
        this.a.append(v, true);
        return this;
    }

    public final zzy zzb() {
        zzcw.zzf(!this.b);
        this.b = true;
        return new zzy(this.a);
    }
}

