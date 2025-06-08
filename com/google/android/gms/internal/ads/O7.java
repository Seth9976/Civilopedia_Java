package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public final class o7 extends zzfsl {
    public final Comparator a;

    public o7(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsl
    public final Map a() {
        return new TreeMap(this.a);
    }
}

