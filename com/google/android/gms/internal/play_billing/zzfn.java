package com.google.android.gms.internal.play_billing;

import A.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class zzfn extends zzhk implements zzin {
    private static final zzfn zzb;
    private zzho zzd;

    static {
        zzfn zzfn0 = new zzfn();
        zzfn.zzb = zzfn0;
        zzhk.h(zzfn.class, zzfn0);
    }

    public zzfn() {
        this.zzd = G0.m;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhk
    public final Object c(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new H0(zzfn.zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzfl.class});
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return new zzfn();
                    }
                    case 4: {
                        return new zzfm(zzfn.zzb);  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzhg;-><init>(Lcom/google/android/gms/internal/play_billing/zzhk;)V
                    }
                    case 5: {
                        return zzfn.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public static void k(zzfn zzfn0, Iterable iterable0) {
        zzho zzho0 = zzfn0.zzd;
        if(!zzho0.zzc()) {
            int v = zzho0.size();
            zzfn0.zzd = zzho0.zzd(v + v);
        }
        zzho zzho1 = zzfn0.zzd;
        iterable0.getClass();
        int v1 = 0;
        if(iterable0 instanceof zzhy) {
            List list0 = ((zzhy)iterable0).zza();
            int v2 = zzho1.size();
            for(Object object0: list0) {
                if(object0 == null) {
                    String s = f.e(((zzhy)zzho1).size() - v2, "Element at index ", " is null.");
                    int v3 = ((zzhy)zzho1).size();
                    while(true) {
                        --v3;
                        if(v3 < v2) {
                            break;
                        }
                        ((zzhy)zzho1).remove(v3);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzgk) {
                    zzgk zzgk0 = (zzgk)object0;
                    ((zzhy)zzho1).zzb();
                }
                else if(object0 instanceof byte[]) {
                    zzgk.zzj(((byte[])object0), 0, ((byte[])object0).length);
                    ((zzhy)zzho1).zzb();
                }
                else {
                    ((zzhy)zzho1).add(((String)object0));
                }
            }
            return;
        }
        if(iterable0 instanceof E0) {
            zzho1.addAll(((Collection)iterable0));
        }
        else {
            if(iterable0 instanceof Collection) {
                int v4 = ((Collection)iterable0).size();
                if(zzho1 instanceof ArrayList) {
                    ((ArrayList)zzho1).ensureCapacity(zzho1.size() + v4);
                }
                if(zzho1 instanceof G0) {
                    int v5 = ((G0)zzho1).k + v4;
                    int v6 = ((G0)zzho1).j.length;
                    if(v5 > v6) {
                        if(v6 == 0) {
                            ((G0)zzho1).j = new Object[Math.max(v5, 10)];
                        }
                        else {
                            while(v6 < v5) {
                                v6 = Math.max(v6 * 3 / 2 + 1, 10);
                            }
                            ((G0)zzho1).j = Arrays.copyOf(((G0)zzho1).j, v6);
                        }
                    }
                }
            }
            int v7 = zzho1.size();
            if(!(iterable0 instanceof List) || !(iterable0 instanceof RandomAccess)) {
                for(Object object2: iterable0) {
                    if(object2 != null) {
                        zzho1.add(object2);
                        continue;
                    }
                    zzfu.a(v7, zzho1);
                    throw null;
                }
            }
            else {
                int v8 = ((List)iterable0).size();
                while(v1 < v8) {
                    Object object1 = ((List)iterable0).get(v1);
                    if(object1 != null) {
                        zzho1.add(object1);
                        ++v1;
                        continue;
                    }
                    zzfu.a(v7, zzho1);
                    throw null;
                }
            }
        }
    }

    public static zzfm zza() {
        return (zzfm)zzfn.zzb.d();
    }
}

