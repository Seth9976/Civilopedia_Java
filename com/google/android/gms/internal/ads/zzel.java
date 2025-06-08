package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class zzel extends zzek {
    public final byte[] e;
    public Uri f;
    public int g;
    public int h;
    public boolean i;

    public zzel(byte[] arr_b) {
        boolean z = false;
        super(false);
        arr_b.getClass();
        if(arr_b.length > 0) {
            z = true;
        }
        zzcw.zzd(z);
        this.e = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.h;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(this.e, this.g, arr_b, v, v3);
        this.g += v3;
        this.h -= v3;
        this.zzg(v3);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws IOException {
        this.f = zzev0.zza;
        this.b(zzev0);
        long v = zzev0.zzf;
        if(v > ((long)this.e.length)) {
            throw new zzer(2008);
        }
        this.g = (int)v;
        int v1 = this.e.length - ((int)v);
        this.h = v1;
        long v2 = zzev0.zzg;
        if(v2 != -1L) {
            this.h = (int)Math.min(v1, v2);
        }
        this.i = true;
        this.c(zzev0);
        return zzev0.zzg == -1L ? ((long)this.h) : zzev0.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.f;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        if(this.i) {
            this.i = false;
            this.a();
        }
        this.f = null;
    }
}

