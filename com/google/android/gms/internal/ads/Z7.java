package com.google.android.gms.internal.ads;

import java.util.Iterator;

public final class z7 extends zzfro {
    public final transient Object[] k;
    public final transient int l;
    public final transient Object[] m;
    public final transient int n;
    public final transient int o;
    public static final Object[] p;
    public static final z7 q;

    static {
        Object[] arr_object = new Object[0];
        z7.p = arr_object;
        z7.q = new z7(0, 0, 0, arr_object, arr_object);
    }

    public z7(int v, int v1, int v2, Object[] arr_object, Object[] arr_object1) {
        this.k = arr_object;
        this.l = v;
        this.m = arr_object1;
        this.n = v1;
        this.o = v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int a(int v, Object[] arr_object) {
        System.arraycopy(this.k, 0, arr_object, v, this.o);
        return v + this.o;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean contains(Object object0) {
        if(object0 != null) {
            Object[] arr_object = this.m;
            if(arr_object.length != 0) {
                for(int v = h.n(object0); true; v = v1 + 1) {
                    int v1 = v & this.n;
                    Object object1 = arr_object[v1];
                    if(object1 == null) {
                        return false;
                    }
                    if(object1.equals(object0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int h() {
        return this.o;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final int hashCode() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int i() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final Iterator iterator() {
        return this.zzd().zzu(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final Object[] k() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final zzfrj m() {
        return zzfrj.l(this.o, this.k);
    }

    @Override
    public final int size() {
        return this.o;
    }

    @Override  // com.google.android.gms.internal.ads.zzfro
    public final zzfti zze() {
        return this.zzd().zzu(0);
    }
}

