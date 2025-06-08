package u1;

import android.util.Log;
import f2.J;
import java.util.concurrent.atomic.AtomicReference;
import s1.n;
import z1.S;

public final class b {
    public final n a;
    public final AtomicReference b;
    public static final c c;

    static {
        b.c = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public b(n n0) {
        this.b = new AtomicReference(null);
        this.a = n0;
        n0.a(new J(this, 5));
    }

    public final c a(String s) {
        b b0 = (b)this.b.get();
        return b0 == null ? b.c : b0.a(s);
    }

    public final boolean b() {
        b b0 = (b)this.b.get();
        return b0 != null && b0.b();
    }

    public final boolean c(String s) {
        b b0 = (b)this.b.get();
        return b0 != null && b0.c(s);
    }

    public final void d(String s, long v, S s1) {
        if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deferring native open session: " + s, null);
        }
        a a0 = new a(s, v, s1);
        this.a.a(a0);
    }
}

