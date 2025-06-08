package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public abstract class a8 extends k8 implements Runnable {
    public zzfvl p;
    public Object q;
    public static final int r;

    public a8(Object object0, zzfvl zzfvl0) {
        zzfvl0.getClass();
        this.p = zzfvl0;
        object0.getClass();
        this.q = object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final String d() {
        zzfvl zzfvl0 = this.p;
        Object object0 = this.q;
        String s = super.d();
        String s1 = zzfvl0 == null ? "" : "inputFuture=[" + zzfvl0 + "], ";
        if(object0 != null) {
            return s1 + "function=[" + object0 + "]";
        }
        return s == null ? null : s1 + s;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final void e() {
        this.i(this.p);
        this.p = null;
        this.q = null;
    }

    public abstract Object o(Object arg1, Object arg2);

    public abstract void p(Object arg1);

    @Override
    public final void run() {
        Object object2;
        Object object1;
        zzfvl zzfvl0 = this.p;
        Object object0 = this.q;
        if((this.isCancelled() | zzfvl0 == null | (object0 == null ? 1 : 0)) != 0) {
            return;
        }
        this.p = null;
        if(zzfvl0.isCancelled()) {
            this.j(zzfvl0);
            return;
        }
        try {
            object1 = zzfvc.zzp(zzfvl0);
        }
        catch(CancellationException unused_ex) {
            this.cancel(false);
            return;
        }
        catch(ExecutionException executionException0) {
            this.zze(executionException0.getCause());
            return;
        }
        catch(RuntimeException runtimeException0) {
            this.zze(runtimeException0);
            return;
        }
        catch(Error error0) {
            this.zze(error0);
            return;
        }
        try {
            object2 = this.o(object0, object1);
        }
        catch(Throwable throwable0) {
            try {
                this.zze(throwable0);
                this.q = null;
                return;
            }
            catch(Throwable throwable1) {
                this.q = null;
                throw throwable1;
            }
        }
        this.q = null;
        this.p(object2);
    }
}

