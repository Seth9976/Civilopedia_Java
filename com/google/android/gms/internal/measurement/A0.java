package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a0 extends c0 {
    public static final Class c;

    static {
        a0.c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a(long v, Object object0) {
        List list1;
        List list0 = (List)F0.c.m(v, object0);
        if(list0 instanceof zzkt) {
            list1 = ((zzkt)list0).zze();
        }
        else {
            Class class0 = list0.getClass();
            if(a0.c.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof o0 && list0 instanceof zzkl) {
                if(((zzkl)list0).zzc()) {
                    ((zzkl)list0).zzb();
                }
                return;
            }
            list1 = Collections.unmodifiableList(list0);
        }
        F0.o(v, object0, list1);
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void b(zzke zzke0, zzke zzke1, long v) {
        ArrayList arrayList0;
        List list0 = (List)F0.c.m(v, zzke1);
        int v1 = list0.size();
        List list1 = (List)F0.c.m(v, zzke0);
        if(list1.isEmpty()) {
            if(list1 instanceof zzkt) {
                list1 = new zzks(v1);
            }
            else if(!(list1 instanceof o0) || !(list1 instanceof zzkl)) {
                list1 = new ArrayList(v1);
            }
            else {
                list1 = ((zzkl)list1).zzd(v1);
            }
            F0.o(v, zzke0, list1);
        }
        else {
            Class class0 = list1.getClass();
            if(a0.c.isAssignableFrom(class0)) {
                arrayList0 = new ArrayList(list1.size() + v1);
                arrayList0.addAll(list1);
                F0.o(v, zzke0, arrayList0);
                list1 = arrayList0;
            }
            else if(list1 instanceof zzms) {
                arrayList0 = new zzks(list1.size() + v1);
                ((zzks)arrayList0).addAll(((zzks)arrayList0).size(), ((zzms)list1));
                F0.o(v, zzke0, arrayList0);
                list1 = arrayList0;
            }
            else if(list1 instanceof o0 && list1 instanceof zzkl && !((zzkl)list1).zzc()) {
                list1 = ((zzkl)list1).zzd(list1.size() + v1);
                F0.o(v, zzke0, list1);
            }
        }
        int v2 = list1.size();
        if(v2 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v2 > 0) {
            list0 = list1;
        }
        F0.o(v, zzke0, list0);
    }
}

