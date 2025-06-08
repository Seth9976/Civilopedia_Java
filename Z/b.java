package Z;

import A.c;
import A.f;
import B.o;
import Y.g;
import Y.m;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import h0.i;
import i0.j;
import j0.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class b implements a {
    public PowerManager.WakeLock i;
    public final Context j;
    public final Y.b k;
    public final B1.a l;
    public final WorkDatabase m;
    public final HashMap n;
    public final HashMap o;
    public final List p;
    public final HashSet q;
    public final ArrayList r;
    public final Object s;
    public static final String t;

    static {
        b.t = "WM-Processor";
    }

    public b(Context context0, Y.b b0, B1.a a0, WorkDatabase workDatabase0, List list0) {
        this.j = context0;
        this.k = b0;
        this.l = a0;
        this.m = workDatabase0;
        this.o = new HashMap();
        this.n = new HashMap();
        this.p = list0;
        this.q = new HashSet();
        this.r = new ArrayList();
        this.i = null;
        this.s = new Object();
    }

    @Override  // Z.a
    public final void a(String s, boolean z) {
        synchronized(this.s) {
            this.o.remove(s);
            m.d().a("WM-Processor", "b " + s + " executed; reschedule = " + z, new Throwable[0]);
            for(Object object1: this.r) {
                ((a)object1).a(s, z);
            }
        }
    }

    public final void b(a a0) {
        synchronized(this.s) {
            this.r.add(a0);
        }
    }

    public static boolean c(String s, l l0) {
        boolean z;
        if(l0 != null) {
            l0.A = true;
            l0.h();
            n1.a a0 = l0.z;
            if(a0 == null) {
                z = false;
            }
            else {
                z = ((h)a0).isDone();
                ((h)l0.z).cancel(true);
            }
            ListenableWorker listenableWorker0 = l0.n;
            if(listenableWorker0 == null || z) {
                i i0 = l0.m;
                m.d().a("WM-WorkerWrapper", "WorkSpec " + i0 + " is already done. Not interrupting.", new Throwable[0]);
            }
            else {
                listenableWorker0.stop();
            }
            m.d().a("WM-Processor", "WorkerWrapper interrupted for " + s, new Throwable[0]);
            return true;
        }
        m.d().a("WM-Processor", "WorkerWrapper could not be found for " + s, new Throwable[0]);
        return false;
    }

    public final boolean d(String s) {
        synchronized(this.s) {
        }
        return this.q.contains(s);
    }

    public final boolean e(String s) {
        synchronized(this.s) {
            return this.o.containsKey(s) || this.n.containsKey(s);
        }
    }

    public final void f(a a0) {
        synchronized(this.s) {
            this.r.remove(a0);
        }
    }

    public final void g(String s, g g0) {
        synchronized(this.s) {
            m.d().e("WM-Processor", "Moving WorkSpec (" + s + ") to the foreground", new Throwable[0]);
            l l0 = (l)this.o.remove(s);
            if(l0 != null) {
                if(this.i == null) {
                    PowerManager.WakeLock powerManager$WakeLock0 = j.a(this.j, "ProcessorForegroundLck");
                    this.i = powerManager$WakeLock0;
                    powerManager$WakeLock0.acquire();
                }
                this.n.put(s, l0);
                Intent intent0 = g0.a.d(this.j, s, g0);
                v.j.startForegroundService(this.j, intent0);
            }
        }
    }

    public final boolean h(String s, B1.a a0) {
        l l0;
        synchronized(this.s) {
            if(this.e(s)) {
                m.d().a("WM-Processor", "Work " + s + " is already enqueued for processing", new Throwable[0]);
                return false;
            }
            Y.b b0 = this.k;
            B1.a a1 = this.l;
            WorkDatabase workDatabase0 = this.m;
            B1.a a2 = new B1.a();
            Context context0 = this.j.getApplicationContext();
            List list0 = this.p;
            if(a0 == null) {
                a0 = a2;
            }
            l0 = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
            l0.p = new Y.i();
            l0.y = new j0.j();  // 初始化器: Ljava/lang/Object;-><init>()V
            l0.z = null;
            l0.i = context0;
            l0.o = a1;
            l0.r = this;
            l0.j = s;
            l0.k = list0;
            l0.l = a0;
            l0.n = null;
            l0.q = b0;
            l0.s = workDatabase0;
            l0.t = workDatabase0.n();
            l0.u = workDatabase0.i();
            l0.v = workDatabase0.o();
            j0.j j0 = l0.y;
            o o0 = new o(5);
            o0.j = this;
            o0.k = s;
            o0.l = j0;
            j0.b(o0, ((c)this.l.l));
            this.o.put(s, l0);
        }
        ((i0.h)this.l.j).execute(l0);
        m.d().a("WM-Processor", f.i("b", ": processing ", s), new Throwable[0]);
        return true;
    }

    public final void i() {
        synchronized(this.s) {
            if(this.n.isEmpty()) {
                Intent intent0 = new Intent(this.j, SystemForegroundService.class);
                intent0.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.j.startService(intent0);
                }
                catch(Throwable throwable0) {
                    m.d().b("WM-Processor", "Unable to stop foreground service", new Throwable[]{throwable0});
                }
                PowerManager.WakeLock powerManager$WakeLock0 = this.i;
                if(powerManager$WakeLock0 != null) {
                    powerManager$WakeLock0.release();
                    this.i = null;
                }
            }
        }
    }

    public final boolean j(String s) {
        synchronized(this.s) {
            m.d().a("WM-Processor", "Processor stopping foreground work " + s, new Throwable[0]);
        }
        return b.c(s, ((l)this.n.remove(s)));
    }

    public final boolean k(String s) {
        synchronized(this.s) {
            m.d().a("WM-Processor", "Processor stopping background work " + s, new Throwable[0]);
        }
        return b.c(s, ((l)this.o.remove(s)));
    }
}

