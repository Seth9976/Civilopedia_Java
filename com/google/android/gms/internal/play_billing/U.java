package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

public final class u extends zzcv {
    public final transient w k;
    public final transient v l;

    public u(w w0, v v0) {
        this.k = w0;
        this.l = v0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] arr_object) {
        return this.l.a(arr_object);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean contains(Object object0) {
        return this.k.get(object0) != null;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final Iterator iterator() {
        return this.l.zzn(0);
    }

    @Override
    public final int size() {
        return this.k.n;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzco zzd() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzdw zze() {
        return this.l.zzn(0);
    }
}

