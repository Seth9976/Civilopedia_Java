package com.google.android.gms.internal.measurement;

public final class f0 {
    public final e0 a;
    public static final Y b;

    static {
        f0.b = new Y(1);
    }

    public f0() {
        i0 i00;
        try {
            i00 = (i0)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            i00 = f0.b;
        }
        e0 e00 = new e0(new i0[]{Y.b, i00});
        super();
        this.a = e00;
    }
}

