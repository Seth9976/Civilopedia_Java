package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

public final class d7 extends S6 implements Serializable {
    public final Object i;
    public final List j;

    public d7(List list0, Object object0) {
        this.i = object0;
        this.j = list0;
    }

    @Override
    public final Object getKey() {
        return this.i;
    }

    @Override
    public final Object getValue() {
        return this.j;
    }

    @Override
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException();
    }
}

