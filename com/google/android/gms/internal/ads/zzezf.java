package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

public final class zzezf implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzezf(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    public final zzeza zza() {
        Context context0 = (Context)this.a.zzb();
        zzfdk zzfdk0 = (zzfdk)this.b.zzb();
        zzfec zzfec0 = (zzfec)this.c.zzb();
        zzcel zzcel0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzfo)).booleanValue() ? zzt.zzo().zzh().zzh() : zzt.zzo().zzh().zzi();
        if(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfq)))) > 0 && (!((Boolean)zzay.zzc().zzb(zzbhz.zzfn)).booleanValue() || zzcel0 != null && zzcel0.zzh())) {
            J5 j50 = new J5(new zzeyb(), 1);
            zzfeb zzfeb0 = zzfec0.zza(zzfds.zza, context0, zzfdk0, j50);
            zzeyq zzeyq0 = new zzeyq(new zzeyp());
            zzeym zzeym0 = new zzeym(zzfeb0.zza, zzcfv.zza);
            zzfdv zzfdv0 = zzfeb0.zza.zza();
            return new zzeyg(zzeyq0, zzeym0, zzfeb0.zzb, zzfdv0.zzf, zzcfv.zza);
        }
        return new zzeyp();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

