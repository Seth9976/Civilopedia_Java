package com.google.android.gms.internal.location;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class zzbp extends AbstractCollection implements Serializable {
    public static final Object[] i;

    static {
        zzbp.i = new Object[0];
    }

    public Object[] a() {
        throw null;
    }

    @Override
    @Deprecated
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int h() {
        throw null;
    }

    public int i() {
        throw null;
    }

    @Override
    public Iterator iterator() {
        return this.zza();
    }

    public abstract boolean j();

    public void k(Object[] arr_object) {
        throw null;
    }

    @Override
    @Deprecated
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(zzbp.i);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        arr_object.getClass();
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.a();
            if(arr_object1 == null) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
                this.k(arr_object);
                return arr_object;
            }
            return Arrays.copyOfRange(arr_object1, this.h(), this.i(), arr_object.getClass());
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.k(arr_object);
        return arr_object;
    }

    public abstract zzbu zza();

    public zzbs zze() {
        throw null;
    }
}

