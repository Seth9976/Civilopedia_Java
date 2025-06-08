package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

@Deprecated
public final class zzfwy {
    @Deprecated
    public static final zzfwt zza(byte[] arr_b) throws GeneralSecurityException {
        try {
            zzgfw zzgfw0 = zzgfw.zzg(arr_b, zzgkc.zza());
            Iterator iterator0 = zzgfw0.zzh().iterator();
        alab1:
            while(true) {
                if(!iterator0.hasNext()) {
                    return zzfwt.a(zzgfw0);
                }
                Object object0 = iterator0.next();
                switch(((zzgfv)object0).zzc().zzi()) {
                    case 2: 
                    case 3: 
                    case 4: {
                        break alab1;
                    }
                }
            }
            throw new GeneralSecurityException("keyset contains secret key material");
        }
        catch(zzglc unused_ex) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}

