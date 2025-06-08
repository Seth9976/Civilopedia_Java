package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map.Entry;

public final class t0 implements Iterator {
    public final Iterator i;

    public t0(Iterator iterator0) {
        this.i = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.i.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.i.next();
        return ((Map.Entry)object0).getValue() instanceof zzhw ? new s0(((Map.Entry)object0)) : ((Map.Entry)object0);
    }

    @Override
    public final void remove() {
        this.i.remove();
    }
}

