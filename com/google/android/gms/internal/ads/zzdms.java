package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzdms implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzdms(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzbaj zzbaj0 = (zzbaj)this.a.zzb();
        Executor executor0 = (Executor)this.b.zzb();
        Context context0 = (Context)this.c.zzb();
        Clock clock0 = (Clock)this.d.zzb();
        return new zzcun(executor0, new zzctz(context0, zzbaj0), clock0);
    }
}

