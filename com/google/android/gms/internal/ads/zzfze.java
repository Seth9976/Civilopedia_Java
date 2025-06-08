package com.google.android.gms.internal.ads;

import java.util.logging.Level;

public final class zzfze {
    public static boolean zza(int v) {
        if(v - 1 != 0) {
            if(zzfzf.zzb()) {
                try {
                    return ((Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null)).booleanValue();
                }
                catch(Exception unused_ex) {
                    zzfzf.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    return false;
                }
            }
            return true;
        }
        return !zzfzf.zzb();
    }
}

