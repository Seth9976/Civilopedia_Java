package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class zzdzm implements Callable {
    public final zzdzp zza;
    public final zzbzv zzb;

    public zzdzm(zzdzp zzdzp0, zzbzv zzbzv0) {
        this.zza = zzdzp0;
        this.zzb = zzbzv0;
    }

    @Override
    public final Object call() {
        zzbzv zzbzv0 = this.zzb;
        zzeaw zzeaw0 = this.zza.c;
        synchronized(zzeaw0.j) {
            if(zzeaw0.k) {
                return (InputStream)zzeaw0.i.get(((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzey)))))), TimeUnit.SECONDS);
            }
            zzeaw0.k = true;
            zzeaw0.m = zzbzv0;
            zzeaw0.n.checkAvailabilityAndConnect();
            zzeav zzeav0 = new zzeav(zzeaw0);
            zzeaw0.i.zzc(zzeav0, zzcfv.zzf);
        }
        return (InputStream)zzeaw0.i.get(((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzey)))))), TimeUnit.SECONDS);
    }
}

