package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

public final class zzexw implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;
    public final zzgrh g;
    public final zzgrh h;

    public zzexw(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
        this.g = zzgrh6;
        this.h = zzgrh7;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return new zzexv(((Context)this.a.zzb()), ((Executor)this.b.zzb()), ((zzq)this.c.zzb()), ((zzcnf)this.d.zzb()), ((zzemh)this.e.zzb()), ((zzeml)this.f.zzb()), new zzfcb(), ((zzdgo)this.h.zzb()));
    }
}

