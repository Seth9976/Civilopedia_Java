package com.google.android.gms.internal.play_billing;

import i3.e;
import java.util.Iterator;

public final class z extends zzcv {
    public final transient Object k;

    public z(Object object0) {
        this.k = object0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] arr_object) {
        arr_object[0] = this.k;
        return 1;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean contains(Object object0) {
        return this.k.equals(object0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final Iterator iterator() {
        return new m(this.k);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return e.f("[", this.k.toString(), "]");
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzco zzd() {
        return zzco.zzm(this.k);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzdw zze() {
        return new m(this.k);
    }
}

