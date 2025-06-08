package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map.Entry;

public final class t extends zzcv {
    public final transient w k;
    public final transient Object[] l;
    public final transient int m;

    public t(w w0, Object[] arr_object, int v) {
        this.k = w0;
        this.l = arr_object;
        this.m = v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] arr_object) {
        return this.zzd().a(arr_object);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean contains(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return object2 != null && object2.equals(this.k.get(object1));
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final Iterator iterator() {
        return this.zzd().zzn(0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzco m() {
        return new s(this);
    }

    @Override
    public final int size() {
        return this.m;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzdw zze() {
        return this.zzd().zzn(0);
    }
}

