package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzfgm {
    public final Executor a;
    public final zzcfn b;

    public zzfgm(Executor executor0, zzcfn zzcfn0) {
        this.a = executor0;
        this.b = zzcfn0;
    }

    public final void zzb(String s) {
        zzfgl zzfgl0 = new zzfgl(this, s);
        this.a.execute(zzfgl0);
    }
}

