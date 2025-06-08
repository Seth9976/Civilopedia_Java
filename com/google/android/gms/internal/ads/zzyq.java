package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

public final class zzyq implements zzzy {
    public final byte[] a;

    public zzyq() {
        this.a = new byte[0x1000];
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final int zze(zzp zzp0, int v, boolean z) {
        return zzzw.zza(this, zzp0, v, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final int zzf(zzp zzp0, int v, boolean z, int v1) throws IOException {
        int v2 = zzp0.zza(this.a, 0, Math.min(0x1000, v));
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzk(zzad zzad0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzq(zzdy zzdy0, int v) {
        zzzw.zzb(this, zzdy0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzr(zzdy zzdy0, int v, int v1) {
        zzdy0.zzG(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzzy
    public final void zzs(long v, int v1, int v2, int v3, zzzx zzzx0) {
    }
}

