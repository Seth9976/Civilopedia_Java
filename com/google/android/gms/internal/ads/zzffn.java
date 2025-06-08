package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final class zzffn {
    public final Object a;
    public final List b;
    public final zzffx c;

    public zzffn(zzffx zzffx0, Object object0, List list0) {
        this.c = zzffx0;
        this.a = object0;
        this.b = list0;
    }

    public final zzffw zza(Callable callable0) {
        zzfvb zzfvb0 = zzfvc.zzc(this.b);
        zzfvl zzfvl0 = zzfvb0.zza(zzffl.zza, zzcfv.zzf);
        zzfvl zzfvl1 = zzfvb0.zza(callable0, this.c.a);
        return new zzffw(this.c, this.a, null, zzfvl0, this.b, zzfvl1);
    }
}

