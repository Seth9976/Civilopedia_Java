package com.google.android.gms.internal.play_billing;

public final class n0 implements z0 {
    public final int a;
    public static final n0 b;

    static {
        n0.b = new n0(1);
    }

    public n0(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.gms.internal.play_billing.z0
    public H0 a(Class class0) {
        if(this.a != 1) {
            throw new IllegalStateException("This should never be called.");
        }
        Class class1 = zzhk.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (H0)zzhk.e(class0.asSubclass(class1)).c(3);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.play_billing.z0
    public boolean b(Class class0) {
        return this.a == 1 ? zzhk.class.isAssignableFrom(class0) : false;
    }

    public static final zzig c(Object object0, Object object1) {
        zzig zzig0 = (zzig)object0;
        if(!((zzig)object1).isEmpty()) {
            if(!zzig0.zze()) {
                zzig0 = zzig0.zzb();
            }
            zzig0.zzd(((zzig)object1));
        }
        return zzig0;
    }

    public static void d(Object object0) {
        ((zzhh)object0).zzb.c();
    }

    public static void e(Object object0) {
        ((zzhk)object0).zzc.zzh();
    }
}

