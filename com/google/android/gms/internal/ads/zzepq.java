package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

public final class zzepq implements zzetg {
    public final AtomicReference a;
    public final Clock b;
    public final zzetg c;
    public final long d;

    public zzepq(zzetg zzetg0, long v, Clock clock0) {
        this.a = new AtomicReference();
        this.b = clock0;
        this.c = zzetg0;
        this.d = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 16;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        AtomicReference atomicReference0 = this.a;
        C5 c50 = (C5)atomicReference0.get();
        if(c50 == null) {
            c50 = new C5(this.c.zzb(), this.d, this.b);
            atomicReference0.set(c50);
        }
        else {
            long v = c50.c.elapsedRealtime();
            if(c50.b < v) {
                c50 = new C5(this.c.zzb(), this.d, this.b);
                atomicReference0.set(c50);
                return c50.a;
            }
        }
        return c50.a;
    }
}

