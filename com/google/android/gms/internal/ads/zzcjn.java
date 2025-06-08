package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

public final class zzcjn implements Iterable {
    public final ArrayList i;

    public zzcjn() {
        this.i = new ArrayList();
    }

    @Override
    public final Iterator iterator() {
        return this.i.iterator();
    }

    public final void zzb(zzcjm zzcjm0) {
        this.i.add(zzcjm0);
    }

    public final void zzc(zzcjm zzcjm0) {
        this.i.remove(zzcjm0);
    }

    public final boolean zzd(zzchr zzchr0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this) {
            zzcjm zzcjm0 = (zzcjm)object0;
            if(zzcjm0.b == zzchr0) {
                arrayList0.add(zzcjm0);
            }
        }
        if(arrayList0.isEmpty()) {
            return false;
        }
        for(Object object1: arrayList0) {
            ((zzcjm)object1).c.zzb();
        }
        return true;
    }
}

