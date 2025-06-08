package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator {
    public final Iterator i;
    public final Iterator j;

    public a(Iterator iterator0, Iterator iterator1) {
        this.i = iterator0;
        this.j = iterator1;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.i.hasNext() ? true : this.j.hasNext();
    }

    @Override
    public final Object next() {
        Iterator iterator0 = this.i;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            return new zzat(((Integer)object0).toString());
        }
        Iterator iterator1 = this.j;
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        return new zzat(((String)object1));
    }
}

