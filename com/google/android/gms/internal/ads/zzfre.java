package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

public abstract class zzfre extends AbstractCollection implements Serializable {
    public static final Object[] i;

    static {
        zzfre.i = new Object[0];
    }

    public int a(int v, Object[] arr_object) {
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

    @Override
    public abstract boolean contains(@CheckForNull Object arg1);

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        return this.zze();
    }

    public abstract boolean j();

    public Object[] k() {
        return null;
    }

    @Override
    @Deprecated
    public final boolean remove(@CheckForNull Object object0) {
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
        return this.toArray(zzfre.i);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        arr_object.getClass();
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.k();
            if(arr_object1 == null) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
                this.a(0, arr_object);
                return arr_object;
            }
            return Arrays.copyOfRange(arr_object1, this.i(), this.h(), arr_object.getClass());
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.a(0, arr_object);
        return arr_object;
    }

    public zzfrj zzd() {
        throw null;
    }

    public abstract zzfti zze();
}

