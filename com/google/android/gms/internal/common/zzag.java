package com.google.android.gms.internal.common;

import c1.b;
import c1.c;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class zzag extends zzac implements List, RandomAccess {
    public static final b j;

    static {
        zzag.j = new b(a.m, 0);
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public void a(Object[] arr_object) {
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.get(v1);
        }
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
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
                            if(!zzr.zza(this.get(v1), ((List)object0).get(v1))) {
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
                            if(zzr.zza(object1, object2)) {
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

    @Override  // com.google.android.gms.internal.common.zzac
    public final Iterator iterator() {
        return this.zzo(0);
    }

    public static a l(int v, Object[] arr_object) {
        return v == 0 ? a.m : new a(v, arr_object);
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
        return this.zzo(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzo(v);
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.common.zzac
    @InlineMe(replacement = "this")
    @Deprecated
    public final zzag zzd() {
        return this;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final zzaj zze() {
        return this.zzo(0);
    }

    public zzag zzh(int v, int v1) {
        zzs.zzc(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? a.m : new c(this, v, v2);
    }

    public static zzag zzj(Iterable iterable0) {
        iterable0.getClass();
        if(iterable0 instanceof Collection) {
            return zzag.zzk(((Collection)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return a.m;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return zzag.zzm(object0);
        }
        zzad zzad0 = new zzad();  // 初始化器: Lc1/a;-><init>()V
        zzad0.zzb(object0);
        zzad0.zzc(iterator0);
        zzad0.c = true;
        return zzag.l(zzad0.b, zzad0.a);
    }

    public static zzag zzk(Collection collection0) {
        if(collection0 instanceof zzac) {
            zzag zzag0 = ((zzac)collection0).zzd();
            if(zzag0.j()) {
                Object[] arr_object = zzag0.toArray();
                return zzag.l(arr_object.length, arr_object);
            }
            return zzag0;
        }
        Object[] arr_object1 = collection0.toArray();
        zzah.a(arr_object1.length, arr_object1);
        return zzag.l(arr_object1.length, arr_object1);
    }

    public static zzag zzl() {
        return a.m;
    }

    public static zzag zzm(Object object0) {
        Object[] arr_object = {object0};
        zzah.a(1, arr_object);
        return zzag.l(1, arr_object);
    }

    public static zzag zzn(Object object0, Object object1) {
        Object[] arr_object = {object0, object1};
        zzah.a(2, arr_object);
        return zzag.l(2, arr_object);
    }

    public final zzak zzo(int v) {
        zzs.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzag.j : new b(this, v);
    }
}

