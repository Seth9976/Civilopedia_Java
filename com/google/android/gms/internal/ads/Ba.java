package com.google.android.gms.internal.ads;

import N.n;

public final class ba {
    public static int a(zzgnl zzgnl0) {
        return zzgnl0.zza();
    }

    public static zzgnl b(Object object0) {
        return ((zzgkq)object0).zzc;
    }

    public static zzgnl c() {
        return zzgnl.a();
    }

    public static boolean d(Object object0, n n0) {
        int v = n0.a >>> 3;
        int v1 = n0.a & 7;
        zzgjq zzgjq0 = (zzgjq)n0.d;
        switch(v1) {
            case 0: {
                n0.s(0);
                ((zzgnl)object0).b(v << 3, zzgjq0.zzp());
                return true;
            }
            case 1: {
                n0.s(1);
                ((zzgnl)object0).b(v << 3 | 1, zzgjq0.zzo());
                return true;
            }
            case 2: {
                ((zzgnl)object0).b(v << 3 | 2, n0.w());
                return true;
            }
            case 3: {
                zzgnl zzgnl0 = zzgnl.a();
                while(n0.v() != 0x7FFFFFFF && ba.d(zzgnl0, n0)) {
                }
                if((v << 3 | 4) != n0.a) {
                    throw new zzglc("Protocol message end-group tag did not match expected tag.");
                }
                zzgnl0.zzf();
                ((zzgnl)object0).b(v << 3 | 3, zzgnl0);
                return true;
            }
            case 4: {
                return false;
            }
            case 5: {
                n0.s(5);
                ((zzgnl)object0).b(v << 3 | 5, zzgjq0.zzg());
                return true;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public static void e(zzgnl zzgnl0, n9 n90) {
        zzgnl0.zzi(n90);
    }
}

