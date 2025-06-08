package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Objects;

public final class s extends zzco {
    public final t k;

    public s(t t0) {
        this.k = t0;
        super();
    }

    @Override
    public final Object get(int v) {
        zzbe.zza(v, this.k.m, "index");
        int v1 = v + v;
        Object object0 = this.k.l[v1];
        Objects.requireNonNull(object0);
        Object object1 = this.k.l[v1 + 1];
        Objects.requireNonNull(object1);
        return new AbstractMap.SimpleImmutableEntry(object0, object1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean j() {
        return true;
    }

    @Override
    public final int size() {
        return this.k.m;
    }
}

