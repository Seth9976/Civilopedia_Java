package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfrn extends c7 {
    public Object[] d;
    public int e;

    public zzfrn() {
        super(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrd
    public final zzfrd zzb(Object object0) {
        this.zze(object0);
        return this;
    }

    public final zzfrn zze(Object object0) {
        object0.getClass();
        if(this.d != null) {
            int v = zzfro.l(this.b);
            int v1 = this.d.length;
            if(v <= v1) {
                int v2 = object0.hashCode();
                for(int v3 = h.a(v2); true; v3 = v4 + 1) {
                    int v4 = v3 & v1 - 1;
                    Object[] arr_object = this.d;
                    Object object1 = arr_object[v4];
                    if(object1 == null) {
                        arr_object[v4] = object0;
                        this.e += v2;
                        this.zza(object0);
                        return this;
                    }
                    if(object1.equals(object0)) {
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        this.zza(object0);
        return this;
    }

    public final zzfrn zzf(Iterable iterable0) {
        if(this.d != null) {
            for(Object object0: iterable0) {
                this.zze(object0);
            }
            return this;
        }
        this.zzc(iterable0);
        return this;
    }

    public final zzfro zzg() {
        zzfro zzfro0;
        int v = this.b;
        switch(v) {
            case 0: {
                return z7.q;
            }
            case 1: {
                Object object0 = this.a[0];
                object0.getClass();
                return new F7(object0);
            }
            default: {
                if(this.d == null || zzfro.l(v) != this.d.length) {
                    zzfro0 = zzfro.n(this.b, this.a);
                    this.b = zzfro0.size();
                }
                else {
                    Object[] arr_object = this.b >= (this.a.length >> 1) + (this.a.length >> 2) ? this.a : Arrays.copyOf(this.a, this.b);
                    zzfro0 = new z7(this.e, this.d.length - 1, this.b, arr_object, this.d);
                }
                this.c = true;
                this.d = null;
                return zzfro0;
            }
        }
    }
}

