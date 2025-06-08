package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import o1.a;

public abstract class zzcv extends zzcj implements Set {
    public transient zzco j;

    @Override
    public boolean equals(@CheckForNull Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzcv && this instanceof x) {
            ((zzcv)object0).getClass();
            if(((zzcv)object0) instanceof x && this.hashCode() != object0.hashCode()) {
                return false;
            }
        }
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            try {
                return this.size() == set0.size() && this.containsAll(set0);
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public Iterator iterator() {
        return this.zze();
    }

    public static int l(int v) {
        int v1 = Math.max(v, 2);
        if(v1 < 0x2CCCCCCC) {
            int v2 = Integer.highestOneBit(v1 - 1);
            do {
                v2 += v2;
            }
            while(((double)v2) * 0.7 < ((double)v1));
            return v2;
        }
        if(v1 >= 0x40000000) {
            throw new IllegalArgumentException("collection too large");
        }
        return 0x40000000;
    }

    public zzco m() {
        Object[] arr_object = this.toArray();
        return zzco.l(arr_object.length, arr_object);
    }

    public static zzcv n(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return x.q;
            }
            case 1: {
                Object object3 = arr_object[0];
                Objects.requireNonNull(object3);
                return new z(object3);
            }
            default: {
                int v1 = zzcv.l(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 == null) {
                        throw new NullPointerException("at index " + v2);
                    }
                    int v5 = object0.hashCode();
                    for(int v6 = a.a0(v5); true; ++v6) {
                        int v7 = v6 & v1 - 1;
                        Object object1 = arr_object1[v7];
                        if(object1 == null) {
                            arr_object[v4] = object0;
                            arr_object1[v7] = object0;
                            v3 += v5;
                            ++v4;
                            break;
                        }
                        if(object1.equals(object0)) {
                            break;
                        }
                    }
                }
                Arrays.fill(arr_object, v4, v, null);
                if(v4 == 1) {
                    Object object2 = arr_object[0];
                    Objects.requireNonNull(object2);
                    return new z(object2);
                }
                if(zzcv.l(v4) < v1 / 2) {
                    return zzcv.n(v4, arr_object);
                }
                if(v4 < (arr_object.length >> 1) + (arr_object.length >> 2)) {
                    arr_object = Arrays.copyOf(arr_object, v4);
                }
                return new x(v3, v1 - 1, v4, arr_object, arr_object1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public zzco zzd() {
        zzco zzco0 = this.j;
        if(zzco0 == null) {
            zzco0 = this.m();
            this.j = zzco0;
        }
        return zzco0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public abstract zzdw zze();
}

