package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import o1.a;

public final class x extends zzcv {
    public final transient Object[] k;
    public final transient int l;
    public final transient Object[] m;
    public final transient int n;
    public final transient int o;
    public static final Object[] p;
    public static final x q;

    static {
        Object[] arr_object = new Object[0];
        x.p = arr_object;
        x.q = new x(0, 0, 0, arr_object, arr_object);
    }

    public x(int v, int v1, int v2, Object[] arr_object, Object[] arr_object1) {
        this.k = arr_object;
        this.l = v;
        this.m = arr_object1;
        this.n = v1;
        this.o = v2;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] arr_object) {
        System.arraycopy(this.k, 0, arr_object, 0, this.o);
        return this.o;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean contains(Object object0) {
        if(object0 != null) {
            Object[] arr_object = this.m;
            if(arr_object.length != 0) {
                for(int v = a.a0(object0.hashCode()); true; v = v1 + 1) {
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

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int h() {
        return this.o;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final int hashCode() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int i() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final Iterator iterator() {
        return this.zzd().zzn(0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] k() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzco m() {
        return zzco.l(this.o, this.k);
    }

    @Override
    public final int size() {
        return this.o;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcv
    public final zzdw zze() {
        return this.zzd().zzn(0);
    }
}

