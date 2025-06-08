package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public final class x8 extends k8 implements RunnableFuture {
    public volatile p8 p;

    public x8(Callable callable0) {
        this.p = new w8(this, callable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final String d() {
        p8 p80 = this.p;
        return p80 == null ? super.d() : "task=[" + p80 + "]";
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final void e() {
        if(this.k()) {
            p8 p80 = this.p;
            if(p80 != null) {
                p80.g();
            }
        }
        this.p = null;
    }

    @Override
    public final void run() {
        p8 p80 = this.p;
        if(p80 != null) {
            p80.run();
        }
        this.p = null;
    }
}

