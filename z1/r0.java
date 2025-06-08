package z1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class r0 implements List, RandomAccess {
    public final List i;

    public r0(List list0) {
        this.i = Collections.unmodifiableList(list0);
    }

    @Override
    public final void add(int v, Object object0) {
        this.i.add(v, object0);
    }

    @Override
    public final boolean add(Object object0) {
        return this.i.add(object0);
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        return this.i.addAll(v, collection0);
    }

    @Override
    public final boolean addAll(Collection collection0) {
        return this.i.addAll(collection0);
    }

    @Override
    public final void clear() {
        this.i.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.i.contains(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.i.containsAll(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this.i.equals(object0);
    }

    @Override
    public final Object get(int v) {
        return this.i.get(v);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final int indexOf(Object object0) {
        return this.i.indexOf(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.i.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.i.iterator();
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return this.i.lastIndexOf(object0);
    }

    @Override
    public final ListIterator listIterator() {
        return this.i.listIterator();
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.i.listIterator(v);
    }

    @Override
    public final Object remove(int v) {
        return this.i.remove(v);
    }

    @Override
    public final boolean remove(Object object0) {
        return this.i.remove(object0);
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        return this.i.removeAll(collection0);
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        return this.i.retainAll(collection0);
    }

    @Override
    public final Object set(int v, Object object0) {
        return this.i.set(v, object0);
    }

    @Override
    public final int size() {
        return this.i.size();
    }

    @Override
    public final List subList(int v, int v1) {
        return this.i.subList(v, v1);
    }

    @Override
    public final Object[] toArray() {
        return this.i.toArray();
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return this.i.toArray(arr_object);
    }
}

