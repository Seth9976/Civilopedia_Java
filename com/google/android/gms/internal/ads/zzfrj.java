package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class zzfrj extends zzfre implements List, RandomAccess {
    public static final e7 j;

    static {
        zzfrj.j = new e7(t7.m, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public int a(int v, Object[] arr_object) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v + v2] = this.get(v2);
        }
        return v + v1;
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

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean contains(@CheckForNull Object object0) {
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
                            if(!zzfoq.zza(this.get(v1), ((List)object0).get(v1))) {
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
                            if(zzfoq.zza(object1, object2)) {
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
    public final int indexOf(@CheckForNull Object object0) {
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

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final Iterator iterator() {
        return this.zzu(0);
    }

    public static t7 l(int v, Object[] arr_object) {
        return v == 0 ? t7.m : new t7(v, arr_object);
    }

    @Override
    public final int lastIndexOf(@CheckForNull Object object0) {
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
        return this.zzu(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzu(v);
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

    @Override  // com.google.android.gms.internal.ads.zzfre
    @Deprecated
    public final zzfrj zzd() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final zzfti zze() {
        return this.zzu(0);
    }

    public zzfrj zzh(int v, int v1) {
        zzfou.zzg(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? t7.m : new f7(this, v, v2);
    }

    public static zzfrg zzi() {
        return new zzfrg(4);  // 初始化器: Lcom/google/android/gms/internal/ads/c7;-><init>(I)V
    }

    public static zzfrj zzl(Iterable iterable0) {
        iterable0.getClass();
        return zzfrj.zzm(((Collection)iterable0));
    }

    public static zzfrj zzm(Collection collection0) {
        if(collection0 instanceof zzfre) {
            zzfrj zzfrj0 = ((zzfre)collection0).zzd();
            if(zzfrj0.j()) {
                Object[] arr_object = zzfrj0.toArray();
                return zzfrj.l(arr_object.length, arr_object);
            }
            return zzfrj0;
        }
        Object[] arr_object1 = collection0.toArray();
        zzfsq.a(arr_object1.length, arr_object1);
        return zzfrj.l(arr_object1.length, arr_object1);
    }

    public static zzfrj zzn(Object[] arr_object) {
        if(arr_object.length == 0) {
            return t7.m;
        }
        Object[] arr_object1 = (Object[])arr_object.clone();
        zzfsq.a(arr_object1.length, arr_object1);
        return zzfrj.l(arr_object1.length, arr_object1);
    }

    public static zzfrj zzo() {
        return t7.m;
    }

    public static zzfrj zzp(Object object0) {
        Object[] arr_object = {object0};
        zzfsq.a(1, arr_object);
        return zzfrj.l(1, arr_object);
    }

    public static zzfrj zzq(Object object0, Object object1) {
        Object[] arr_object = {object0, object1};
        zzfsq.a(2, arr_object);
        return zzfrj.l(2, arr_object);
    }

    public static zzfrj zzr(Object object0, Object object1, Object object2) {
        Object[] arr_object = {"2011", "1009", "3010"};
        zzfsq.a(3, arr_object);
        return zzfrj.l(3, arr_object);
    }

    public static zzfrj zzs(Object object0, Object object1, Object object2, Object object3, Object object4) {
        Object[] arr_object = {object0, object1, object2, object3, object4};
        zzfsq.a(5, arr_object);
        return zzfrj.l(5, arr_object);
    }

    public static zzfrj zzt(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        Object[] arr_object = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfsq.a(6, arr_object);
        return zzfrj.l(6, arr_object);
    }

    public final zzftj zzu(int v) {
        zzfou.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzfrj.j : new e7(this, v);
    }
}

