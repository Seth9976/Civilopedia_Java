package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

public final class zzbon implements zzbom {
    public final zzdzb a;

    public zzbon(zzdzb zzdzb0) {
        Preconditions.checkNotNull(zzdzb0, "The Inspector Manager must not be null");
        this.a = zzdzb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        long v = 0x7FFFFFFFFFFFFFFFL;
        if(map0 != null && map0.containsKey("extras")) {
            if(map0.containsKey("expires")) {
                try {
                    v = Long.parseLong(((String)map0.get("expires")));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            String s = (String)map0.get("extras");
            this.a.zzh(s, v);
        }
    }
}

