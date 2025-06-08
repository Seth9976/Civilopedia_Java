package com.google.android.gms.internal.measurement;

import A.f;
import java.util.Map.Entry;

public final class y0 implements Comparable, Map.Entry {
    public final Comparable i;
    public Object j;
    public final u0 k;

    public y0(u0 u00, Comparable comparable0, Object object0) {
        this.k = u00;
        this.i = comparable0;
        this.j = object0;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.i.compareTo(((y0)object0).i);
    }

    @Override
    public final boolean equals(Object object0) {
        boolean z;
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Map.Entry)) {
            return false;
        }
        Object object1 = ((Map.Entry)object0).getKey();
        Comparable comparable0 = this.i;
        if(comparable0 != null) {
            z = comparable0.equals(object1);
        }
        else if(object1 != null) {
            z = false;
        }
        else {
            z = true;
        }
        if(z) {
            Object object2 = this.j;
            Object object3 = ((Map.Entry)object0).getValue();
            return object2 == null ? object3 == null : object2.equals(object3);
        }
        return false;
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
    public final int hashCode() {
        int v = 0;
        int v1 = this.i == null ? 0 : this.i.hashCode();
        Object object0 = this.j;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public final Object setValue(Object object0) {
        this.k.f();
        Object object1 = this.j;
        this.j = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return f.i(String.valueOf(this.i), "=", String.valueOf(this.j));
    }
}

