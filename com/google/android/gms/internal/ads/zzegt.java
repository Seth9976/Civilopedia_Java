package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzegt implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzegt(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzegs(((Context)this.a.zzb()), ((Executor)this.b.zzb()), ((zzdky)this.c.zzb()), ((zzfbk)this.d.zzb()));
    }
}

