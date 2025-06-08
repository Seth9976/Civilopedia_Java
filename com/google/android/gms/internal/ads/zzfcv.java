package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzfcv {
    public static boolean zza(AtomicReference atomicReference0, Object object0, Object object1) {
        do {
            if(atomicReference0.compareAndSet(null, object1)) {
                return true;
            }
        }
        while(atomicReference0.get() == null || atomicReference0.get() == null);
        return false;
    }
}

