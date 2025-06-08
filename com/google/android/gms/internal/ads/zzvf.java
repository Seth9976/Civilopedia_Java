package com.google.android.gms.internal.ads;

public final class zzvf {
    public final zzck zza;
    public final int[] zzb;

    public zzvf(zzck zzck0, int[] arr_v, int v) {
        if(arr_v.length == 0) {
            zzdn.zza("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzck0;
        this.zzb = arr_v;
    }
}

