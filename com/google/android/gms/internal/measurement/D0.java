package com.google.android.gms.internal.measurement;

import A.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class d0 extends K implements o0, zzkk, RandomAccess {
    public long[] j;
    public int k;
    public static final d0 l;

    static {
        d0 d00 = new d0(new long[0], 0);
        d0.l = d00;
        d00.zzb();
    }

    public d0(long[] arr_v, int v) {
        this.j = arr_v;
        this.k = v;
    }

    @Override
    public final void add(int v, Object object0) {
        long v1 = (long)(((Long)object0));
        this.a();
        if(v >= 0) {
            int v2 = this.k;
            if(v <= v2) {
                long[] arr_v = this.j;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    long[] arr_v1 = new long[v2 * 3 / 2 + 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v);
                    System.arraycopy(this.j, v, arr_v1, v + 1, this.k - v);
                    this.j = arr_v1;
                }
                this.j[v] = v1;
                ++this.k;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(f.d(v, this.k, "Index:", ", Size:"));
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final boolean add(Object object0) {
        this.h(((long)(((Long)object0))));
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final boolean addAll(Collection collection0) {
        this.a();
        collection0.getClass();
        if(!(collection0 instanceof d0)) {
            return super.addAll(collection0);
        }
        int v = ((d0)collection0).k;
        if(v == 0) {
            return false;
        }
        int v1 = this.k;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        long[] arr_v = this.j;
        if(v2 > arr_v.length) {
            this.j = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((d0)collection0).j, 0, this.j, this.k, ((d0)collection0).k);
        this.k = v2;
        ++this.modCount;
        return true;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d0)) {
            return super.equals(object0);
        }
        if(this.k != ((d0)object0).k) {
            return false;
        }
        long[] arr_v = ((d0)object0).j;
        for(int v = 0; v < this.k; ++v) {
            if(this.j[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.i(v);
        return (long)this.j[v];
    }

    public final void h(long v) {
        this.a();
        int v1 = this.k;
        long[] arr_v = this.j;
        if(v1 == arr_v.length) {
            long[] arr_v1 = new long[v1 * 3 / 2 + 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.j = arr_v1;
        }
        int v2 = this.k;
        this.k = v2 + 1;
        this.j[v2] = v;
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.k; ++v1) {
            v = v * 0x1F + zzkm.zzc(this.j[v1]);
        }
        return v;
    }

    public final void i(int v) {
        if(v < 0 || v >= this.k) {
            throw new IndexOutOfBoundsException(f.d(v, this.k, "Index:", ", Size:"));
        }
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Long)) {
            return -1;
        }
        long v = (long)(((Long)object0));
        int v1 = this.k;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.j[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final Object remove(int v) {
        this.a();
        this.i(v);
        long[] arr_v = this.j;
        long v1 = arr_v[v];
        int v2 = this.k;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v - 1);
        }
        --this.k;
        ++this.modCount;
        return v1;
    }

    @Override
    public final void removeRange(int v, int v1) {
        this.a();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.j, v1, this.j, v, this.k - v1);
        this.k -= v1 - v;
        ++this.modCount;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.a();
        this.i(v);
        long[] arr_v = this.j;
        long v1 = arr_v[v];
        arr_v[v] = (long)(((Long)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkk
    public final long zza(int v) {
        this.i(v);
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzkl
    public final zzkl zzd(int v) {
        return this.zze(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkk
    public final zzkk zze(int v) {
        if(v < this.k) {
            throw new IllegalArgumentException();
        }
        return new d0(Arrays.copyOf(this.j, v), this.k);
    }
}

