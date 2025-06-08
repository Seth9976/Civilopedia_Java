package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class zzfrp {
    public static void a(List list0, zzfov zzfov0, int v, int v1) {
        int v2 = list0.size();
        while(true) {
            --v2;
            if(v2 <= v1) {
                break;
            }
            if(zzfov0.zza(list0.get(v2))) {
                list0.remove(v2);
            }
        }
        while(true) {
            --v1;
            if(v1 < v) {
                break;
            }
            list0.remove(v1);
        }
    }

    public static boolean zza(Iterable iterable0, zzfov zzfov0) {
        boolean z = false;
        if(iterable0 instanceof RandomAccess && iterable0 instanceof List) {
            List list0 = (List)iterable0;
            zzfov0.getClass();
            int v = 0;
            int v1 = 0;
            while(v < list0.size()) {
                Object object0 = list0.get(v);
                if(!zzfov0.zza(object0)) {
                    if(v > v1) {
                        try {
                            list0.set(v1, object0);
                        }
                        catch(UnsupportedOperationException unused_ex) {
                            zzfrp.a(list0, zzfov0, v1, v);
                            return true;
                        }
                        catch(IllegalArgumentException unused_ex) {
                            zzfrp.a(list0, zzfov0, v1, v);
                            return true;
                        }
                    }
                    ++v1;
                }
                ++v;
            }
            list0.subList(v1, list0.size()).clear();
            return v != v1;
        }
        Iterator iterator0 = iterable0.iterator();
        zzfov0.getClass();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(zzfov0.zza(object1)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }
}

