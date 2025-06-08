package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzao extends zzai implements zzal {
    public final ArrayList k;
    public final ArrayList l;
    public final zzg m;

    public zzao(zzao zzao0) {
        super(zzao0.i);
        ArrayList arrayList0 = new ArrayList(zzao0.k.size());
        this.k = arrayList0;
        arrayList0.addAll(zzao0.k);
        ArrayList arrayList1 = new ArrayList(zzao0.l.size());
        this.l = arrayList1;
        arrayList1.addAll(zzao0.l);
        this.m = zzao0.m;
    }

    public zzao(String s, List list0, List list1, zzg zzg0) {
        super(s);
        this.k = new ArrayList();
        this.m = zzg0;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                String s1 = ((zzap)object0).zzi();
                this.k.add(s1);
            }
        }
        this.l = new ArrayList(list1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzg0, List list0) {
        zzg zzg1 = this.m.zza();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.k;
            if(v >= arrayList0.size()) {
                break;
            }
            if(v < list0.size()) {
                zzg1.zze(((String)arrayList0.get(v)), zzg0.zzb(((zzap)list0.get(v))));
            }
            else {
                zzg1.zze(((String)arrayList0.get(v)), zzap.zzf);
            }
        }
        for(Object object0: this.l) {
            zzap zzap0 = (zzap)object0;
            zzap zzap1 = zzg1.zzb(zzap0);
            if(zzap1 instanceof zzaq) {
                zzap1 = zzg1.zzb(zzap0);
            }
            if(zzap1 instanceof zzag) {
                return ((zzag)zzap1).zzb();
            }
            if(false) {
                break;
            }
        }
        return zzap.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzai
    public final zzap zzd() {
        return new zzao(this);
    }
}

