package com.google.android.gms.internal.ads;

public final class zznp extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zznp(int v, zzad zzad0, boolean z) {
        super("AudioTrack write failed: " + v);
        this.zzb = z;
        this.zza = v;
        this.zzc = zzad0;
    }
}

