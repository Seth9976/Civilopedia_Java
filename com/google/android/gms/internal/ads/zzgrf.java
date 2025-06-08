package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class zzgrf implements zzgqu {
    public final List a;
    public final List b;
    public static final zzgqu c;

    static {
        zzgrf.c = zzgqv.zza(Collections.emptySet());
    }

    public zzgrf(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    public static zzgre zza(int v, int v1) {
        return new zzgre(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zzc();
    }

    public final Set zzc() {
        int v4;
        List list0 = this.a;
        int v = list0.size();
        List list1 = this.b;
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v1 = list1.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Collection collection0 = (Collection)((zzgrh)list1.get(v3)).zzb();
            v += collection0.size();
            arrayList0.add(collection0);
        }
        if(v < 3) {
            v4 = v + 1;
        }
        else {
            v4 = v >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v) / 0.75f + 1.0f));
        }
        HashSet hashSet0 = new HashSet(v4);
        int v5 = list0.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            Object object0 = ((zzgrh)list0.get(v6)).zzb();
            object0.getClass();
            hashSet0.add(object0);
        }
        int v7 = arrayList0.size();
        for(int v2 = 0; v2 < v7; ++v2) {
            for(Object object1: ((Collection)arrayList0.get(v2))) {
                object1.getClass();
                hashSet0.add(object1);
            }
        }
        return Collections.unmodifiableSet(hashSet0);
    }
}

