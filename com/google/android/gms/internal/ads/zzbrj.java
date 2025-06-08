package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

public final class zzbrj implements Predicate {
    public final zzbom zza;

    public zzbrj(zzbom zzbom0) {
        this.zza = zzbom0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.util.Predicate
    public final boolean apply(Object object0) {
        return ((zzbom)object0) instanceof W1 && ((W1)(((zzbom)object0))).a.equals(this.zza);
    }
}

