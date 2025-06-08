package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.List;

public final class zzfch {
    public static zzq zza(Context context0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            zzfbm zzfbm0 = (zzfbm)object0;
            if(zzfbm0.zzc) {
                arrayList0.add(AdSize.FLUID);
            }
            else {
                arrayList0.add(new AdSize(zzfbm0.zza, zzfbm0.zzb));
            }
        }
        return new zzq(context0, ((AdSize[])arrayList0.toArray(new AdSize[arrayList0.size()])));
    }

    public static zzfbm zzb(List list0, zzfbm zzfbm0) {
        return (zzfbm)list0.get(0);
    }

    // 去混淆评级： 低(20)
    public static zzfbm zzc(zzq zzq0) {
        return zzq0.zzi ? new zzfbm(-3, 0, true) : new zzfbm(zzq0.zze, zzq0.zzb, false);
    }
}

