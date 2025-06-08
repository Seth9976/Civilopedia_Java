package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzeth implements Runnable {
    public final zzetj zza;
    public final zzetg zzb;

    public zzeth(zzetj zzetj0, zzetg zzetg0) {
        this.zza = zzetj0;
        this.zzb = zzetg0;
    }

    @Override
    public final void run() {
        zzetj zzetj0 = this.zza;
        zzetg zzetg0 = this.zzb;
        zzetj0.getClass();
        long v = zzt.zzA().elapsedRealtime();
        long v1 = zzt.zzA().elapsedRealtime() - v;
        if(((Boolean)zzbjs.zza.zze()).booleanValue()) {
            zze.zza(("Signal runtime (ms) : " + zzfpi.zzc(zzetg0.getClass().getCanonicalName()) + " = " + v1));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbM)).booleanValue()) {
            zzdwg zzdwg0 = zzetj0.e.zza();
            zzdwg0.zzb("action", "lat_ms");
            zzdwg0.zzb("lat_grp", "sig_lat_grp");
            zzdwg0.zzb("lat_id", String.valueOf(zzetg0.zza()));
            zzdwg0.zzb("clat_ms", String.valueOf(v1));
            zzdwg0.zzh();
        }
    }
}

