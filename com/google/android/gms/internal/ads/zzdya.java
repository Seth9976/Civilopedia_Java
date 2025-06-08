package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzdya implements Runnable {
    public final zzdyj zza;
    public final Object zzb;
    public final zzcga zzc;
    public final String zzd;
    public final long zze;
    public final zzfhh zzf;

    public zzdya(zzdyj zzdyj0, Object object0, zzcga zzcga0, String s, long v, zzfhh zzfhh0) {
        this.zza = zzdyj0;
        this.zzb = object0;
        this.zzc = zzcga0;
        this.zzd = s;
        this.zze = v;
        this.zzf = zzfhh0;
    }

    @Override
    public final void run() {
        zzdyj zzdyj0 = this.zza;
        Object object0 = this.zzb;
        zzcga zzcga0 = this.zzc;
        String s = this.zzd;
        long v = this.zze;
        zzfhh zzfhh0 = this.zzf;
        zzdyj0.getClass();
        synchronized(object0) {
            if(!zzcga0.isDone()) {
                zzdyj0.b(s, ((int)(zzt.zzA().elapsedRealtime() - v)), "Timeout.", false);
                zzdyj0.l.zzb(s, "timeout");
                zzdyj0.o.zzb(s, "timeout");
                zzfhh0.zze(false);
                zzfhl zzfhl0 = zzfhh0.zzj();
                zzdyj0.p.zzb(zzfhl0);
                zzcga0.zzd(Boolean.FALSE);
            }
        }
    }
}

