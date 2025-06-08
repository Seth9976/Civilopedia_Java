package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class z9 extends B9 {
    public static final Class c;

    static {
        z9.c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    @Override  // com.google.android.gms.internal.ads.B9
    public final List a(long v, Object object0) {
        return z9.d(object0, v, 10);
    }

    @Override  // com.google.android.gms.internal.ads.B9
    public final void b(long v, Object object0) {
        List list1;
        List list0 = (List)ia.c.o(v, object0);
        if(list0 instanceof zzgli) {
            list1 = ((zzgli)list0).zze();
        }
        else {
            Class class0 = list0.getClass();
            if(z9.c.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof M9 && list0 instanceof zzgkz) {
                if(((zzgkz)list0).zzc()) {
                    ((zzgkz)list0).zzb();
                }
                return;
            }
            list1 = Collections.unmodifiableList(list0);
        }
        ia.r(v, object0, list1);
    }

    @Override  // com.google.android.gms.internal.ads.B9
    public final void c(zzgkq zzgkq0, zzgkq zzgkq1, long v) {
        List list0 = (List)ia.c.o(v, zzgkq1);
        List list1 = z9.d(zzgkq0, v, list0.size());
        int v1 = list1.size();
        if(v1 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v1 > 0) {
            list0 = list1;
        }
        ia.r(v, zzgkq0, list0);
    }

    public static List d(Object object0, long v, int v1) {
        ArrayList arrayList0;
        List list0 = (List)ia.c.o(v, object0);
        if(list0.isEmpty()) {
            if(list0 instanceof zzgli) {
                list0 = new zzglh(v1);
            }
            else if(!(list0 instanceof M9) || !(list0 instanceof zzgkz)) {
                list0 = new ArrayList(v1);
            }
            else {
                list0 = ((zzgkz)list0).zzd(v1);
            }
            ia.r(v, object0, list0);
            return list0;
        }
        Class class0 = list0.getClass();
        if(z9.c.isAssignableFrom(class0)) {
            arrayList0 = new ArrayList(list0.size() + v1);
            arrayList0.addAll(list0);
            ia.r(v, object0, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof zzgnp) {
            arrayList0 = new zzglh(list0.size() + v1);
            ((zzglh)arrayList0).addAll(((zzglh)arrayList0).size(), ((zzgnp)list0));
            ia.r(v, object0, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof M9 && list0 instanceof zzgkz && !((zzgkz)list0).zzc()) {
            List list1 = ((zzgkz)list0).zzd(list0.size() + v1);
            ia.r(v, object0, list1);
            return list1;
        }
        return list0;
    }
}

