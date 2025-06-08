package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import z1.a0;

public final class y extends zzcw {
    public final transient zzco m;
    public static final y n;

    static {
        y.n = new y(r.m, o.i);
    }

    public y(zzco zzco0, Comparator comparator0) {
        super(comparator0);
        this.m = zzco0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] arr_object) {
        return this.m.a(arr_object);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Object ceiling(Object object0) {
        int v = this.t(object0, true);
        return v == this.m.size() ? null : this.m.get(v);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean contains(Object object0) {
        if(object0 != null) {
            try {
                if(Collections.binarySearch(this.m, object0, this.k) >= 0) {
                    return true;
                }
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if(collection0 instanceof zzdb) {
            collection0 = ((zzdb)collection0).zza();
        }
        Comparator comparator0 = this.k;
        if(a0.S(comparator0, collection0) && collection0.size() > 1) {
            zzdx zzdx0 = this.m.zzn(0);
            Iterator iterator0 = collection0.iterator();
            if(!zzdx0.hasNext()) {
                return false;
            }
            Object object0 = iterator0.next();
            Object object1 = zzdx0.next();
            try {
                while(true) {
                    int v = comparator0.compare(object1, object0);
                    if(v < 0) {
                        if(!zzdx0.hasNext()) {
                            return false;
                        }
                        object1 = zzdx0.next();
                    }
                    else {
                        if(v != 0) {
                            break;
                        }
                        if(!iterator0.hasNext()) {
                            return true;
                        }
                        object0 = iterator0.next();
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
            return false;
        }
        return super.containsAll(collection0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Iterator descendingIterator() {
        return this.zzr();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Set)) {
            return false;
        }
        zzco zzco0 = this.m;
        if(zzco0.size() != ((Set)object0).size()) {
            return false;
        }
        if(this.isEmpty()) {
            return true;
        }
        Comparator comparator0 = this.k;
        if(a0.S(comparator0, ((Set)object0))) {
            Iterator iterator0 = ((Set)object0).iterator();
            try {
                zzdx zzdx0 = zzco0.zzn(0);
                do {
                    if(!zzdx0.hasNext()) {
                        return true;
                    }
                    Object object1 = zzdx0.next();
                    Object object2 = iterator0.next();
                }
                while(object2 != null && comparator0.compare(object1, object2) == 0);
            }
            catch(ClassCastException | NoSuchElementException unused_ex) {
            }
            return false;
        }
        return this.containsAll(((Set)object0));
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Object first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.m.get(0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Object floor(Object object0) {
        int v = this.s(object0, true);
        return v - 1 == -1 ? null : this.m.get(v - 1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int h() {
        return this.m.h();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Object higher(Object object0) {
        int v = this.t(object0, false);
        return v == this.m.size() ? null : this.m.get(v);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int i() {
        return this.m.i();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Iterator iterator() {
        return this.m.zzn(0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] k() {
        return this.m.k();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Object last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.m.get(this.m.size() - 1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final Object lower(Object object0) {
        int v = this.s(object0, false);
        return v - 1 == -1 ? null : this.m.get(v - 1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final y o() {
        Comparator comparator0 = Collections.reverseOrder(this.k);
        if(this.isEmpty()) {
            return o.i.equals(comparator0) ? y.n : new y(r.m, comparator0);
        }
        return new y(this.m.zzh(), comparator0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final y p(Object object0, boolean z) {
        return this.u(0, this.s(object0, z));
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw q(Object object0, boolean z, Object object1, boolean z1) {
        y y0 = this.r(object0, z);
        return y0.u(0, y0.s(object1, z1));
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final y r(Object object0, boolean z) {
        return this.u(this.t(object0, z), this.m.size());
    }

    public final int s(Object object0, boolean z) {
        object0.getClass();
        int v = Collections.binarySearch(this.m, object0, this.k);
        if(v >= 0) {
            return z ? v + 1 : v;
        }
        return ~v;
    }

    @Override
    public final int size() {
        return this.m.size();
    }

    public final int t(Object object0, boolean z) {
        object0.getClass();
        int v = Collections.binarySearch(this.m, object0, this.k);
        if(v >= 0) {
            return z ? v : v + 1;
        }
        return ~v;
    }

    public final y u(int v, int v1) {
        zzco zzco0 = this.m;
        if(v == 0) {
            if(v1 != zzco0.size()) {
                v = 0;
                goto label_6;
            }
            return this;
        }
    label_6:
        Comparator comparator0 = this.k;
        if(v < v1) {
            return new y(zzco0.zzi(v, v1), comparator0);
        }
        return o.i.equals(comparator0) ? y.n : new y(r.m, comparator0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzco zzd() {
        return this.m;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final zzdw zze() {
        return this.m.zzn(0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcw
    public final zzdw zzr() {
        return this.m.zzh().zzn(0);
    }
}

