package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzke extends zzin {
    private static final Map zza;
    protected zzmo zzc;
    protected int zzd;

    static {
        zzke.zza = new ConcurrentHashMap();
    }

    public zzke() {
        this.zzc = zzmo.zzc();
        this.zzd = -1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzin
    public final int a() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.measurement.zzin
    public final void c(int v) {
        this.zzd = v;
    }

    public static zzkl d(zzkl zzkl0) {
        int v = zzkl0.size();
        return v == 0 ? zzkl0.zzd(10) : zzkl0.zzd(v + v);
    }

    public static Object e(Method method0, zzll zzll0, Object[] arr_object) {
        try {
            return method0.invoke(zzll0, arr_object);
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
        return p0.c.a(class0).f(this, ((zzke)object0));
    }

    public static void f(Class class0, zzke zzke0) {
        zzke.zza.put(class0, zzke0);
    }

    public final zzka g() {
        return (zzka)this.i(5);
    }

    public static zzke h(Class class0) {
        Map map0 = zzke.zza;
        zzke zzke0 = (zzke)map0.get(class0);
        if(zzke0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzke0 = (zzke)map0.get(class0);
        }
        if(zzke0 == null) {
            zzke0 = (zzke)((zzke)F0.h(class0)).i(6);
            if(zzke0 == null) {
                throw new IllegalStateException();
            }
            map0.put(class0, zzke0);
            return zzke0;
        }
        return zzke0;
    }

    @Override
    public final int hashCode() {
        int v = this.zzb;
        if(v != 0) {
            return v;
        }
        Class class0 = this.getClass();
        int v1 = p0.c.a(class0).d(this);
        this.zzb = v1;
        return v1;
    }

    public abstract Object i(int arg1);

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(super.toString());
        j0.h(this, stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public final zzlk zzbF() {
        return (zzka)this.i(5);
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public final zzlk zzbG() {
        zzlk zzlk0 = (zzka)this.i(5);
        ((zzka)zzlk0).zzaC(this);
        return zzlk0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public final void zzbK(zzjl zzjl0) throws IOException {
        Class class0 = this.getClass();
        p0.c.a(class0).c(this, (zzjl0.a == null ? new S(zzjl0) : zzjl0.a));
    }

    @Override  // com.google.android.gms.internal.measurement.zzlm
    public final zzll zzbO() {
        return (zzke)this.i(6);
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public final int zzbw() {
        int v = this.zzd;
        if(v == -1) {
            Class class0 = this.getClass();
            v = p0.c.a(class0).zza(this);
            this.zzd = v;
        }
        return v;
    }

    public final zzka zzby() {
        zzka zzka0 = (zzka)this.i(5);
        zzka0.zzaC(this);
        return zzka0;
    }
}

