package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzhk extends zzfv {
    private static final Map zzb;
    protected zzjk zzc;
    private int zzd;

    static {
        zzhk.zzb = new ConcurrentHashMap();
    }

    public zzhk() {
        this.zzd = -1;
        this.zzc = zzjk.zzc();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzfv
    public final int a(I0 i00) {
        if(this.b()) {
            int v = i00.d(this);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        int v1 = this.zzd & 0x7FFFFFFF;
        if(v1 == 0x7FFFFFFF) {
            int v2 = i00.d(this);
            if(v2 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v2);
            }
            this.zzd = this.zzd & 0x80000000 | v2;
            return v2;
        }
        return v1;
    }

    public final boolean b() {
        return (this.zzd & 0x80000000) != 0;
    }

    public abstract Object c(int arg1);

    public final zzhg d() {
        return (zzhg)this.c(5);
    }

    public static zzhk e(Class class0) {
        Map map0 = zzhk.zzb;
        zzhk zzhk0 = (zzhk)map0.get(class0);
        if(zzhk0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzhk0 = (zzhk)map0.get(class0);
        }
        if(zzhk0 == null) {
            zzhk0 = (zzhk)((zzhk)R0.h(class0)).c(6);
            if(zzhk0 == null) {
                throw new IllegalStateException();
            }
            map0.put(class0, zzhk0);
            return zzhk0;
        }
        return zzhk0;
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
        return F0.c.a(class0).g(this, ((zzhk)object0));
    }

    public static Object f(Method method0, zzim zzim0, Object[] arr_object) {
        try {
            return method0.invoke(zzim0, arr_object);
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

    public final void g() {
        this.zzd &= 0x7FFFFFFF;
    }

    public static void h(Class class0, zzhk zzhk0) {
        zzhk0.g();
        zzhk.zzb.put(class0, zzhk0);
    }

    @Override
    public final int hashCode() {
        if(!this.b()) {
            int v = this.zza;
            if(v == 0) {
                Class class0 = this.getClass();
                v = F0.c.a(class0).f(this);
                this.zza = v;
            }
            return v;
        }
        Class class1 = this.getClass();
        return F0.c.a(class1).f(this);
    }

    // 去混淆评级： 低(25)
    public final void i() {
        this.zzd |= 0x7FFFFFFF;
    }

    public static final boolean j(zzhk zzhk0, boolean z) {
        int v = (byte)(((Byte)zzhk0.c(1)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        Class class0 = zzhk0.getClass();
        boolean z1 = F0.c.a(class0).a(zzhk0);
        if(z) {
            zzhk0.c(2);
        }
        return z1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(super.toString());
        A0.c(this, stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzim
    public final zzil zzI() {
        return (zzhg)this.c(5);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzim
    public final void zzJ(zzgr zzgr0) throws IOException {
        Class class0 = this.getClass();
        F0.c.a(class0).b(this, (zzgr0.a == null ? new k0(zzgr0) : zzgr0.a));
    }

    @Override  // com.google.android.gms.internal.play_billing.zzin
    public final zzim zzi() {
        return (zzhk)this.c(6);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzim
    public final int zzk() {
        int v;
        if(this.b()) {
            Class class0 = this.getClass();
            v = F0.c.a(class0).d(this);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else {
            v = this.zzd & 0x7FFFFFFF;
            if(v == 0x7FFFFFFF) {
                Class class1 = this.getClass();
                v = F0.c.a(class1).d(this);
                if(v < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v);
                }
                this.zzd = this.zzd & 0x80000000 | v;
                return v;
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzin
    public final boolean zzl() {
        return zzhk.j(this, true);
    }

    public final zzhg zzn() {
        zzhg zzhg0 = (zzhg)this.c(5);
        zzhg0.zze(this);
        return zzhg0;
    }
}

