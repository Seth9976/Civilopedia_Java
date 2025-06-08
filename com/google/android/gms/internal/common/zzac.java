package com.google.android.gms.internal.common;

import A.b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@DoNotMock("Use ImmutableList.of or another implementation")
@NullMarked
public abstract class zzac extends AbstractCollection implements Serializable {
    public static final Object[] i;

    static {
        zzac.i = new Object[0];
    }

    public void a(Object[] arr_object) {
        throw null;
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
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
        return this.zze();
    }

    public abstract boolean j();

    public Object[] k() {
        throw null;
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Spliterator spliterator() {
        return b.m(this);
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(zzac.i);
    }

    @Override
    @CanIgnoreReturnValue
    public final Object[] toArray(Object[] arr_object) {
        arr_object.getClass();
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.k();
            if(arr_object1 == null) {
                if(arr_object.length != 0) {
                    arr_object = Arrays.copyOf(arr_object, 0);
                }
                arr_object = Arrays.copyOf(arr_object, v);
                this.a(arr_object);
                return arr_object;
            }
            return Arrays.copyOfRange(arr_object1, this.i(), this.h(), arr_object.getClass());
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.a(arr_object);
        return arr_object;
    }

    public zzag zzd() {
        throw null;
    }

    public abstract zzaj zze();
}

