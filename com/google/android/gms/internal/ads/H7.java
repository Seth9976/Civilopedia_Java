package com.google.android.gms.internal.ads;

import java.util.Iterator;

public final class h7 extends zzfpm {
    public final Iterator k;
    public final zzfov l;

    public h7(Iterator iterator0, zzfov zzfov0) {
        this.k = iterator0;
        this.l = zzfov0;
        this.j = 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpm
    public final Object zza() {
        while(true) {
            Iterator iterator0 = this.k;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(this.l.zza(object0)) {
                return object0;
            }
        }
        this.j = 3;
        return null;
    }
}

