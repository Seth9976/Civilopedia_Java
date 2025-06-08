package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final class zzhh {
    public static Object zza(zzhi zzhi0) {
        try {
            return zzhi0.zza();
        }
        catch(SecurityException unused_ex) {
            long v = Binder.clearCallingIdentity();
            try {
                return zzhi0.zza();
            }
            finally {
                Binder.restoreCallingIdentity(v);
            }
        }
    }
}

