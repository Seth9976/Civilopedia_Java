package com.google.gson.internal;

import java.util.Map.Entry;

public final class i implements Map.Entry {
    public i i;
    public i j;
    public i k;
    public i l;
    public i m;
    public final Object n;
    public Object o;
    public int p;

    public i() {
        this.n = null;
        this.m = this;
        this.l = this;
    }

    public i(i i0, Object object0, i i1, i i2) {
        this.i = i0;
        this.n = object0;
        this.p = 1;
        this.l = i1;
        this.m = i2;
        i2.l = this;
        i1.m = this;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = this.n;
            if(object1 == null) {
                if(((Map.Entry)object0).getKey() == null) {
                    return this.o == null ? ((Map.Entry)object0).getValue() == null : this.o.equals(((Map.Entry)object0).getValue());
                }
            }
            else if(object1.equals(((Map.Entry)object0).getKey())) {
                return this.o == null ? ((Map.Entry)object0).getValue() == null : this.o.equals(((Map.Entry)object0).getValue());
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.n;
    }

    @Override
    public final Object getValue() {
        return this.o;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.n == null ? 0 : this.n.hashCode();
        Object object0 = this.o;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public final Object setValue(Object object0) {
        Object object1 = this.o;
        this.o = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.n + "=" + this.o;
    }
}

