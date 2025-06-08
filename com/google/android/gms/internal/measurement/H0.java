package com.google.android.gms.internal.measurement;

public abstract class h0 {
    public static final g0 a;
    public static final g0 b;

    static {
        g0 g00 = null;
        try {
            g00 = (g0)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        h0.a = g00;
        h0.b = new g0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

