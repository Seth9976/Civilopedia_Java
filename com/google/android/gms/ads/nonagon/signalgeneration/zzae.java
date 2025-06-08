package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbdw;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class zzae {
    public final String a;

    public zzae(zzac zzac0) {
        this.a = zzac0.a;
    }

    public final zzbdw zza() {
        switch(this.a) {
            case "BANNER": {
                return zzbdw.zzb;
            }
            case "INTERSTITIAL": {
                return zzbdw.zzd;
            }
            case "NATIVE": {
                return zzbdw.zzg;
            }
            case "REWARDED": {
                return zzbdw.zzh;
            }
            default: {
                return zzbdw.zza;
            }
        }
    }

    public final String zzb() {
        return this.a.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        Set set0 = new HashSet();
        ((HashSet)set0).add(this.a.toLowerCase(Locale.ROOT));
        return set0;
    }
}

