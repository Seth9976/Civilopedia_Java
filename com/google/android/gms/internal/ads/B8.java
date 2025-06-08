package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class b8 extends e8 {
    public zzfre t;
    public final boolean u;
    public final boolean v;
    public static final Logger w;

    static {
        b8.w = Logger.getLogger(b8.class.getName());
    }

    public b8(zzfre zzfre0, boolean z, boolean z1) {
        this.p = null;
        this.q = zzfre0.size();
        this.t = zzfre0;
        this.u = z;
        this.v = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final String d() {
        zzfre zzfre0 = this.t;
        if(zzfre0 != null) {
            zzfre0.toString();
            return "futures=" + zzfre0.toString();
        }
        return super.d();
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final void e() {
        zzfre zzfre0 = this.t;
        boolean z = true;
        this.u(1);
        boolean z1 = this.isCancelled();
        if(zzfre0 == null) {
            z = false;
        }
        if(z && z1) {
            boolean z2 = this.k();
            zzfti zzfti0 = zzfre0.zze();
            while(zzfti0.hasNext()) {
                Object object0 = zzfti0.next();
                ((Future)object0).cancel(z2);
            }
        }
    }

    public final void o(int v, Future future0) {
        try {
            this.r(v, zzfvc.zzp(future0));
        }
        catch(ExecutionException executionException0) {
            this.q(executionException0.getCause());
        }
        catch(RuntimeException | Error runtimeException0) {
            this.q(runtimeException0);
        }
    }

    public final void p(zzfre zzfre0) {
        int v = e8.r.b(this);
        zzfou.zzi(v >= 0, "Less than 0 remaining futures");
        if(v == 0) {
            if(zzfre0 != null) {
                zzfti zzfti0 = zzfre0.zze();
                for(int v1 = 0; zzfti0.hasNext(); ++v1) {
                    Object object0 = zzfti0.next();
                    Future future0 = (Future)object0;
                    if(!future0.isCancelled()) {
                        this.o(v1, future0);
                    }
                }
            }
            this.p = null;
            this.s();
            this.u(2);
        }
    }

    public final void q(Throwable throwable0) {
        throwable0.getClass();
        if(this.u && !this.zze(throwable0)) {
            Set set0 = this.p;
            if(set0 == null) {
                Set set1 = Collections.newSetFromMap(new ConcurrentHashMap());
                set1.getClass();
                if(!this.isCancelled()) {
                    Throwable throwable1 = this.a();
                    throwable1.getClass();
                    while(throwable1 != null && set1.add(throwable1)) {
                        throwable1 = throwable1.getCause();
                    }
                }
                e8.r.u(this, set1);
                set0 = this.p;
                set0.getClass();
            }
            Throwable throwable2 = throwable0;
            while(throwable2 != null) {
                if(!set0.add(throwable2)) {
                    goto label_22;
                }
                throwable2 = throwable2.getCause();
            }
            b8.w.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", (throwable0 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first"), throwable0);
            return;
        }
    label_22:
        if(throwable0 instanceof Error) {
            b8.w.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", (throwable0 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first"), throwable0);
        }
    }

    public abstract void r(int arg1, Object arg2);

    public abstract void s();

    public final void t() {
        zzfre zzfre0 = this.t;
        zzfre0.getClass();
        if(zzfre0.isEmpty()) {
            this.s();
            return;
        }
        j8 j80 = j8.i;
        if(this.u) {
            zzfti zzfti0 = this.t.zze();
            for(int v = 0; zzfti0.hasNext(); ++v) {
                Object object0 = zzfti0.next();
                ((zzfvl)object0).zzc(new zzfua(this, ((zzfvl)object0), v), j80);
            }
            return;
        }
        zzfub zzfub0 = new zzfub(this, (this.v ? this.t : null));
        zzfti zzfti1 = this.t.zze();
        while(zzfti1.hasNext()) {
            Object object1 = zzfti1.next();
            ((zzfvl)object1).zzc(zzfub0, j80);
        }
    }

    public abstract void u(int arg1);
}

