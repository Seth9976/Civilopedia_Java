package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

public final class s2 {
    public final Clock a;
    public final zzg b;
    public final zzcdn c;

    public s2(Clock clock0, zzg zzg0, zzcdn zzcdn0) {
        this.a = clock0;
        this.b = zzg0;
        this.c = zzcdn0;
    }

    public final void a(int v, long v1) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzan)).booleanValue()) {
            return;
        }
        zzg zzg0 = this.b;
        if(v1 - zzg0.zzf() < 0L) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        zzbhr zzbhr0 = zzbhz.zzao;
        if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
            zzg0.zzK(v);
        }
        else {
            zzg0.zzK(-1);
        }
        zzg0.zzL(v1);
        boolean z = !((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue();
    }
}

