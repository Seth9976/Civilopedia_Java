package com.google.android.gms.measurement.internal;

import D3.b;
import android.os.Looper;
import com.google.android.gms.internal.ads.K;
import com.google.android.gms.internal.measurement.zzby;
import g1.n;
import i1.a0;
import i1.p;

public final class zzko extends p {
    public zzby c;
    public final b d;
    public final K e;
    public final n f;

    public zzko(zzge zzge0) {
        super(zzge0);
        this.d = new b(this, 22);
        K k0 = new K();  // 初始化器: Ljava/lang/Object;-><init>()V
        k0.l = this;
        k0.k = new a0(k0, this.a, 0);
        long v = this.a.zzav().elapsedRealtime();
        k0.i = v;
        k0.j = v;
        this.e = k0;
        this.f = new n(this);
    }

    @Override  // i1.p
    public final boolean b() {
        return false;
    }

    public final void c() {
        this.zzg();
        if(this.c == null) {
            this.c = new zzby(Looper.getMainLooper());
        }
    }
}

