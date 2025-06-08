package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzct {
    public final zzfrj a;
    public static final zzct zza;
    public static final zzl zzb;

    static {
        zzct.zza = new zzct(zzfrj.zzo());
        zzct.zzb = zzcq.zza;
    }

    public zzct(List list0) {
        this.a = zzfrj.zzm(list0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzct.class == class0 ? this.a.equals(((zzct)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final zzfrj zza() {
        return this.a;
    }

    public final boolean zzb(int v) {
        for(int v1 = 0; true; ++v1) {
            zzfrj zzfrj0 = this.a;
            if(v1 >= zzfrj0.size()) {
                break;
            }
            zzcs zzcs0 = (zzcs)zzfrj0.get(v1);
            if(zzcs0.zzc() && zzcs0.zza() == v) {
                return true;
            }
        }
        return false;
    }
}

