package b3;

import J2.j;
import X2.b0;
import X2.c0;
import X2.d0;
import X2.h0;

public final class a extends h0 {
    public static final a l;

    static {
        a.l = new a("package", false);  // 初始化器: LX2/h0;-><init>(Ljava/lang/String;Z)V
    }

    @Override  // X2.h0
    public final Integer a(h0 h00) {
        j.f(h00, "visibility");
        if(this == h00) {
            return 0;
        }
        return h00 == b0.l || h00 == c0.l ? 1 : -1;
    }

    @Override  // X2.h0
    public final String f() {
        return "public/*package*/";
    }

    @Override  // X2.h0
    public final h0 m() {
        return d0.l;
    }
}

