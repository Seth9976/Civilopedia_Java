package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzgql extends AbstractList {
    public final List i;
    public final Iterator j;
    public static final zzgqm k;

    static {
        zzgql.k = zzgqm.zzb(zzgql.class);
    }

    public zzgql(List list0, Iterator iterator0) {
        this.i = list0;
        this.j = iterator0;
    }

    @Override
    public final Object get(int v) {
        List list0 = this.i;
        if(list0.size() > v) {
            return list0.get(v);
        }
        Iterator iterator0 = this.j;
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        list0.add(object0);
        return this.get(v);
    }

    @Override
    public final Iterator iterator() {
        return new ma(this);
    }

    @Override
    public final int size() {
        List list0;
        zzgql.k.zza("potentially expensive size() call");
        zzgql.k.zza("blowup running");
        while(true) {
            Iterator iterator0 = this.j;
            boolean z = iterator0.hasNext();
            list0 = this.i;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            list0.add(object0);
        }
        return list0.size();
    }
}

