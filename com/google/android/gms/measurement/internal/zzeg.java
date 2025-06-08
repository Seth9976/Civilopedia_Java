package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import i1.k;
import o1.a;

@VisibleForTesting
public final class zzeg {
    public final String a;
    public final k b;
    public final Object c;
    public final Object d;
    public final Object e;
    public volatile Object f;
    public static final Object g;

    static {
        zzeg.g = new Object();
    }

    public zzeg(String s, Object object0, Object object1, k k0) {
        this.e = new Object();
        this.f = null;
        this.a = s;
        this.c = object0;
        this.d = object1;
        this.b = k0;
    }

    public final Object zza(Object object0) {
        Object object4;
        synchronized(this.e) {
        }
        if(object0 != null) {
            return object0;
        }
        if(a.b == null) {
            return this.c;
        }
        synchronized(zzeg.g) {
            if(zzab.zza()) {
                return this.f == null ? this.c : this.f;
            }
        }
        try {
            for(Object object3: zzeh.a) {
                zzeg zzeg0 = (zzeg)object3;
                if(zzab.zza()) {
                    throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                }
                try {
                    object4 = null;
                    k k0 = zzeg0.b;
                    if(k0 != null) {
                        object4 = k0.zza();
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                synchronized(zzeg.g) {
                    zzeg0.f = object4;
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
        k k1 = this.b;
        if(k1 == null) {
            return this.c;
        }
        try {
            return k1.zza();
        }
        catch(SecurityException unused_ex) {
            return this.c;
        }
        catch(IllegalStateException unused_ex) {
            return this.c;
        }
    }

    public final String zzb() {
        return this.a;
    }
}

