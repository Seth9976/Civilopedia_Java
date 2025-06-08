package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzegj implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzegj(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzegi(((Context)this.a.zzb()), ((zzcws)this.b.zzb()), ((Executor)this.c.zzb()));
    }
}

