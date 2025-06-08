package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

public abstract class c7 extends zzfrd {
    public Object[] a;
    public int b;
    public boolean c;

    public c7(int v) {
        this.a = new Object[v];
        this.b = 0;
    }

    public final void a(int v) {
        Object[] arr_object = this.a;
        if(arr_object.length < v) {
            int v1 = arr_object.length + (arr_object.length >> 1) + 1;
            if(v1 < v) {
                int v2 = Integer.highestOneBit(v - 1);
                v1 = v2 + v2;
            }
            if(v1 < 0) {
                v1 = 0x7FFFFFFF;
            }
            this.a = Arrays.copyOf(arr_object, v1);
            this.c = false;
            return;
        }
        if(this.c) {
            this.a = (Object[])arr_object.clone();
            this.c = false;
        }
    }

    public final c7 zza(Object object0) {
        object0.getClass();
        this.a(this.b + 1);
        int v = this.b;
        this.b = v + 1;
        this.a[v] = object0;
        return this;
    }

    public final zzfrd zzc(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            this.a(((Collection)iterable0).size() + this.b);
            if(((Collection)iterable0) instanceof zzfre) {
                this.b = ((zzfre)(((Collection)iterable0))).a(this.b, this.a);
                return this;
            }
        }
        for(Object object0: iterable0) {
            this.zzb(object0);
        }
        return this;
    }
}

