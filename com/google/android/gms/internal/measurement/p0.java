package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

public final class p0 {
    public final f0 a;
    public final ConcurrentHashMap b;
    public static final p0 c;

    static {
        p0.c = new p0();
    }

    public p0() {
        this.b = new ConcurrentHashMap();
        this.a = new f0();
    }

    public final s0 a(Class class0) {
        if(class0 == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap0 = this.b;
        s0 s00 = (s0)concurrentHashMap0.get(class0);
        if(s00 == null) {
            f0 f00 = this.a;
            f00.getClass();
            Class class1 = zzke.class;
            if(!class1.isAssignableFrom(class0) && (t0.a != null && !t0.a.isAssignableFrom(class0))) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            r0 r00 = f00.a.a(class0);
            if((r00.d & 2) == 2) {
                zzll zzll0 = r00.a;
                if(class1.isAssignableFrom(class0)) {
                    s00 = new l0(t0.d, V.a, zzll0);
                }
                else {
                    z0 z00 = t0.b;
                    U u0 = V.b;
                    if(u0 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    s00 = new l0(z00, u0, zzll0);
                }
            }
            else if(!class1.isAssignableFrom(class0)) {
                if(r00.b() == 1) {
                    a0 a00 = c0.a;
                    z0 z01 = t0.b;
                    U u1 = V.b;
                    if(u1 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    s00 = k0.x(r00, a00, z01, u1, h0.a);
                }
                else {
                    s00 = k0.x(r00, c0.a, t0.c, null, h0.a);
                }
            }
            else if(r00.b() == 1) {
                s00 = k0.x(r00, c0.b, t0.d, V.a, h0.b);
            }
            else {
                s00 = k0.x(r00, c0.b, t0.d, null, h0.b);
            }
            s0 s01 = (s0)concurrentHashMap0.putIfAbsent(class0, s00);
            return s01 == null ? s00 : s01;
        }
        return s00;
    }
}

