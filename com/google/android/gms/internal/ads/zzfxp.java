package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public final class zzfxp implements zzfxd {
    public static final Logger a;

    static {
        zzfxp.a = Logger.getLogger(zzfxp.class.getName());
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final Class zza() {
        return zzfwf.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final Class zzb() {
        return zzfwf.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final Object zzc(zzfxc zzfxc0) throws GeneralSecurityException {
        return new F8(zzfxc0);
    }
}

