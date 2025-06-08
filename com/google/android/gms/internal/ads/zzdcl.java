package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdcl extends zzdhc {
    public boolean j;

    public zzdcl(Set set0) {
        super(set0);
        this.j = false;
    }

    public final void zza() {
        synchronized(this) {
            if(!this.j) {
                this.a(zzdck.zza);
                this.j = true;
            }
        }
    }
}

