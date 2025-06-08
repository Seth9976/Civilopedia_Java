package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

public final class zzeyg implements zzeza {
    public final zzeza a;
    public final zzeza b;
    public final zzfek c;
    public final String d;
    public zzdbc e;
    public final Executor f;

    public zzeyg(zzeza zzeza0, zzeza zzeza1, zzfek zzfek0, String s, Executor executor0) {
        this.a = zzeza0;
        this.b = zzeza1;
        this.c = zzfek0;
        this.d = s;
        this.f = executor0;
    }

    public final zzfvl a(zzfdx zzfdx0, zzezb zzezb0) {
        zzdbc zzdbc0 = zzfdx0.zza;
        this.e = zzdbc0;
        if(zzfdx0.zzc != null) {
            if(zzdbc0.zzf() != null) {
                zzfdx0.zzc.zzo().zzbL(zzfdx0.zza.zzf());
            }
            return zzfvc.zzi(zzfdx0.zzc);
        }
        zzdbc0.zzb().zzk(zzfdx0.zzb);
        return ((zzeyq)this.a).zzb(zzezb0, null, zzfdx0.zza);
    }

    public final zzdbc zza() {
        synchronized(this) {
        }
        return this.e;
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final zzfvl zzc(zzezb zzezb0, zzeyz zzeyz0, Object object0) {
        return this.zzf(zzezb0, zzeyz0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final Object zzd() {
        return this.zza();
    }

    public final zzfvl zzf(zzezb zzezb0, zzeyz zzeyz0, zzdbc zzdbc0) {
        synchronized(this) {
            zzdbb zzdbb0 = zzeyz0.zza(zzezb0.zzb);
            zzdbb0.zza(new zzeyh(this.d));
            Object object0 = zzdbb0.zzh();
            ((zzdbc)object0).zzg();
            ((zzdbc)object0).zzg();
            zzl zzl0 = ((zzdbc)object0).zzg().zzd;
            if(zzl0.zzs == null && zzl0.zzx == null) {
                zzfcd zzfcd0 = ((zzdbc)object0).zzg();
                L5 l50 = new L5(zzeyz0, zzezb0, zzfcd0.zzd, zzfcd0.zzf, this.f, zzfcd0.zzj, null);
                return zzfvc.zzn(zzfut.zzv(((zzeym)this.b).zzb(zzezb0, zzeyz0, ((zzdbc)object0))), new zzeyd(this, zzezb0, l50, zzeyz0, ((zzdbc)object0)), this.f);
            }
            this.e = (zzdbc)object0;
            return ((zzeyq)this.a).zzb(zzezb0, zzeyz0, ((zzdbc)object0));
        }
    }
}

