package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeuj implements zzetg {
    public final zzcer a;
    public final ScheduledExecutorService b;
    public final zzfvm c;

    public zzeuj(zzcer zzcer0, ScheduledExecutorService scheduledExecutorService0, zzfvm zzfvm0) {
        this.a = zzcer0;
        this.b = scheduledExecutorService0;
        this.c = zzfvm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 43;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzck)).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zzcp)).booleanValue()) {
            zzfvl zzfvl0 = zzfnz.zza(Tasks.forResult(null));
            zzfvm zzfvm0 = this.c;
            zzfvl zzfvl1 = zzfvc.zzn(zzfvl0, zzeuh.zza, zzfvm0);
            if(((Boolean)zzbje.zza.zze()).booleanValue()) {
                zzfvl1 = zzfvc.zzo(zzfvl1, ((long)(((Long)zzbje.zzb.zze()))), TimeUnit.MILLISECONDS, this.b);
            }
            zzeui zzeui0 = new zzeui(this);
            return zzfvc.zzf(zzfvl1, Exception.class, zzeui0, zzfvm0);
        }
        return zzfvc.zzi(new zzeuk(null, -1));
    }
}

