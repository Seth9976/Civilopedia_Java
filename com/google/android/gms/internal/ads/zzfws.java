package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

public final class zzfws {
    public static zzfwr zza(String s) throws GeneralSecurityException {
        synchronized(zzfxk.class) {
            Map map0 = Collections.unmodifiableMap(zzfxk.g);
        }
        if(!map0.containsKey(s)) {
            throw new GeneralSecurityException("cannot find key template: " + s);
        }
        return (zzfwr)zzfxk.a().get(s);
    }
}

