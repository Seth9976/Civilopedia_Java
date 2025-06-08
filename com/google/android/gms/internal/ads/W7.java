package com.google.android.gms.internal.ads;

import java.util.Iterator;

public final class w7 extends zzfro {
    public final transient y7 k;
    public final transient x7 l;

    public w7(y7 y70, x7 x70) {
        this.k = y70;
        this.l = x70;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int a(int v, Object[] arr_object) {
        return this.l.a(v, arr_object);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean contains(Object object0) {
        return this.k.get(object0) != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final Iterator iterator() {
        return this.l.zzu(0);
    }

    @Override
    public final int size() {
        return this.k.n;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final zzfrj zzd() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final zzfti zze() {
        return this.l.zzu(0);
    }
}

