package com.google.android.gms.internal.measurement;

public final class z implements zzki {
    public final int a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;
    public static final z f;

    static {
        z.b = new z(0);
        z.c = new z(1);
        z.d = new z(2);
        z.e = new z(3);
        z.f = new z(4);
    }

    public z(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzki
    public final boolean zza(int v) {
        switch(this.a) {
            case 0: {
                return zzep.zza(v) != 0;
            }
            case 1: {
                return zzew.zza(v) != 0;
            }
            case 2: {
                return v == 0 || v == 1 || (v == 2 || v == 3 || v == 4 || v == 5);
            }
            case 3: {
                return v == 1 || v == 2;
            }
            default: {
                return zzgw.zza(v) != 0;
            }
        }
    }
}

