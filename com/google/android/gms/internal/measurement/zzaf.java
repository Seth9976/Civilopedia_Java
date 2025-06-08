package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzaf implements zzap {
    public final boolean i;

    public zzaf(Boolean boolean0) {
        this.i = boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzaf ? this.i == ((zzaf)object0).i : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.i).hashCode();
    }

    @Override
    public final String toString() {
        return String.valueOf(this.i);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String s, zzg zzg0, List list0) {
        boolean z = this.i;
        if(!"toString".equals(s)) {
            throw new IllegalArgumentException(Boolean.toString(z) + "." + s + " is not a function.");
        }
        return new zzat(Boolean.toString(z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzaf(Boolean.valueOf(this.i));
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(this.i);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return this.i ? 1.0 : 0.0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return Boolean.toString(this.i);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}

