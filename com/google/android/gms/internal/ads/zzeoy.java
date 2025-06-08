package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeoy implements zzetg {
    public final zzcer a;
    public final AppSetIdClient b;
    public final ScheduledExecutorService c;
    public final zzfvm d;
    public final Context e;

    public zzeoy(Context context0, zzcer zzcer0, ScheduledExecutorService scheduledExecutorService0, zzfvm zzfvm0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
            this.b = AppSet.getClient(context0);
        }
        this.e = context0;
        this.a = zzcer0;
        this.c = scheduledExecutorService0;
        this.d = zzfvm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 11;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzck)).booleanValue() && !((Boolean)zzay.zzc().zzb(zzbhz.zzcp)).booleanValue()) {
            boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzcl)).booleanValue();
            AppSetIdClient appSetIdClient0 = this.b;
            if(!z) {
                return zzfvc.zzm(zzfnz.zza(appSetIdClient0.getAppSetIdInfo()), zzeov.zza, zzcfv.zzf);
            }
            Task task0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzco)).booleanValue() ? zzfdf.zza(this.e) : appSetIdClient0.getAppSetIdInfo();
            if(task0 == null) {
                return zzfvc.zzi(new zzeoz(null, -1));
            }
            zzfvl zzfvl0 = zzfvc.zzn(zzfnz.zza(task0), zzeow.zza, zzcfv.zzf);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcm)).booleanValue()) {
                zzfvl0 = zzfvc.zzo(zzfvl0, ((long)(((Long)zzay.zzc().zzb(zzbhz.zzcn)))), TimeUnit.MILLISECONDS, this.c);
            }
            zzeox zzeox0 = new zzeox(this);
            return zzfvc.zzf(zzfvl0, Exception.class, zzeox0, this.d);
        }
        return zzfvc.zzi(new zzeoz(null, -1));
    }
}

