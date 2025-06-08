package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class zzaqo {
    public final HashMap a;

    public zzaqo() {
        this.a = new HashMap();
    }

    public final AtomicReference zza(String s) {
        synchronized(this) {
            if(!this.a.containsKey(s)) {
                AtomicReference atomicReference0 = new AtomicReference();
                this.a.put(s, atomicReference0);
            }
        }
        return (AtomicReference)this.a.get(s);
    }
}

