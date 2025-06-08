package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

public final class i extends j implements Iterable {
    public final ArrayList i;

    public i() {
        this.i = new ArrayList();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof i && ((i)object0).i.equals(this.i);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.i.iterator();
    }
}

