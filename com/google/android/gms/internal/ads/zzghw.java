package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

public final class zzghw implements zzgia {
    @Override  // com.google.android.gms.internal.ads.zzgia
    public final Object zza(String s, Provider provider0) throws GeneralSecurityException {
        return provider0 == null ? KeyPairGenerator.getInstance(s) : KeyPairGenerator.getInstance(s, provider0);
    }
}

