package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzfro extends zzfre implements Set {
    public transient zzfrj j;

    @Override
    public final boolean equals(@CheckForNull Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfro && this instanceof z7) {
            ((zzfro)object0).getClass();
            return !(((zzfro)object0) instanceof z7) || this.hashCode() == object0.hashCode() ? zzfte.b(this, object0) : false;
        }
        return zzfte.b(this, object0);
    }

    @Override
    public int hashCode() {
        return zzfte.a(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
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
        zzfou.zzf(v1 < 0x40000000, "collection too large");
        return 0x40000000;
    }

    public zzfrj m() {
        Object[] arr_object = this.toArray();
        return zzfrj.l(arr_object.length, arr_object);
    }

    public static zzfro n(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return z7.q;
            }
            case 1: {
                Object object3 = arr_object[0];
                object3.getClass();
                return new F7(object3);
            }
            default: {
                int v1 = zzfro.l(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 == null) {
                        throw new NullPointerException("at index " + v2);
                    }
                    int v5 = object0.hashCode();
                    for(int v6 = h.a(v5); true; ++v6) {
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
                    object2.getClass();
                    return new F7(object2);
                }
                if(zzfro.l(v4) < v1 / 2) {
                    return zzfro.n(v4, arr_object);
                }
                if(v4 < (arr_object.length >> 1) + (arr_object.length >> 2)) {
                    arr_object = Arrays.copyOf(arr_object, v4);
                }
                return new z7(v3, v1 - 1, v4, arr_object, arr_object1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public zzfrj zzd() {
        zzfrj zzfrj0 = this.j;
        if(zzfrj0 == null) {
            zzfrj0 = this.m();
            this.j = zzfrj0;
        }
        return zzfrj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public abstract zzfti zze();

    public static zzfrn zzj(int v) {
        zzfrn zzfrn0 = new zzfrn(v);  // 初始化器: Lcom/google/android/gms/internal/ads/c7;-><init>(I)V
        zzfrn0.d = new Object[zzfro.l(v)];
        return zzfrn0;
    }

    public static zzfro zzl(Collection collection0) {
        Object[] arr_object = collection0.toArray();
        return zzfro.n(arr_object.length, arr_object);
    }

    @SafeVarargs
    public static zzfro zzm(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object[] arr_object) {
        Object[] arr_object1 = {object0, object1, object2, object3, object4, object5, null, null, null, null, null, null};
        System.arraycopy(arr_object, 0, arr_object1, 6, 6);
        return zzfro.n(12, arr_object1);
    }
}

