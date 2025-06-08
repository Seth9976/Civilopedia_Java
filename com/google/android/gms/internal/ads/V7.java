package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

public final class v7 extends zzfro {
    public final transient y7 k;
    public final transient Object[] l;
    public final transient int m;

    public v7(y7 y70, Object[] arr_object, int v) {
        this.k = y70;
        this.l = arr_object;
        this.m = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int a(int v, Object[] arr_object) {
        return this.zzd().a(v, arr_object);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean contains(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return object2 != null && object2.equals(this.k.get(object1));
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final Iterator iterator() {
        return this.zzd().zzu(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final zzfrj m() {
        return new u7(this);
    }

    @Override
    public final int size() {
        return this.m;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final zzfti zze() {
        return this.zzd().zzu(0);
    }
}

