package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

public final class zzezc {
    public static zzeza a(Context context0, zzfdk zzfdk0, zzfec zzfec0) {
        zzcel zzcel0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzfo)).booleanValue() ? zzt.zzo().zzh().zzh() : zzt.zzo().zzh().zzi();
        if(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzfE)))) > 0 && (!((Boolean)zzay.zzc().zzb(zzbhz.zzfn)).booleanValue() || zzcel0 != null && zzcel0.zzh())) {
            J5 j50 = new J5(new zzeyb(), 1);
            zzfeb zzfeb0 = zzfec0.zza(zzfds.zzc, context0, zzfdk0, j50);
            zzeyq zzeyq0 = new zzeyq(new zzeyp());
            zzeym zzeym0 = new zzeym(zzfeb0.zza, zzcfv.zza);
            zzfdv zzfdv0 = zzfeb0.zza.zza();
            return new zzeyg(zzeyq0, zzeym0, zzfeb0.zzb, zzfdv0.zzf, zzcfv.zza);
        }
        return new zzeyp();
    }
}

