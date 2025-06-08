package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzuk implements Comparator {
    public static final zzuk zza;

    static {
        zzuk.zza = new zzuk();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return zzfqy.zzj().zzc(((Fb)Collections.max(((List)object0), zzvb.zza)), ((Fb)Collections.max(((List)object1), zzvb.zza)), zzvb.zza).zzb(((List)object0).size(), ((List)object1).size()).zzc(((Fb)Collections.max(((List)object0), zzvc.zza)), ((Fb)Collections.max(((List)object1), zzvc.zza)), zzvc.zza).zza();
    }
}

