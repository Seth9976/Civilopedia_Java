package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzfki {
    public final ThreadPoolExecutor a;
    public final ArrayDeque b;
    public zzfkh c;

    public zzfki() {
        this.b = new ArrayDeque();
        this.c = null;
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        this.a = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue0);
    }

    public final void zza(zzfkh zzfkh0) {
        this.c = null;
        zzfkh zzfkh1 = (zzfkh)this.b.poll();
        this.c = zzfkh1;
        if(zzfkh1 != null) {
            zzfkh1.executeOnExecutor(this.a, new Object[0]);
        }
    }

    public final void zzb(zzfkh zzfkh0) {
        zzfkh0.zzb(this);
        ArrayDeque arrayDeque0 = this.b;
        arrayDeque0.add(zzfkh0);
        if(this.c == null) {
            zzfkh zzfkh1 = (zzfkh)arrayDeque0.poll();
            this.c = zzfkh1;
            if(zzfkh1 != null) {
                zzfkh1.executeOnExecutor(this.a, new Object[0]);
            }
        }
    }
}

