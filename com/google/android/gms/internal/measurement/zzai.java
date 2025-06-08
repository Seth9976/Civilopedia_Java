package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class zzai implements zzal, zzap {
    public final String i;
    public final HashMap j;

    public zzai(String s) {
        this.j = new HashMap();
        this.i = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzai)) {
            return false;
        }
        return this.i == null ? false : this.i.equals(((zzai)object0).i);
    }

    @Override
    public final int hashCode() {
        return this.i == null ? 0 : this.i.hashCode();
    }

    public abstract zzap zza(zzg arg1, List arg2);

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String s, zzg zzg0, List list0) {
        return "toString".equals(s) ? new zzat(this.i) : zzaj.zza(this, new zzat(s), zzg0, list0);
    }

    public final String zzc() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public zzap zzd() {
        return this;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String s) {
        return this.j.containsKey(s) ? ((zzap)this.j.get(s)) : zzap.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return NaN;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return zzaj.zzb(this.j);
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String s, zzap zzap0) {
        HashMap hashMap0 = this.j;
        if(zzap0 == null) {
            hashMap0.remove(s);
            return;
        }
        hashMap0.put(s, zzap0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String s) {
        return this.j.containsKey(s);
    }
}

