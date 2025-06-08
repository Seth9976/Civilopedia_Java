package com.google.android.gms.internal.ads;

public final class zzeyq implements zzeza {
    public final zzeza a;
    public zzdbc b;

    public zzeyq(zzeza zzeza0) {
        this.a = zzeza0;
    }

    public final zzdbc zza() {
        synchronized(this) {
        }
        return this.b;
    }

    public final zzfvl zzb(zzezb zzezb0, zzeyz zzeyz0, zzdbc zzdbc0) {
        synchronized(this) {
            this.b = zzdbc0;
            if(zzezb0.zza != null) {
                zzcza zzcza0 = zzdbc0.zzb();
                return zzcza0.zzh(zzcza0.zzj(zzfvc.zzi(zzezb0.zza)));
            }
            return ((zzeyp)this.a).zzb(zzezb0, zzeyz0, zzdbc0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final zzfvl zzc(zzezb zzezb0, zzeyz zzeyz0, Object object0) {
        return this.zzb(zzezb0, zzeyz0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final Object zzd() {
        return this.zza();
    }
}

