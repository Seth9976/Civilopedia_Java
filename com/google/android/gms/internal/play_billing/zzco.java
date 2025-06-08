package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

public abstract class zzco extends zzcj implements List, RandomAccess {
    public static final h j;
    public static final int zzd;

    static {
        zzco.j = new h(r.m, 0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public int a(Object[] arr_object) {
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.get(v1);
        }
        return v;
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

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public boolean contains(@CheckForNull Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean equals(@CheckForNull Object object0) {
        if(object0 != this) {
            if(object0 instanceof List) {
                int v = this.size();
                if(v == ((List)object0).size()) {
                    if(((List)object0) instanceof RandomAccess) {
                        for(int v1 = 0; v1 < v; ++v1) {
                            if(!zzbd.zza(this.get(v1), ((List)object0).get(v1))) {
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
                            if(zzbd.zza(object1, object2)) {
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
        int v2 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 * 0x1F + this.get(v1).hashCode();
        }
        return v2;
    }

    @Override
    public int indexOf(@CheckForNull Object object0) {
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

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final Iterator iterator() {
        return this.zzn(0);
    }

    public static r l(int v, Object[] arr_object) {
        return v == 0 ? r.m : new r(v, arr_object);
    }

    @Override
    public int lastIndexOf(@CheckForNull Object object0) {
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
        return this.zzn(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzn(v);
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
        return this.zzi(v, v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    @Deprecated
    public final zzco zzd() {
        return this;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final zzdw zze() {
        return this.zzn(0);
    }

    public zzco zzh() {
        return this.size() <= 1 ? this : new i(this);
    }

    public zzco zzi(int v, int v1) {
        zzbe.zze(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? r.m : new j(this, v, v2);
    }

    public static zzco zzk(Collection collection0) {
        if(collection0 instanceof zzcj) {
            zzco zzco0 = ((zzcj)collection0).zzd();
            if(zzco0.j()) {
                Object[] arr_object = zzco0.toArray();
                return zzco.l(arr_object.length, arr_object);
            }
            return zzco0;
        }
        Object[] arr_object1 = collection0.toArray();
        for(int v = 0; v < arr_object1.length; ++v) {
            if(arr_object1[v] == null) {
                throw new NullPointerException("at index " + v);
            }
        }
        return zzco.l(arr_object1.length, arr_object1);
    }

    public static zzco zzl() {
        return r.m;
    }

    public static zzco zzm(Object object0) {
        Object[] arr_object = {object0};
        for(int v = 0; v < 1; ++v) {
            if(arr_object[v] == null) {
                throw new NullPointerException("at index " + v);
            }
        }
        return zzco.l(1, arr_object);
    }

    public final zzdx zzn(int v) {
        zzbe.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzco.j : new h(this, v);
    }

    public static Collector zzo() {
        return b.a;
    }
}

