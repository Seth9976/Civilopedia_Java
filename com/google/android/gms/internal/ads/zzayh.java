package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class zzayh implements zzayj {
    public final byte[] a;
    public Uri b;
    public int c;
    public int d;

    public zzayh(byte[] arr_b) {
        arr_b.getClass();
        zzayz.zzc(arr_b.length > 0);
        this.a = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.d;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(this.a, this.c, arr_b, v, v3);
        this.c += v3;
        this.d -= v3;
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzayl0) throws IOException {
        this.b = zzayl0.zza;
        long v = zzayl0.zzc;
        this.c = (int)v;
        long v1 = zzayl0.zzd;
        byte[] arr_b = this.a;
        long v2 = -1L;
        if(v1 == -1L) {
            v1 = ((long)arr_b.length) - v;
        }
        else {
            v2 = v1;
        }
        this.d = (int)v1;
        if(((int)v1) <= 0 || ((int)v) + ((int)v1) > arr_b.length) {
            throw new IOException("Unsatisfiable range: [" + ((int)v) + ", " + v2 + "], length: " + arr_b.length);
        }
        return (long)(((int)v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.b;
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws IOException {
        this.b = null;
    }
}

