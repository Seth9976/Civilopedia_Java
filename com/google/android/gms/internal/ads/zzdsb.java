package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzdsb implements Callable {
    public final zza a;
    public final Context b;
    public final zzdwh c;
    public final zzfgp d;
    public final zzees e;
    public final Executor f;
    public final zzaoc g;
    public final zzcfo h;
    public final zzfii i;

    public zzdsb(Context context0, Executor executor0, zzaoc zzaoc0, zzcfo zzcfo0, zza zza0, zzclu zzclu0, zzees zzees0, zzfii zzfii0, zzdwh zzdwh0, zzfgp zzfgp0) {
        this.b = context0;
        this.f = executor0;
        this.g = zzaoc0;
        this.h = zzcfo0;
        this.a = zza0;
        this.e = zzees0;
        this.i = zzfii0;
        this.c = zzdwh0;
        this.d = zzfgp0;
    }

    @Override
    public final Object call() throws Exception {
        zzdse zzdse0 = new zzdse(this);
        zzdse0.zzh();
        return zzdse0;
    }
}

