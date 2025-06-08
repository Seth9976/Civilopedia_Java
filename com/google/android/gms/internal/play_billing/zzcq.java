package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.a;
import java.util.Arrays;

public final class zzcq {
    public Object[] a;
    public int b;
    public k c;

    public zzcq() {
        this.a = new Object[8];
        this.b = 0;
    }

    public final zzcq zza(Object object0, Object object1) {
        int v = this.b + 1;
        Object[] arr_object = this.a;
        int v1 = v + v;
        if(v1 > arr_object.length) {
            this.a = Arrays.copyOf(arr_object, zzci.a(arr_object.length, v1));
        }
        a.U(object0, object1);
        Object[] arr_object1 = this.a;
        int v2 = this.b;
        int v3 = v2 + v2;
        arr_object1[v3] = object0;
        arr_object1[v3 + 1] = object1;
        this.b = v2 + 1;
        return this;
    }

    public final zzcr zzb() {
        k k0 = this.c;
        if(k0 != null) {
            throw k0.a();
        }
        zzcr zzcr0 = w.e(this.b, this.a, this);
        k k1 = this.c;
        if(k1 != null) {
            throw k1.a();
        }
        return zzcr0;
    }
}

