package com.google.android.gms.internal.location;

import e1.m;
import e1.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzbs extends zzbp implements List, RandomAccess {
    public static final m j;

    static {
        zzbs.j = new m(a.m, 0);
    }

    @Override
    @Deprecated
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(@NullableDecl Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean equals(@NullableDecl Object object0) {
        if(object0 != this) {
            if(object0 instanceof List) {
                int v = this.size();
                if(v == ((List)object0).size()) {
                    if(((List)object0) instanceof RandomAccess) {
                        for(int v1 = 0; v1 < v; ++v1) {
                            if(!zzbl.zza(this.get(v1), ((List)object0).get(v1))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    else {
                        Iterator iterator0 = this.iterator();
                        Iterator iterator1 = ((List)object0).iterator();
                        while(iterator0.hasNext()) {
                            if(!iterator1.hasNext()) {
                                return false;
                            }
                            Object object1 = iterator0.next();
                            Object object2 = iterator1.next();
                            if(zzbl.zza(object1, object2)) {
                                continue;
                            }
                            return false;
                        }
                        return !iterator1.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int v = this.size();
        int v1 = 1;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + this.get(v2).hashCode();
        }
        return v1;
    }

    @Override
    public final int indexOf(@NullableDecl Object object0) {
        if(object0 == null) {
            return -1;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(object0.equals(this.get(v1))) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final Iterator iterator() {
        return this.zzl(0);
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public void k(Object[] arr_object) {
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.get(v1);
        }
    }

    @Override
    public final int lastIndexOf(@NullableDecl Object object0) {
        if(object0 == null) {
            return -1;
        }
        for(int v = this.size() - 1; v >= 0; --v) {
            if(object0.equals(this.get(v))) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return this.zzl(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzl(v);
    }

    @Override
    @Deprecated
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final zzbu zza() {
        return this.zzl(0);
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final zzbs zze() {
        return this;
    }

    public zzbs zzh(int v, int v1) {
        zzbm.zzc(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? a.m : new n(this, v, v2);
    }

    public static zzbs zzi() {
        return a.m;
    }

    public static zzbs zzj(Collection collection0) {
        if(collection0 instanceof zzbp) {
            zzbs zzbs0 = ((zzbp)collection0).zze();
            if(zzbs0.j()) {
                Object[] arr_object = zzbs0.toArray();
                return arr_object.length == 0 ? a.m : new a(arr_object.length, arr_object);
            }
            return zzbs0;
        }
        Object[] arr_object1 = collection0.toArray();
        for(int v = 0; v < arr_object1.length; ++v) {
            if(arr_object1[v] == null) {
                throw new NullPointerException("at index " + v);
            }
        }
        return arr_object1.length == 0 ? a.m : new a(arr_object1.length, arr_object1);
    }

    public final zzbv zzl(int v) {
        zzbm.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzbs.j : new m(this, v);
    }
}

