package N;

import D.c;
import E.h;

public final class b0 {
    public int a;
    public h b;
    public h c;
    public static final c d;

    static {
        b0.d = new c(20);
    }

    public static b0 a() {
        b0 b00 = (b0)b0.d.a();
        return b00 == null ? new b0() : b00;  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

