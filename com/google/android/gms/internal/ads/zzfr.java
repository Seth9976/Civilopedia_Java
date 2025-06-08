package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class zzfr implements zzeq {
    public final zzeq a;
    public long b;
    public Uri c;
    public Map d;

    public zzfr(zzeq zzeq0) {
        zzeq0.getClass();
        this.a = zzeq0;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.a.zza(arr_b, v, v1);
        if(v2 != -1) {
            this.b += (long)v2;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws IOException {
        this.c = zzev0.zza;
        this.d = Collections.emptyMap();
        long v = this.a.zzb(zzev0);
        Uri uri0 = this.zzc();
        uri0.getClass();
        this.c = uri0;
        this.d = this.zze();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws IOException {
        this.a.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Map zze() {
        return this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfs0) {
        zzfs0.getClass();
        this.a.zzf(zzfs0);
    }

    public final long zzg() {
        return this.b;
    }

    public final Uri zzh() {
        return this.c;
    }

    public final Map zzi() {
        return this.d;
    }
}

