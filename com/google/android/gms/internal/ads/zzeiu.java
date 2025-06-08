package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

public final class zzeiu implements zzfuj {
    public final zzeiv zza;
    public final zzfbl zzb;
    public final zzfbx zzc;
    public final zzefd zzd;

    public zzeiu(zzeiv zzeiv0, zzfbl zzfbl0, zzfbx zzfbx0, zzefd zzefd0) {
        this.zza = zzeiv0;
        this.zzb = zzfbl0;
        this.zzc = zzfbx0;
        this.zzd = zzefd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzeiv zzeiv0 = this.zza;
        zzfbl zzfbl0 = this.zzb;
        zzfbx zzfbx0 = this.zzc;
        Throwable throwable0 = (Throwable)object0;
        zzfhh zzfhh0 = zzfhg.zza(zzeiv0.j, 12);
        zzfhh0.zzc(zzfbl0.zzF);
        zzfhh0.zzf();
        zzfvl zzfvl0 = zzfvc.zzo(this.zzd.zza(zzfbx0, zzfbl0), ((long)zzfbl0.zzS), TimeUnit.MILLISECONDS, zzeiv0.f);
        zzeiq zzeiq0 = zzeiv0.h;
        zzeiq0.getClass();
        zzfbo zzfbo0 = zzfbx0.zzb.zzb;
        long v = zzeiq0.a.elapsedRealtime();
        String s = zzfbl0.zzx;
        if(s != null) {
            zzfvc.zzr(zzfvl0, new q5(zzeiq0, v, s, zzfbl0, zzfbo0, zzeiv0.c, zzfbx0), zzcfv.zzf);
        }
        zzfhr.zza(zzfvl0, zzeiv0.k, zzfhh0);
        return zzfvl0;
    }
}

