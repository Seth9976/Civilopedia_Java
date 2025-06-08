package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

public final class zzfrt {
    public static boolean zzc(Collection collection0, Iterator iterator0) {
        boolean z;
        for(z = false; iterator0.hasNext(); z |= collection0.add(object0)) {
            Object object0 = iterator0.next();
        }
        return z;
    }
}

