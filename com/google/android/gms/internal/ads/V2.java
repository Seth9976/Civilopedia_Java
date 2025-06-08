package com.google.android.gms.internal.ads;

import i3.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class v2 implements ThreadFactory {
    public final int a;
    public final AtomicInteger b;

    public v2(int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = new AtomicInteger(1);
            return;
        }
        super();
        this.b = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return this.a == 0 ? new Thread(runnable0, e.d(this.b.getAndIncrement(), "AdWorker(SCION_TASK_EXECUTOR) #")) : new Thread(runnable0, e.d(this.b.getAndIncrement(), "AdWorker(NG) #"));
    }
}

