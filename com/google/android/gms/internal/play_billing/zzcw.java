package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

public abstract class zzcw extends zzcv implements A, NavigableSet {
    public final transient Comparator k;
    public transient zzcw l;

    public zzcw(Comparator comparator0) {
        this.k = comparator0;
    }

    @Override
    @Deprecated
    public final void addFirst(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void addLast(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CheckForNull
    public Object ceiling(Object object0) {
        object0.getClass();
        return zzcx.zza(this.r(object0, true), null);
    }

    @Override  // com.google.android.gms.internal.play_billing.A
    public final Comparator comparator() {
        return this.k;
    }

    @Override
    public Iterator descendingIterator() {
        return this.zzr();
    }

    @Override
    public final NavigableSet descendingSet() {
        zzcw zzcw0 = this.l;
        if(zzcw0 == null) {
            zzcw0 = this.o();
            this.l = zzcw0;
            zzcw0.l = this;
        }
        return zzcw0;
    }

    @Override
    public Object first() {
        return this.zze().next();
    }

    @Override
    @CheckForNull
    public Object floor(Object object0) {
        object0.getClass();
        return zzda.zza(this.p(object0, true).zzr(), null);
    }

    @Override
    public final Object getFirst() {
        return this.first();
    }

    @Override
    public final Object getLast() {
        return this.last();
    }

    @Override
    public final NavigableSet headSet(Object object0, boolean z) {
        object0.getClass();
        return this.p(object0, z);
    }

    @Override
    public final SortedSet headSet(Object object0) {
        object0.getClass();
        return this.p(object0, false);
    }

    @Override
    @CheckForNull
    public Object higher(Object object0) {
        object0.getClass();
        return zzcx.zza(this.r(object0, false), null);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public Iterator iterator() {
        return this.zze();
    }

    @Override
    public Object last() {
        return this.zzr().next();
    }

    @Override
    @CheckForNull
    public Object lower(Object object0) {
        object0.getClass();
        return zzda.zza(this.p(object0, false).zzr(), null);
    }

    public abstract y o();

    public abstract y p(Object arg1, boolean arg2);

    @Override
    @Deprecated
    @CheckForNull
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    @CheckForNull
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract zzcw q(Object arg1, boolean arg2, Object arg3, boolean arg4);

    public abstract y r(Object arg1, boolean arg2);

    @Override
    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final NavigableSet subSet(Object object0, boolean z, Object object1, boolean z1) {
        return this.zzn(object0, z, object1, z1);
    }

    @Override
    public final SortedSet subSet(Object object0, Object object1) {
        return this.zzn(object0, true, object1, false);
    }

    @Override
    public final NavigableSet tailSet(Object object0, boolean z) {
        object0.getClass();
        return this.r(object0, z);
    }

    @Override
    public final SortedSet tailSet(Object object0) {
        object0.getClass();
        return this.r(object0, true);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public abstract zzdw zze();

    public final zzcw zzn(Object object0, boolean z, Object object1, boolean z1) {
        object0.getClass();
        object1.getClass();
        if(this.k.compare(object0, object1) > 0) {
            throw new IllegalArgumentException();
        }
        return this.q(object0, z, object1, z1);
    }

    public abstract zzdw zzr();
}

