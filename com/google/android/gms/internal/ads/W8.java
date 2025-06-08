package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class w8 extends p8 {
    public final int k;
    public final x8 l;
    public final Object m;

    public w8(x8 x80, zzfui zzfui0) {
        this.k = 0;
        this.l = x80;
        super();
        zzfui0.getClass();
        this.m = zzfui0;
    }

    public w8(x8 x80, Callable callable0) {
        this.k = 1;
        this.l = x80;
        super();
        callable0.getClass();
        this.m = callable0;
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final Object a() {
        if(this.k != 0) {
            return ((Callable)this.m).call();
        }
        zzfvl zzfvl0 = ((zzfui)this.m).zza();
        zzfou.zzd(zzfvl0, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ((zzfui)this.m));
        return zzfvl0;
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final String b() {
        return this.k == 0 ? ((zzfui)this.m).toString() : ((Callable)this.m).toString();
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final void d(Throwable throwable0) {
        if(this.k != 0) {
            this.l.zze(throwable0);
            return;
        }
        this.l.zze(throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final void e(Object object0) {
        if(this.k != 0) {
            this.l.zzd(object0);
            return;
        }
        this.l.j(((zzfvl)object0));
    }

    @Override  // com.google.android.gms.internal.ads.p8
    public final boolean f() {
        return this.l.isDone();
    }
}

