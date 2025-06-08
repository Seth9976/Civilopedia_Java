package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbtt {
    public final AtomicBoolean a;
    public static zzbtt b;

    public zzbtt() {
        this.a = new AtomicBoolean(false);
    }

    public static zzbtt zza() {
        if(zzbtt.b == null) {
            zzbtt.b = new zzbtt();
        }
        return zzbtt.b;
    }

    public final Thread zzb(Context context0, String s) {
        if(!this.a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread0 = new Thread(new zzbts(this, context0, s));
        thread0.start();
        return thread0;
    }
}

