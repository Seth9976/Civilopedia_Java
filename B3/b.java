package b3;

import J2.j;
import X2.Y;
import X2.b0;
import X2.c0;
import X2.d0;
import X2.h0;

public final class b extends h0 {
    public static final b l;

    static {
        b.l = new b("protected_and_package", true);  // 初始化器: LX2/h0;-><init>(Ljava/lang/String;Z)V
    }

    @Override  // X2.h0
    public final Integer a(h0 h00) {
        j.f(h00, "visibility");
        if(this.equals(h00)) {
            return 0;
        }
        if(h00 == Y.l) {
            return null;
        }
        return h00 != b0.l && h00 != c0.l ? -1 : 1;
    }

    @Override  // X2.h0
    public final String f() {
        return "protected/*protected and package*/";
    }

    @Override  // X2.h0
    public final h0 m() {
        return d0.l;
    }
}

