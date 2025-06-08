package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

public final class zzbd {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public zzbd() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final zzbd zza(String s, double f, double f1) {
        ArrayList arrayList2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        int v;
        for(v = 0; true; ++v) {
            arrayList0 = this.a;
            arrayList1 = this.b;
            arrayList2 = this.c;
            if(v >= arrayList0.size()) {
                break;
            }
            double f2 = (double)(((Double)arrayList2.get(v)));
            if(f < f2 || f2 == f && f1 < ((double)(((Double)arrayList1.get(v))))) {
                break;
            }
        }
        arrayList0.add(v, s);
        arrayList2.add(v, f);
        arrayList1.add(v, f1);
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this);
    }
}

