package m;

import android.os.Looper;
import l1.h;

public final class a extends o1.a {
    public b c;
    public static volatile a d;
    public static final h e;

    static {
        a.e = new h(1);
    }

    public static a o0() {
        if(a.d != null) {
            return a.d;
        }
        synchronized(a.class) {
            if(a.d == null) {
                a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
                a0.c = new b();
                a.d = a0;
            }
            return a.d;
        }
    }

    public final void p0(Runnable runnable0) {
        b b0 = this.c;
        if(b0.e == null) {
            synchronized(b0.c) {
                if(b0.e == null) {
                    b0.e = b.o0(Looper.getMainLooper());
                }
            }
        }
        b0.e.post(runnable0);
    }
}

