package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import p.b;
import p.j;

public final class zzib implements C {
    public static final b a;

    static {
        zzib.a = new b();  // 初始化器: Lp/k;-><init>()V
    }

    // 去混淆评级： 低(30)
    public static zzib a() {
        throw null;
    }

    public static void b() {
        synchronized(zzib.class) {
            b b0 = zzib.a;
            Iterator iterator0 = ((j)b0.values()).iterator();
            if(!iterator0.hasNext()) {
                b0.clear();
                return;
            }
            Object object0 = iterator0.next();
            ((zzib)object0).getClass();
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.C
    public final Object zzb(String s) {
        throw null;
    }
}

