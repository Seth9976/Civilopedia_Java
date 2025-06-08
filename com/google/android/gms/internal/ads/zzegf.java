package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzegf implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;

    public zzegf(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
    }

    public final zzege zza() {
        return new zzege(((zzcws)this.a.zzb()), ((Context)this.b.zzb()), ((Executor)this.c.zzb()), ((zzdtp)this.d.zzb()), ((zzdbk)this.e).zza(), ((zzfok)this.f.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

