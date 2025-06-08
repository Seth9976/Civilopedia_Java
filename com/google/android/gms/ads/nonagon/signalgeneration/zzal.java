package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzgqu;
import com.google.android.gms.internal.ads.zzgrc;
import com.google.android.gms.internal.ads.zzgrh;

public final class zzal implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzal(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzak zza() {
        zzgrc.zzb(zzcfv.zza);
        zzeaj zzeaj0 = ((zzeak)this.b).zza();
        return new zzak(zzcfv.zza, zzeaj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

