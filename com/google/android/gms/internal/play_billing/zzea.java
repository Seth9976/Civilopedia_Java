package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.X7;
import sun.misc.Unsafe;

public final class zzea {
    public static boolean zza(Unsafe unsafe0, Object object0, long v, Object object1, Object object2) {
        do {
            if(X7.a(unsafe0, object0, v, object1, object2)) {
                return true;
            }
        }
        while(unsafe0.getObject(object0, v) == object1);
        return false;
    }
}

