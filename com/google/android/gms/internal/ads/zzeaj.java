package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeaj {
    public final ScheduledExecutorService a;
    public final zzfvm b;
    public final zzeba c;
    public final zzgqo d;

    public zzeaj(ScheduledExecutorService scheduledExecutorService0, zzfvm zzfvm0, zzeba zzeba0, zzgqo zzgqo0) {
        this.a = scheduledExecutorService0;
        this.b = zzfvm0;
        this.c = zzeba0;
        this.d = zzgqo0;
    }

    public final zzfvl zzb(zzbzv zzbzv0) {
        zzfvl zzfvl0;
        if(zzs.zzy(zzbzv0.zzd)) {
            zzfvl0 = zzfvc.zzh(new zzebn(1));
        }
        else {
            zzeba zzeba0 = this.c;
            synchronized(zzeba0.j) {
                if(!zzeba0.k) {
                    zzeba0.k = true;
                    zzeba0.m = zzbzv0;
                    zzeba0.n.checkAvailabilityAndConnect();
                    zzeaz zzeaz0 = new zzeaz(zzeba0);
                    zzeba0.i.zzc(zzeaz0, zzcfv.zzf);
                }
                zzfvl0 = zzeba0.i;
            }
        }
        int v1 = Binder.getCallingUid();
        zzfut zzfut0 = (zzfut)zzfvc.zzo(zzfut.zzv(zzfvl0), ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzey)))))), TimeUnit.SECONDS, this.a);
        zzeai zzeai0 = new zzeai(this, zzbzv0, v1);
        return zzfvc.zzg(zzfut0, Throwable.class, zzeai0, this.b);
    }
}

