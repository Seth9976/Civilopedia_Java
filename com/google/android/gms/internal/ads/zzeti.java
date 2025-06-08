package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final class zzeti implements Callable {
    public final List zza;
    public final Object zzb;

    public zzeti(List list0, Object object0) {
        this.zza = list0;
        this.zzb = object0;
    }

    @Override
    public final Object call() {
        Object object0 = this.zzb;
        for(Object object1: this.zza) {
            zzetf zzetf0 = (zzetf)((zzfvl)object1).get();
            if(zzetf0 != null) {
                zzetf0.zzf(object0);
            }
        }
        return object0;
    }
}

