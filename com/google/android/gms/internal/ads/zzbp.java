package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzbp extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbp(String s, Throwable throwable0, boolean z, int v) {
        super(s, throwable0);
        this.zza = z;
        this.zzb = v;
    }

    public static zzbp zza(String s, Throwable throwable0) {
        return new zzbp(s, throwable0, true, 1);
    }

    public static zzbp zzb(String s, Throwable throwable0) {
        return new zzbp(s, throwable0, true, 0);
    }

    public static zzbp zzc(String s) {
        return new zzbp(s, null, false, 1);
    }
}

