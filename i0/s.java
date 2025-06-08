package i0;

import Y.m;
import b0.e;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class s {
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;
    public static final String e;

    static {
        s.e = "WM-WorkTimer";
    }

    public s() {
        p p0 = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
        p0.a = 0;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(p0);
    }

    public final void a(String s, e e0) {
        synchronized(this.d) {
            m.d().a("WM-WorkTimer", "Starting timer for " + s, new Throwable[0]);
            this.b(s);
            r r0 = new r(this, s);
            this.b.put(s, r0);
            this.c.put(s, e0);
            this.a.schedule(r0, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String s) {
        synchronized(this.d) {
            if(((r)this.b.remove(s)) != null) {
                m.d().a("WM-WorkTimer", "Stopping timer for " + s, new Throwable[0]);
                this.c.remove(s);
            }
        }
    }
}

