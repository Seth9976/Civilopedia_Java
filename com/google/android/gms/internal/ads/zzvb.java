package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzvb implements Comparator {
    public static final zzvb zza;

    static {
        zzvb.zza = new zzvb();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        zzfqy zzfqy0 = zzfqy.zzj().zzd(((Fb)object0).p, ((Fb)object1).p).zzb(((Fb)object0).t, ((Fb)object1).t).zzd(true, true).zzd(((Fb)object0).m, ((Fb)object1).m).zzd(((Fb)object0).o, ((Fb)object1).o);
        zzfsr zzfsr0 = zzfsr.zzc().zza();
        zzfqy zzfqy1 = zzfqy0.zzc(((Fb)object0).s, ((Fb)object1).s, zzfsr0).zzd(((Fb)object0).v, ((Fb)object1).v).zzd(((Fb)object0).w, ((Fb)object1).w);
        if(((Fb)object0).v && ((Fb)object0).w) {
            zzfqy1 = zzfqy1.zzb(((Fb)object0).x, ((Fb)object1).x);
        }
        return zzfqy1.zza();
    }
}

