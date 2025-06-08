package com.google.android.gms.internal.ads;

import A.f;
import i3.e;

public final class zzmw {
    public static final zzmw zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    static {
        zzmw.zza = new zzmw(-1, -1, -1);
    }

    public zzmw(int v, int v1, int v2) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = zzeg.zzU(v2) ? zzeg.zzo(v2, v1) : -1;
    }

    @Override
    public final String toString() {
        return e.g(f.n("AudioFormat[sampleRate=", this.zzb, ", channelCount=", this.zzc, ", encoding="), this.zzd, "]");
    }
}

