package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzeyb implements zzeza {
    public zzdbc a;
    public final Executor b;

    public zzeyb() {
        this.b = zzfvs.zzb();
    }

    public final zzdbc zza() {
        return this.a;
    }

    public final zzfvl zzb(zzezb zzezb0, zzeyz zzeyz0, zzdbc zzdbc0) {
        zzdbb zzdbb0 = zzeyz0.zza(zzezb0.zzb);
        zzdbb0.zzb(new zzezg(true));
        zzdbc zzdbc1 = (zzdbc)zzdbb0.zzh();
        this.a = zzdbc1;
        zzcza zzcza0 = zzdbc1.zzb();
        zzfdx zzfdx0 = new zzfdx();
        return zzfvc.zzm(zzfvc.zzn(zzfut.zzv(zzcza0.zzi()), new zzexz(this, zzfdx0, zzcza0), this.b), new zzeya(zzfdx0), this.b);
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final zzfvl zzc(zzezb zzezb0, zzeyz zzeyz0, Object object0) {
        return this.zzb(zzezb0, zzeyz0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final Object zzd() {
        return this.a;
    }
}

