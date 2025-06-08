package com.google.android.gms.internal.ads;

import N.n;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzgkq extends zzgir {
    private static final Map zzb;
    protected zzgnl zzc;
    protected int zzd;

    static {
        zzgkq.zzb = new ConcurrentHashMap();
    }

    public zzgkq() {
        this.zzc = zzgnl.zzc();
        this.zzd = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgir
    public final int a() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgir
    public final void c(int v) {
        this.zzd = v;
    }

    public static void d(zzgkq zzgkq0) {
        if(zzgkq0.zzaR()) {
            return;
        }
        zzglc zzglc0 = new zzgnj(zzgkq0).zza();
        zzglc0.zzh(zzgkq0);
        throw zzglc0;
    }

    public static zzgkq e(Class class0) {
        Map map0 = zzgkq.zzb;
        zzgkq zzgkq0 = (zzgkq)map0.get(class0);
        if(zzgkq0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzgkq0 = (zzgkq)map0.get(class0);
        }
        if(zzgkq0 == null) {
            zzgkq0 = (zzgkq)((zzgkq)ia.i(class0)).k(6, null);
            if(zzgkq0 == null) {
                throw new IllegalStateException();
            }
            map0.put(class0, zzgkq0);
            return zzgkq0;
        }
        return zzgkq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        Class class0 = this.getClass();
        return N9.c.a(class0).h(this, ((zzgkq)object0));
    }

    public static zzgkq f(zzgkq zzgkq0, zzgji zzgji0, zzgkc zzgkc0) {
        zzgjq zzgjq0 = zzgji0.zzl();
        zzgkq zzgkq1 = (zzgkq)zzgkq0.k(4, null);
        try {
            Class class0 = zzgkq1.getClass();
            T9 t90 = N9.c.a(class0);
            t90.g(zzgkq1, (zzgjq0.b == null ? new n(zzgjq0) : zzgjq0.b), zzgkc0);
            t90.zzf(zzgkq1);
        }
        catch(zzglc zzglc0) {
            if(zzglc0.j) {
                zzglc0 = new zzglc(zzglc0);
            }
            zzglc0.zzh(zzgkq1);
            throw zzglc0;
        }
        catch(zzgnj zzgnj0) {
            zzglc zzglc1 = zzgnj0.zza();
            zzglc1.zzh(zzgkq1);
            throw zzglc1;
        }
        catch(IOException iOException0) {
            if(iOException0.getCause() instanceof zzglc) {
                throw (zzglc)iOException0.getCause();
            }
            zzglc zzglc2 = new zzglc(iOException0);
            zzglc2.zzh(zzgkq1);
            throw zzglc2;
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof zzglc) {
                throw (zzglc)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            zzgjq0.zzz(0);
        }
        catch(zzglc zzglc3) {
            zzglc3.zzh(zzgkq1);
            throw zzglc3;
        }
        zzgkq.d(zzgkq1);
        return zzgkq1;
    }

    public static zzgkz g(zzgkz zzgkz0) {
        int v = zzgkz0.size();
        return v == 0 ? zzgkz0.zzd(10) : zzgkz0.zzd(v + v);
    }

    public static Object h(Method method0, zzgma zzgma0, Object[] arr_object) {
        try {
            return method0.invoke(zzgma0, arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
        }
    }

    @Override
    public final int hashCode() {
        int v = this.zza;
        if(v != 0) {
            return v;
        }
        Class class0 = this.getClass();
        int v1 = N9.c.a(class0).d(this);
        this.zza = v1;
        return v1;
    }

    public static void i(Class class0, zzgkq zzgkq0) {
        zzgkq.zzb.put(class0, zzgkq0);
    }

    public final zzgkm j() {
        return (zzgkm)this.k(5, null);
    }

    public abstract Object k(int arg1, zzgkq arg2);

    public static zzgkq l(zzgkq zzgkq0, byte[] arr_b, int v, zzgkc zzgkc0) {
        zzgkq zzgkq1 = (zzgkq)zzgkq0.k(4, null);
        try {
            Class class0 = zzgkq1.getClass();
            T9 t90 = N9.c.a(class0);
            t90.e(zzgkq1, arr_b, 0, v, new b9(zzgkc0));
            t90.zzf(zzgkq1);
            if(zzgkq1.zza != 0) {
                throw new RuntimeException();
            }
            return zzgkq1;
        }
        catch(zzglc zzglc0) {
            if(zzglc0.j) {
                zzglc0 = new zzglc(zzglc0);
            }
            zzglc0.zzh(zzgkq1);
            throw zzglc0;
        }
        catch(zzgnj zzgnj0) {
            zzglc zzglc1 = zzgnj0.zza();
            zzglc1.zzh(zzgkq1);
            throw zzglc1;
        }
        catch(IOException iOException0) {
            if(iOException0.getCause() instanceof zzglc) {
                throw (zzglc)iOException0.getCause();
            }
            zzglc zzglc2 = new zzglc(iOException0);
            zzglc2.zzh(zzgkq1);
            throw zzglc2;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            zzglc zzglc3 = zzglc.f();
            zzglc3.zzh(zzgkq1);
            throw zzglc3;
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(super.toString());
        h.N(this, stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzgma
    public final zzglz zzaL() {
        return (zzgkm)this.k(5, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzgma
    public final zzglz zzaM() {
        zzglz zzglz0 = (zzgkm)this.k(5, null);
        ((zzgkm)zzglz0).zzaj(this);
        return zzglz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgma
    public final void zzaQ(zzgjx zzgjx0) throws IOException {
        Class class0 = this.getClass();
        N9.c.a(class0).b(this, (zzgjx0.a == null ? new n9(zzgjx0) : zzgjx0.a));
    }

    public final boolean zzaR() {
        zzgkq zzgkq0 = null;
        switch(((byte)(((Byte)this.k(1, null))))) {
            case 0: {
                return false;
            }
            case 1: {
                return true;
            }
            default: {
                Class class0 = this.getClass();
                boolean z = N9.c.a(class0).a(this);
                if(z) {
                    zzgkq0 = this;
                }
                this.k(2, zzgkq0);
                return z;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgma
    public final int zzax() {
        int v = this.zzd;
        if(v == -1) {
            Class class0 = this.getClass();
            v = N9.c.a(class0).c(this);
            this.zzd = v;
        }
        return v;
    }

    public final zzgkm zzaz() {
        zzgkm zzgkm0 = (zzgkm)this.k(5, null);
        zzgkm0.zzaj(this);
        return zzgkm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgmb
    public final zzgma zzbh() {
        return (zzgkq)this.k(6, null);
    }
}

