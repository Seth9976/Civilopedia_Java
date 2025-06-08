package com.google.gson.internal;

import X1.a;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Excluder implements o, Cloneable {
    public final List i;
    public final List j;
    public static final Excluder k;

    static {
        Excluder.k = new Excluder();
    }

    public Excluder() {
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
    }

    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        boolean z2;
        boolean z1;
        boolean z = this.b(a0.a);
        if(z) {
            z1 = true;
        }
        else {
            this.c(true);
            z1 = false;
        }
        if(z) {
            z2 = true;
        }
        else {
            this.c(false);
            z2 = false;
        }
        return !z1 && !z2 ? null : new Excluder.1(this, z2, z1, h0, a0);
    }

    // 去混淆评级： 低(30)
    public final boolean b(Class class0) {
        return !Enum.class.isAssignableFrom(class0) && (class0.isAnonymousClass() || class0.isLocalClass());
    }

    public final void c(boolean z) {
        Iterator iterator0 = (z ? this.i : this.j).iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        Object object0 = iterator0.next();
        object0.getClass();
        throw new ClassCastException();
    }

    @Override
    public final Object clone() {
        try {
            return (Excluder)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }
}

