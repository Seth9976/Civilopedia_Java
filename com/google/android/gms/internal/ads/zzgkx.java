package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

public final class zzgkx extends AbstractList {
    public final List i;
    public final zzgkw j;

    public zzgkx(List list0, zzgkw zzgkw0) {
        this.i = list0;
        this.j = zzgkw0;
    }

    @Override
    public final Object get(int v) {
        zzbek zzbek0 = zzbek.zzb(((int)(((Integer)this.i.get(v)))));
        return zzbek0 == null ? zzbek.zza : zzbek0;
    }

    @Override
    public final int size() {
        return this.i.size();
    }
}

