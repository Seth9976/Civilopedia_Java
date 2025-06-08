package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public final class zzfte {
    public static int a(Set set0) {
        int v = 0;
        for(Object object0: set0) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    public static boolean b(Set set0, Object object0) {
        if(set0 == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set1 = (Set)object0;
            try {
                if(set0.size() == set1.size() && set0.containsAll(set1)) {
                    return true;
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public static boolean c(E7 e70, Collection collection0) {
        collection0.getClass();
        if(collection0 instanceof zzfso) {
            collection0 = ((zzfso)collection0).zza();
        }
        boolean z = false;
        if(collection0 instanceof Set && collection0.size() > e70.size()) {
            Iterator iterator0 = e70.iterator();
            collection0.getClass();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(collection0.contains(object0)) {
                    iterator0.remove();
                    z = true;
                }
            }
            return z;
        }
        for(Object object1: collection0) {
            z |= e70.remove(object1);
        }
        return z;
    }

    public static Set zzb(Set set0, zzfov zzfov0) {
        if(set0 instanceof SortedSet) {
            if(((SortedSet)set0) instanceof C7) {
                zzfov zzfov1 = zzfoy.zza(((C7)(((SortedSet)set0))).j, zzfov0);
                return new D7(((SortedSet)((C7)(((SortedSet)set0))).i), zzfov1);  // 初始化器: Lcom/google/android/gms/internal/ads/C7;-><init>(Ljava/util/Set;Lcom/google/android/gms/internal/ads/zzfov;)V
            }
            ((SortedSet)set0).getClass();
            zzfov0.getClass();
            return new D7(((SortedSet)set0), zzfov0);  // 初始化器: Lcom/google/android/gms/internal/ads/C7;-><init>(Ljava/util/Set;Lcom/google/android/gms/internal/ads/zzfov;)V
        }
        if(set0 instanceof C7) {
            zzfov zzfov2 = zzfoy.zza(((C7)set0).j, zzfov0);
            return new C7(((C7)set0).i, zzfov2);
        }
        set0.getClass();
        zzfov0.getClass();
        return new C7(set0, zzfov0);
    }
}

