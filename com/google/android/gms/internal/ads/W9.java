package com.google.android.gms.internal.ads;

public final class w9 implements H9 {
    public final int a;
    public static final w9 b;

    static {
        w9.b = new w9(0);
    }

    public w9(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.H9
    public final P9 a(Class class0) {
        if(this.a != 0) {
            throw new IllegalStateException("This should never be called.");
        }
        Class class1 = zzgkq.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (P9)zzgkq.e(class0.asSubclass(class1)).k(3, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.ads.H9
    public final boolean b(Class class0) {
        return this.a == 0 ? zzgkq.class.isAssignableFrom(class0) : false;
    }
}

