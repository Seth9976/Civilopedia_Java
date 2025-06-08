package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

public abstract class g extends zzci {
    public Object[] a;
    public int b;
    public boolean c;

    public g(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("initialCapacity cannot be negative but was: " + v);
        }
        this.a = new Object[v];
        this.b = 0;
    }

    public final void b(int v) {
        int v1 = this.a.length;
        int v2 = zzci.a(v1, this.b + v);
        if(v2 <= v1 && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, v2);
        this.c = false;
    }

    public final g zza(Object object0) {
        object0.getClass();
        this.b(1);
        int v = this.b;
        this.b = v + 1;
        this.a[v] = object0;
        return this;
    }
}

