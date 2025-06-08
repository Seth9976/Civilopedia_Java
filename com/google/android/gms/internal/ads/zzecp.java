package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class zzecp implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;
    public final zzgrh g;
    public final zzgrh h;
    public final zzgrh i;

    public zzecp(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7, zzgrh zzgrh8) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
        this.g = zzgrh6;
        this.h = zzgrh7;
        this.i = zzgrh8;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Context context0 = ((zzcnl)this.a).zza();
        Object object0 = this.b.zzb();
        zzgrc.zzb(zzcfv.zza);
        zzcah zzcah0 = new zzcah();
        zzcsm zzcsm0 = ((zzcns)this.e).zza();
        zzcag zzcag0 = ((zzcoe)this.f).zza();
        Object object1 = this.g.zzb();
        zzect zzect0 = new zzect();
        Object object2 = this.i.zzb();
        return new zzeco(context0, ((Executor)object0), zzcfv.zza, zzcah0, zzcsm0, zzcag0, ((ArrayDeque)object1), zzect0, ((zzfhu)object2), null);
    }
}

