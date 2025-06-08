package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class v8 extends k8 {
    public zzfvl p;
    public ScheduledFuture q;

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final String d() {
        zzfvl zzfvl0 = this.p;
        ScheduledFuture scheduledFuture0 = this.q;
        if(zzfvl0 != null) {
            String s = "inputFuture=[" + zzfvl0 + "]";
            if(scheduledFuture0 != null) {
                long v = scheduledFuture0.getDelay(TimeUnit.MILLISECONDS);
                return v <= 0L ? s : s + ", remaining delay=[" + v + " ms]";
            }
            return s;
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final void e() {
        this.i(this.p);
        ScheduledFuture scheduledFuture0 = this.q;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.p = null;
        this.q = null;
    }
}

