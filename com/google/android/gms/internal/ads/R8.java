package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class r8 extends zzfuw implements ScheduledFuture {
    public final ScheduledFuture j;

    public r8(zzftt zzftt0, ScheduledFuture scheduledFuture0) {
        super(zzftt0);
        this.j = scheduledFuture0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuv
    public final boolean cancel(boolean z) {
        boolean z1 = this.i.cancel(z);
        if(z1) {
            this.j.cancel(z);
        }
        return z1;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.j.compareTo(((Delayed)object0));
    }

    @Override
    public final long getDelay(TimeUnit timeUnit0) {
        return this.j.getDelay(timeUnit0);
    }
}

