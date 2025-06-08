package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

public final class zzeqt implements Callable {
    public final zzequ zza;

    public zzeqt(zzequ zzequ0) {
        this.zza = zzequ0;
    }

    @Override
    public final Object call() {
        return new zzeqv(this.zza.b.zzb(), this.zza.b.zzn(), zzt.zzs().zzl());
    }
}

