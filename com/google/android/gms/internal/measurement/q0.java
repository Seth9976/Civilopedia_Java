package com.google.android.gms.internal.measurement;

import A.f;
import java.util.Arrays;
import java.util.RandomAccess;

public final class q0 extends K implements RandomAccess {
    public Object[] j;
    public int k;
    public static final q0 l;

    static {
        q0 q00 = new q0(0, new Object[0]);
        q0.l = q00;
        q00.zzb();
    }

    public q0(int v, Object[] arr_object) {
        this.j = arr_object;
        this.k = v;
    }

    @Override
    public final void add(int v, Object object0) {
        this.a();
        if(v >= 0) {
            int v1 = this.k;
            if(v <= v1) {
                Object[] arr_object = this.j;
                if(v1 < arr_object.length) {
                    System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
                }
                else {
                    Object[] arr_object1 = new Object[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_object, 0, arr_object1, 0, v);
                    System.arraycopy(this.j, v, arr_object1, v + 1, this.k - v);
                    this.j = arr_object1;
                }
                this.j[v] = object0;
                ++this.k;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(f.d(v, this.k, "Index:", ", Size:"));
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final boolean add(Object object0) {
        this.a();
        int v = this.k;
        Object[] arr_object = this.j;
        if(v == arr_object.length) {
            this.j = Arrays.copyOf(arr_object, v * 3 / 2 + 1);
        }
        int v1 = this.k;
        this.k = v1 + 1;
        this.j[v1] = object0;
        ++this.modCount;
        return true;
    }

    @Override
    public final Object get(int v) {
        this.h(v);
        return this.j[v];
    }

    public final void h(int v) {
        if(v < 0 || v >= this.k) {
            throw new IndexOutOfBoundsException(f.d(v, this.k, "Index:", ", Size:"));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final Object remove(int v) {
        this.a();
        this.h(v);
        Object[] arr_object = this.j;
        Object object0 = arr_object[v];
        int v1 = this.k;
        if(v < v1 - 1) {
            System.arraycopy(arr_object, v + 1, arr_object, v, v1 - v - 1);
        }
        --this.k;
        ++this.modCount;
        return object0;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.a();
        this.h(v);
        Object[] arr_object = this.j;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        ++this.modCount;
        return object1;
    }

    @Override
    public final int size() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkl
    public final zzkl zzd(int v) {
        if(v < this.k) {
            throw new IllegalArgumentException();
        }
        Object[] arr_object = Arrays.copyOf(this.j, v);
        return new q0(this.k, arr_object);
    }
}

