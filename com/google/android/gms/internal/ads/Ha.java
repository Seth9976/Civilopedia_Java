package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class ha {
    public final Unsafe a;

    public ha(Unsafe unsafe0) {
        this.a = unsafe0;
    }

    public abstract byte a(long arg1);

    public abstract double b(long arg1, Object arg2);

    public abstract float c(long arg1, Object arg2);

    public abstract void d(long arg1, byte[] arg2, long arg3, long arg4);

    public abstract void e(Object arg1, long arg2, boolean arg3);

    public abstract void f(Object arg1, long arg2, byte arg3);

    public abstract void g(Object arg1, long arg2, double arg3);

    public abstract void h(Object arg1, long arg2, float arg3);

    public abstract boolean i(long arg1, Object arg2);

    public final int j(Class class0) {
        return this.a.arrayBaseOffset(class0);
    }

    public final int k(Class class0) {
        return this.a.arrayIndexScale(class0);
    }

    public final int l(long v, Object object0) {
        return this.a.getInt(object0, v);
    }

    public final long m(long v, Object object0) {
        return this.a.getLong(object0, v);
    }

    public final long n(Field field0) {
        return this.a.objectFieldOffset(field0);
    }

    public final Object o(long v, Object object0) {
        return this.a.getObject(object0, v);
    }

    public final void p(Object object0, long v, int v1) {
        this.a.putInt(object0, v, v1);
    }

    public final void q(Object object0, long v, long v1) {
        this.a.putLong(object0, v, v1);
    }

    public final void r(long v, Object object0, Object object1) {
        this.a.putObject(object0, v, object1);
    }
}

