package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class zzet {
    public Uri a;
    public Map b;
    public long c;
    public int d;

    public zzet() {
        this.b = Collections.emptyMap();
    }

    public final zzet zza(int v) {
        this.d = 6;
        return this;
    }

    public final zzet zzb(Map map0) {
        this.b = map0;
        return this;
    }

    public final zzet zzc(long v) {
        this.c = v;
        return this;
    }

    public final zzet zzd(Uri uri0) {
        this.a = uri0;
        return this;
    }

    public final zzev zze() {
        if(this.a == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new zzev(this.a, 0L, this.b, this.c, -1L, this.d);
    }
}

