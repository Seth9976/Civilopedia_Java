package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzag implements zzap {
    public final zzap i;
    public final String j;

    public zzag() {
        throw null;
    }

    public zzag(String s) {
        this.i = zzap.zzf;
        this.j = s;
    }

    public zzag(String s, zzap zzap0) {
        this.i = zzap0;
        this.j = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzag ? this.j.equals(((zzag)object0).j) && this.i.equals(((zzag)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode() + this.j.hashCode() * 0x1F;
    }

    public final zzap zzb() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String s, zzg zzg0, List list0) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzap zzap0 = this.i.zzd();
        return new zzag(this.j, zzap0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}

