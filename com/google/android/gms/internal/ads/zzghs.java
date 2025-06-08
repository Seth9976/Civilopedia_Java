package com.google.android.gms.internal.ads;

import i3.e;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzghs {
    public final zzgia a;
    public static final Logger b;
    public static final List c;
    public static final boolean d;
    public static final zzghs zza;
    public static final zzghs zzb;
    public static final zzghs zzc;
    public static final zzghs zzd;
    public static final zzghs zze;
    public static final zzghs zzf;
    public static final zzghs zzg;

    static {
        zzghs.b = Logger.getLogger(zzghs.class.getName());
        if(zzfzf.zzb()) {
            zzghs.c = zzghs.zzb(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"});
            zzghs.d = false;
        }
        else {
            zzghs.c = zzgil.zzb() ? zzghs.zzb(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"}) : new ArrayList();
            zzghs.d = true;
        }
        zzghs.zza = new zzghs(new zzght());
        zzghs.zzb = new zzghs(new zzghx());
        zzghs.zzc = new zzghs(new zzghz());
        zzghs.zzd = new zzghs(new zzghy());
        zzghs.zze = new zzghs(new zzghu());
        zzghs.zzf = new zzghs(new zzghw());
        zzghs.zzg = new zzghs(new zzghv());
    }

    public zzghs(zzgia zzgia0) {
        this.a = zzgia0;
    }

    public final Object zza(String s) throws GeneralSecurityException {
        zzgia zzgia0;
        Iterator iterator0 = zzghs.c.iterator();
        Throwable throwable0 = null;
        while(true) {
            boolean z = iterator0.hasNext();
            zzgia0 = this.a;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Provider provider0 = (Provider)object0;
            try {
                return zzgia0.zza(s, provider0);
            }
            catch(Exception exception0) {
                if(throwable0 != null) {
                    continue;
                }
                throwable0 = exception0;
            }
        }
        if(!zzghs.d) {
            throw new GeneralSecurityException("No good Provider found.", throwable0);
        }
        return zzgia0.zza(s, null);
    }

    public static List zzb(String[] arr_s) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Provider provider0 = Security.getProvider(s);
            if(provider0 == null) {
                zzghs.b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", e.f("Provider ", s, " not available"));
            }
            else {
                ((ArrayList)list0).add(provider0);
            }
        }
        return list0;
    }
}

