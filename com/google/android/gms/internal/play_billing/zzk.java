package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class zzk {
    public static boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Object object0, Object object1, Object object2) {
        do {
            if(atomicReferenceFieldUpdater0.compareAndSet(object0, object1, object2)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(object0) == object1 || atomicReferenceFieldUpdater0.get(object0) == object1);
        return false;
    }
}

