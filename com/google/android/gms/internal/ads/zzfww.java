package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzfww {
    public static final CopyOnWriteArrayList a;

    static {
        zzfww.a = new CopyOnWriteArrayList();
    }

    public static zzfwv zza(String s) throws GeneralSecurityException {
        for(Object object0: zzfww.a) {
            zzfwv zzfwv0 = (zzfwv)object0;
            if(zzfwv0.zza()) {
                return zzfwv0;
            }
            if(false) {
                break;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + s);
    }
}

