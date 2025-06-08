package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzgft extends zzgkm implements zzgmb {
    public final zzgft zza(zzgfv zzgfv0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzgfw.n(((zzgfw)this.j), zzgfv0);
        return this;
    }

    public final zzgft zzb(int v) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzgfw.m(((zzgfw)this.j), v);
        return this;
    }

    public final List zzc() {
        return Collections.unmodifiableList(((zzgfw)this.j).zzh());
    }
}

