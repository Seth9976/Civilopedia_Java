package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class ia {
    public static final Unsafe a;
    public static final Class b;
    public static final ha c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
        Field field2;
        Field field1;
        boolean z4;
        boolean z3;
        Field field0;
        ha ha0;
        boolean z = false;
        Class class0 = Class.class;
        Unsafe unsafe0 = ia.k();
        ia.a = unsafe0;
        ia.b = a9.a();
        Class class1 = Long.TYPE;
        boolean z1 = ia.u(class1);
        boolean z2 = ia.u(Integer.TYPE);
        if(unsafe0 == null) {
            ha0 = null;
        }
        else if(z1) {
            ha0 = new ga(unsafe0);  // 初始化器: Lcom/google/android/gms/internal/ads/ha;-><init>(Lsun/misc/Unsafe;)V
        }
        else if(z2) {
            ha0 = new fa(unsafe0);  // 初始化器: Lcom/google/android/gms/internal/ads/ha;-><init>(Lsun/misc/Unsafe;)V
        }
        else {
            ha0 = null;
        }
        ia.c = ha0;
        Class class2 = ia.class;
        Class class3 = Buffer.class;
        Class class4 = Field.class;
        Class class5 = Object.class;
        if(ha0 == null) {
            z3 = false;
        }
        else {
            try {
                Class class6 = ha0.a.getClass();
                class6.getMethod("objectFieldOffset", class4);
                class6.getMethod("getLong", class5, class1);
                try {
                    field0 = null;
                    field0 = class3.getDeclaredField("effectiveDirectAddress");
                }
                catch(Throwable unused_ex) {
                }
                if(field0 == null) {
                    try {
                        field0 = null;
                        field0 = class3.getDeclaredField("address");
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(field0 == null) {
                        goto label_41;
                    }
                    else if(field0.getType() != Long.TYPE) {
                        field0 = null;
                    }
                }
                goto label_42;
            }
            catch(Throwable throwable0) {
                Logger.getLogger(class2.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable0.toString());
                z3 = false;
                goto label_48;
            }
            field0 = null;
            goto label_42;
        label_41:
            field0 = null;
        label_42:
            z3 = field0 == null ? false : true;
        }
    label_48:
        ia.d = z3;
        ha ha1 = ia.c;
        if(ha1 == null) {
            z4 = false;
        }
        else {
            try {
                Class class7 = ha1.a.getClass();
                class7.getMethod("objectFieldOffset", class4);
                class7.getMethod("arrayBaseOffset", class0);
                class7.getMethod("arrayIndexScale", class0);
                Class class8 = Long.TYPE;
                class7.getMethod("getInt", class5, class8);
                class7.getMethod("putInt", class5, class8, Integer.TYPE);
                class7.getMethod("getLong", class5, class8);
                class7.getMethod("putLong", class5, class8, class8);
                class7.getMethod("getObject", class5, class8);
                class7.getMethod("putObject", class5, class8, class5);
                z4 = true;
            }
            catch(Throwable throwable1) {
                Logger.getLogger(class2.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable1.toString());
                z4 = false;
            }
        }
        ia.e = z4;
        ia.f = (long)ia.a(byte[].class);
        ia.a(boolean[].class);
        ia.b(boolean[].class);
        ia.a(int[].class);
        ia.b(int[].class);
        ia.a(long[].class);
        ia.b(long[].class);
        ia.a(float[].class);
        ia.b(float[].class);
        ia.a(double[].class);
        ia.b(double[].class);
        ia.a(Object[].class);
        ia.b(Object[].class);
        try {
            field1 = null;
            field1 = class3.getDeclaredField("effectiveDirectAddress");
        }
        catch(Throwable unused_ex) {
        }
        if(field1 == null) {
            try {
                field1 = null;
                field1 = class3.getDeclaredField("address");
            }
            catch(Throwable unused_ex) {
            }
            field2 = field1 != null && field1.getType() == Long.TYPE ? field1 : null;
        }
        else {
            field2 = field1;
        }
        long v = -1L;
        if(field2 != null) {
            ha ha2 = ia.c;
            if(ha2 != null) {
                v = ha2.n(field2);
            }
        }
        ia.g = v;
        if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        ia.h = z;
    }

    // 去混淆评级： 低(20)
    public static int a(Class class0) {
        return ia.e ? ia.c.j(class0) : -1;
    }

    public static void b(Class class0) {
        if(ia.e) {
            ia.c.k(class0);
        }
    }

    public static void c(Object object0, long v, byte b) {
        int v1 = ia.c.l(-4L & v, object0);
        int v2 = (~((int)v) & 3) << 3;
        ia.c.p(object0, -4L & v, (0xFF & b) << v2 | v1 & ~(0xFF << v2));
    }

    public static void d(Object object0, long v, byte b) {
        int v1 = ia.c.l(-4L & v, object0);
        int v2 = (((int)v) & 3) << 3;
        ia.c.p(object0, -4L & v, (0xFF & b) << v2 | v1 & ~(0xFF << v2));
    }

    public static double e(long v, Object object0) {
        return ia.c.b(v, object0);
    }

    public static float f(long v, Object object0) {
        return ia.c.c(v, object0);
    }

    public static int g(zzgir zzgir0, long v) {
        return ia.c.l(v, zzgir0);
    }

    public static long h(zzgir zzgir0, long v) {
        return ia.c.m(v, zzgir0);
    }

    public static Object i(Class class0) {
        try {
            return ia.a.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    public static Object j(long v, Object object0) {
        return ia.c.o(v, object0);
    }

    public static Unsafe k() {
        try {
            return (Unsafe)AccessController.doPrivileged(new ea());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void l(Object object0, long v, boolean z) {
        ia.c.e(object0, v, z);
    }

    public static void m(byte[] arr_b, long v, byte b) {
        ia.c.f(arr_b, ia.f + v, b);
    }

    public static void n(Object object0, long v, double f) {
        ia.c.g(object0, v, f);
    }

    public static void o(Object object0, long v, float f) {
        ia.c.h(object0, v, f);
    }

    public static void p(Object object0, long v, int v1) {
        ia.c.p(object0, v, v1);
    }

    public static void q(Object object0, long v, long v1) {
        ia.c.q(object0, v, v1);
    }

    public static void r(long v, Object object0, Object object1) {
        ia.c.r(v, object0, object1);
    }

    public static boolean s(long v, Object object0) {
        return ((byte)(ia.c.l(-4L & v, object0) >>> ((int)((~v & 3L) << 3)) & 0xFF)) != 0;
    }

    public static boolean t(long v, Object object0) {
        return ((byte)(ia.c.l(-4L & v, object0) >>> ((int)((v & 3L) << 3)) & 0xFF)) != 0;
    }

    public static boolean u(Class class0) {
        try {
            Class class1 = Boolean.TYPE;
            ia.b.getMethod("peekLong", class0, class1);
            ia.b.getMethod("pokeLong", class0, Long.TYPE, class1);
            Class class2 = Integer.TYPE;
            ia.b.getMethod("pokeInt", class0, class2, class1);
            ia.b.getMethod("peekInt", class0, class1);
            ia.b.getMethod("pokeByte", class0, Byte.TYPE);
            ia.b.getMethod("peekByte", class0);
            ia.b.getMethod("pokeByteArray", class0, byte[].class, class2, class2);
            ia.b.getMethod("peekByteArray", class0, byte[].class, class2, class2);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static boolean v(long v, Object object0) {
        return ia.c.i(v, object0);
    }
}

