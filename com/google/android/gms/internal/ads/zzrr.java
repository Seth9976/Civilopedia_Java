package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class zzrr {
    public static final AtomicLong a;
    public final zzev zza;
    public final Uri zzb;
    public final Map zzc;

    static {
        zzrr.a = new AtomicLong();
    }

    public zzrr(long v, zzev zzev0, Uri uri0, Map map0, long v1, long v2, long v3) {
        this.zza = zzev0;
        this.zzb = uri0;
        this.zzc = map0;
    }

    public static long zza() {
        return zzrr.a.getAndIncrement();
    }
}

