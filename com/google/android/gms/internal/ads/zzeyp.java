package com.google.android.gms.internal.ads;

public final class zzeyp implements zzeza {
    public zzdbc a;

    public final zzdbc zza() {
        synchronized(this) {
        }
        return this.a;
    }

    public final zzfvl zzb(zzezb zzezb0, zzeyz zzeyz0, zzdbc zzdbc0) {
        synchronized(this) {
            this.a = zzdbc0 == null ? ((zzdbc)zzeyz0.zza(zzezb0.zzb).zzh()) : zzdbc0;
            zzcza zzcza0 = this.a.zzb();
            return zzcza0.zzh(zzcza0.zzi());
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

