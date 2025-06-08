package com.google.android.gms.internal.ads;

public abstract class r9 {
    public static final q9 a;
    public static final q9 b;

    static {
        r9.a = new q9();  // 初始化器: Ljava/lang/Object;-><init>()V
        q9 q90 = null;
        try {
            q90 = (q9)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        r9.b = q90;
    }
}

