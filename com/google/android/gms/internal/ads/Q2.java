package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

public final class q2 implements Callable {
    public final Context a;
    public final zzcad b;

    public q2(zzcad zzcad0, Context context0) {
        this.b = zzcad0;
        this.a = context0;
    }

    @Override
    public final Object call() {
        zzcaa zzcaa0;
        WeakHashMap weakHashMap0 = this.b.a;
        Context context0 = this.a;
        r2 r20 = (r2)weakHashMap0.get(context0);
        if(r20 == null) {
            zzcaa0 = new zzbzz(context0).zza();
        }
        else {
            long v = (long)(((Long)zzbjf.zza.zze()));
            long v1 = zzt.zzA().currentTimeMillis();
            zzcaa0 = v + r20.a >= v1 ? new zzbzz(context0, r20.b).zza() : new zzbzz(context0).zza();
        }
        weakHashMap0.put(context0, new r2(zzcaa0));
        return zzcaa0;
    }
}

