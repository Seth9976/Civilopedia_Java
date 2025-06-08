package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdwc;
import java.util.ArrayDeque;

public final class zza implements Runnable {
    public final zzc zza;
    public final zzdwc zzb;
    public final ArrayDeque zzc;
    public final ArrayDeque zzd;

    public zza(zzc zzc0, zzdwc zzdwc0, ArrayDeque arrayDeque0, ArrayDeque arrayDeque1) {
        this.zza = zzc0;
        this.zzb = zzdwc0;
        this.zzc = arrayDeque0;
        this.zzd = arrayDeque1;
    }

    @Override
    public final void run() {
        this.zza.b(this.zzb, this.zzc, "to");
        this.zza.b(this.zzb, this.zzd, "of");
    }
}

