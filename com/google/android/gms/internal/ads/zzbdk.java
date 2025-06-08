package com.google.android.gms.internal.ads;

import java.io.InputStream;

public final class zzbdk {
    public final InputStream a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final boolean e;

    public zzbdk(InputStream inputStream0, boolean z, boolean z1, long v, boolean z2) {
        this.a = inputStream0;
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = z2;
    }

    public final long zza() {
        return this.d;
    }

    public static zzbdk zzb(InputStream inputStream0, boolean z, boolean z1, long v, boolean z2) {
        return new zzbdk(inputStream0, z, z1, v, z2);
    }

    public final InputStream zzc() {
        return this.a;
    }

    public final boolean zzd() {
        return this.b;
    }

    public final boolean zze() {
        return this.e;
    }

    public final boolean zzf() {
        return this.c;
    }
}

