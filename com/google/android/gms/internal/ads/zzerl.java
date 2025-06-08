package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzerl implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzerl(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrc.zzb(zzcfv.zza);
        zzfcd zzfcd0 = ((zzdbk)this.b).zza();
        PackageInfo packageInfo0 = (PackageInfo)this.c.zzb();
        zzg zzg0 = ((zzcnj)this.d).zza();
        return new zzerj(zzcfv.zza, zzfcd0, packageInfo0, zzg0);
    }
}

