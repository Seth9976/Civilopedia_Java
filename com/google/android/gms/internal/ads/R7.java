package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class r7 extends U6 implements zzfru, Serializable {
    public final transient Map l;
    public transient int m;
    public final transient p7 n;

    public r7(Map map0, p7 p70) {
        zzfou.zze(map0.isEmpty());
        this.l = map0;
        this.n = p70;
    }

    public final Collection a() {
        return this.n.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzfsf
    public final int zzh() {
        return this.m;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsf
    public final void zzr() {
        Map map0 = this.l;
        for(Object object0: map0.values()) {
            ((Collection)object0).clear();
        }
        map0.clear();
        this.m = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsf
    public final boolean zzs(Object object0, Object object1) {
        Map map0 = this.l;
        Collection collection0 = (Collection)map0.get(object0);
        if(collection0 == null) {
            Collection collection1 = this.a();
            if(!((ArrayList)collection1).add(object1)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            ++this.m;
            map0.put(object0, collection1);
            return true;
        }
        if(collection0.add(object1)) {
            ++this.m;
            return true;
        }
        return false;
    }
}

