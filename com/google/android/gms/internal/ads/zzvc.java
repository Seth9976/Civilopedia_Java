package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzvc implements Comparator {
    public static final zzvc zza;

    static {
        zzvc.zza = new zzvc();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(((Fb)object0).m && ((Fb)object0).p) {
            return zzfqy.zzj().zzc(((Fb)object0).q, ((Fb)object1).q, zzve.f).zzc(((Fb)object0).r, ((Fb)object1).r, zzve.e).zzc(((Fb)object0).q, ((Fb)object1).q, zzve.e).zza();
        }
        zzfsr zzfsr0 = zzve.e.zza();
        return zzfqy.zzj().zzc(((Fb)object0).q, ((Fb)object1).q, zzve.f).zzc(((Fb)object0).r, ((Fb)object1).r, zzfsr0).zzc(((Fb)object0).q, ((Fb)object1).q, zzfsr0).zza();
    }
}

