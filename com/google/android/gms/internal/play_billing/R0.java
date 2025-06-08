package com.google.android.gms.internal.play_billing;

import A.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class r0 extends b0 implements E0, zzhn, RandomAccess {
    public int[] j;
    public int k;
    public static final int[] l;
    public static final r0 m;

    static {
        int[] arr_v = new int[0];
        r0.l = arr_v;
        r0.m = new r0(arr_v, 0, false);
    }

    public r0(int[] arr_v, int v, boolean z) {
        super(z);
        this.j = arr_v;
        this.k = v;
    }

    @Override
    public final void add(int v, Object object0) {
        int v1 = (int)(((Integer)object0));
        this.a();
        if(v >= 0) {
            int v2 = this.k;
            if(v <= v2) {
                int[] arr_v = this.j;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    int[] arr_v1 = new int[Math.max(arr_v.length * 3 / 2 + 1, 10)];
                    System.arraycopy(this.j, 0, arr_v1, 0, v);
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

    @Override
    public final boolean add(Object object0) {
        this.i(((int)(((Integer)object0))));
        return true;
    }

    @Override  // com.google.android.gms.internal.play_billing.b0
    public final boolean addAll(Collection collection0) {
        this.a();
        collection0.getClass();
        if(!(collection0 instanceof r0)) {
            return super.addAll(collection0);
        }
        int v = ((r0)collection0).k;
        if(v == 0) {
            return false;
        }
        int v1 = this.k;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        int[] arr_v = this.j;
        if(v2 > arr_v.length) {
            this.j = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((r0)collection0).j, 0, this.j, this.k, ((r0)collection0).k);
        this.k = v2;
        ++this.modCount;
        return true;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // com.google.android.gms.internal.play_billing.b0
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r0)) {
            return super.equals(object0);
        }
        if(this.k != ((r0)object0).k) {
            return false;
        }
        int[] arr_v = ((r0)object0).j;
        for(int v = 0; v < this.k; ++v) {
            if(this.j[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.j(v);
        return (int)this.j[v];
    }

    public final int h(int v) {
        this.j(v);
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.play_billing.b0
    public final int hashCode() {
        int v1 = 1;
        for(int v = 0; v < this.k; ++v) {
            v1 = v1 * 0x1F + this.j[v];
        }
        return v1;
    }

    public final void i(int v) {
        this.a();
        int v1 = this.j.length;
        if(this.k == v1) {
            int[] arr_v = new int[Math.max(v1 * 3 / 2 + 1, 10)];
            System.arraycopy(this.j, 0, arr_v, 0, this.k);
            this.j = arr_v;
        }
        int v2 = this.k;
        this.k = v2 + 1;
        this.j[v2] = v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Integer)) {
            return -1;
        }
        int v = (int)(((Integer)object0));
        int v1 = this.k;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.j[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    public final void j(int v) {
        if(v < 0 || v >= this.k) {
            throw new IndexOutOfBoundsException(f.d(v, this.k, "Index:", ", Size:"));
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.b0
    public final Object remove(int v) {
        this.a();
        this.j(v);
        int[] arr_v = this.j;
        int v1 = arr_v[v];
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
        this.j(v);
        int[] arr_v = this.j;
        int v1 = arr_v[v];
        arr_v[v] = (int)(((Integer)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzho
    public final zzho zzd(int v) {
        if(v < this.k) {
            throw new IllegalArgumentException();
        }
        return v == 0 ? new r0(r0.l, this.k, true) : new r0(Arrays.copyOf(this.j, v), this.k, true);
    }

    public final void zzh(int v) {
        int v1 = this.j.length;
        if(v <= v1) {
            return;
        }
        if(v1 != 0) {
            while(v1 < v) {
                v1 = Math.max(v1 * 3 / 2 + 1, 10);
            }
            this.j = Arrays.copyOf(this.j, v1);
            return;
        }
        this.j = new int[Math.max(v, 10)];
    }
}

