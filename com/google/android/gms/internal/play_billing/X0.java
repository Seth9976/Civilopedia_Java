package com.google.android.gms.internal.play_billing;

public final class x0 implements z0 {
    public final Object a;
    public static final n0 b;

    static {
        x0.b = new n0(4);
    }

    public x0() {
        x0 x00 = new x0(new z0[]{n0.b, x0.b});
        super();
        this.a = x00;
    }

    public x0(z0[] arr_z0) {
        this.a = arr_z0;
    }

    @Override  // com.google.android.gms.internal.play_billing.z0
    public H0 a(Class class0) {
        for(int v = 0; v < 2; ++v) {
            z0 z00 = ((z0[])this.a)[v];
            if(z00.b(class0)) {
                return z00.a(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.play_billing.z0
    public boolean b(Class class0) {
        for(int v = 0; v < 2; ++v) {
            if(((z0[])this.a)[v].b(class0)) {
                return true;
            }
        }
        return false;
    }
}

