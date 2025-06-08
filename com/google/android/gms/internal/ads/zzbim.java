package com.google.android.gms.internal.ads;

import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbim {
    public final HashMap a;
    public final zzbio b;

    public zzbim(zzbio zzbio0) {
        this.b = zzbio0;
        this.a = new HashMap();
    }

    public final zzbio zza() {
        return this.b;
    }

    public final void zzb(String s, zzbil zzbil0) {
        this.a.put(s, zzbil0);
    }

    public final void zzc(String s, String s1, long v) {
        HashMap hashMap0 = this.a;
        zzbil zzbil0 = (zzbil)hashMap0.get(s1);
        String[] arr_s = {s};
        if(zzbil0 != null) {
            this.b.zze(zzbil0, v, arr_s);
        }
        hashMap0.put(s, new zzbil(v, null, null));
    }
}

