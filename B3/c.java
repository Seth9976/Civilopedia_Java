package b3;

import X2.d0;
import X2.h0;

public final class c extends h0 {
    public static final c l;

    static {
        c.l = new c("protected_static", true);  // 初始化器: LX2/h0;-><init>(Ljava/lang/String;Z)V
    }

    @Override  // X2.h0
    public final String f() {
        return "protected/*protected static*/";
    }

    @Override  // X2.h0
    public final h0 m() {
        return d0.l;
    }
}

